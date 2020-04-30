package edu.nps.moves.dis7.utilities.stream;

import com.google.common.primitives.Longs;
import edu.nps.moves.dis7.utilities.DisNetworking;
import edu.nps.moves.dis7.utilities.DisThreadedNetIF;
import edu.nps.moves.dis7.utilities.PduFactory;
import org.apache.commons.io.FilenameUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;

public class PduRecorder implements PduReceiver
{
  static String DEFAULT_OUTDIR = "./pdulog";
  static String DEFAULT_FILEPREFIX = "Pdusave"; // TODO better name
  static String DISLOG_FILE_EXTENSION = ".dislog";
  
  static String DEFAULT_MCAST = "230.0.0.0";
  static int    DEFAULT_PORT = 3000;
 
  public static final String COMMENT_MARKER = "#";
  static String  START_COMMENT_MARKER = COMMENT_MARKER + " Start,  ";
  static String FINISH_COMMENT_MARKER = COMMENT_MARKER + " Finish, ";

  private BufferedWriter bufferedWriter;
  private File           logFile;
  
  private DisThreadedNetIF disnetworking;
  
  public PduRecorder() throws IOException
  {
    this(DEFAULT_OUTDIR,DEFAULT_MCAST,DEFAULT_PORT);
  }
  
  public PduRecorder(String outputDir, String mcastaddr, int port) throws IOException
  {
    logFile = makeFile(new File(outputDir).toPath(), DEFAULT_FILEPREFIX+DISLOG_FILE_EXTENSION );
    bufferedWriter = new BufferedWriter(new FileWriter(logFile));
    
    disnetworking = new DisThreadedNetIF(port, mcastaddr);
    disnetworking.addRawListener(bAndL->receivePdu(bAndL.buff,bAndL.length));
  }
  
  public void startResume()
  {
    doSave = true;
  }
  
  public void stopPause()
  {
    doSave = false;
  }
  
  public String getOutputFile()
  {
    if(logFile != null)
      return logFile.getAbsolutePath();
    return null;
  }
  
  public File end() throws IOException
  {
    disnetworking.kill();

    writeFooter();
    bufferedWriter.flush();
    bufferedWriter.close();
    System.out.println();
    System.out.println("Recorder log file closed: " + logFile.getPath());
    return logFile;
  }
 
  Long startNanoTime = null;
  StringBuilder sb = new StringBuilder();
  Base64.Encoder base64Encoder = Base64.getEncoder();
  int pduCount = 0;
  boolean headerWritten = false;
  boolean doSave = true;
  
  @Override
  public void receivePdu(byte[] buff, int len)
  {
    if(!doSave)
      return;
    
    long packetRcvNanoTime = System.nanoTime();
    if (startNanoTime == null)
        startNanoTime = packetRcvNanoTime;

    byte[] timeByteArray = Longs.toByteArray(packetRcvNanoTime - startNanoTime);
    //System.out.println("wrote time "+(packetRcvNanoTime - startNanoTime));

    sb.setLength(0);
    sb.append(base64Encoder.encodeToString(timeByteArray));
    sb.append(',');
    byte[] buffsized = Arrays.copyOf(buff, len);
    sb.append(base64Encoder.encodeToString(buffsized)); // TODO offer alternative encodings
    try {
      if (!headerWritten) {
        writeHeader();
        headerWritten = true;
      }
      bufferedWriter.write(sb.toString());
      bufferedWriter.newLine();
    }
    catch (IOException ex) {
      System.err.println("Fatal exception writing DIS log file in Recorder.start()");
      throw new RuntimeException(ex);
    }
    //System.out.println("Recorder: "+ ++pduCount);

    sb.setLength(0);
  }
  
  public String getLogFile()
  {
    return logFile.getAbsolutePath();
  }
  
  private void writeHeader() throws IOException
  {
//    String template = ", DIS capture file %s.";
//    String startComment = String.format(template, logFile.getName() + " (show transient progressing PDU count, then final total)");
      
    // https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    
    bufferedWriter.write( START_COMMENT_MARKER + timeStamp + ", DIS capture file, " + logFile.getPath());
    bufferedWriter.newLine();
  }

  private void writeFooter() throws IOException
  {
//    String template = ", DIS capture file, %s.";
//    String endComment = String.format(template, logFile.getPath());
      
    // https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    
    bufferedWriter.write(FINISH_COMMENT_MARKER + timeStamp + ", DIS capture file, " + logFile.getPath());
    bufferedWriter.newLine();
  }

  private File makeFile(Path outputDir, String filename) throws IOException
  {
    String bname = FilenameUtils.getBaseName(filename);
    String ext = FilenameUtils.getExtension(filename);

    Integer count = null;
    File f;
    boolean fileExists;
    outputDir.toFile().mkdirs();
    do {
      String fn = bname + (count == null ? "" : count) + "." + ext;
      f = new File(outputDir.toFile(), fn);
      fileExists = f.exists();
      if (count == null)
        count = 1;
      else
        count++;
    } while (fileExists);
    if (!f.createNewFile()) {
      System.out.println("Cannot create dis log file at " + f.getAbsolutePath());
      throw new RuntimeException("File creation error");
    }
    return f;
  }
  
  /** Invocation
    * @param args none supported, TODO offer path/filename
   */
  public static void main(String[] args)
  {
    PduFactory factory = new PduFactory(); //default appid, country, etc.
    DisNetworking disnet = new DisNetworking(); // default ip and port
    
    Path path = new File("./pdulog").toPath();
    String filename = "Pdusave";
    
    PduRecorder recorder;
    try{recorder = new PduRecorder();} catch(IOException ex) {
      System.err.println("Exception creating recorder: "+ex.getLocalizedMessage());
      return;
    }
     
//    // self test
//    DISPDUType all[] = DISPDUType.values();
//    Arrays.stream(all).forEach(typ-> {
//      if(typ != DISPDUType.OTHER) {
//        try {
//          Pdu pdu = factory.createPdu(typ);
//          disnet.sendPdu(pdu);
//          sleep(100);
//        }
//        catch(Exception ex) {
//          System.err.println("Exception sending Pdu: "+ex.getLocalizedMessage());
//        }
//      }
//      });

    System.out.println("Record for 10 seconds..."); // TODO arrrrgh this is awful
    sleep(10000);
    System.out.println("Recording complete."); 
    
    try {
      recorder.end();
    }
    catch(IOException ex) {
      System.err.println("Exception closing recorder: "+ex.getClass().getSimpleName()+": "+ex.getLocalizedMessage());
    }
  }
  
  private static void sleep(long ms)
  {
    try{
        Thread.sleep(ms);}
    catch(InterruptedException ex) {
    }
  }
}