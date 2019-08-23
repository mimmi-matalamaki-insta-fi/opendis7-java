/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nps.moves.dis7;

import edu.nps.moves.dis7.enumerations.ActionResponseRequestStatus;
import edu.nps.moves.dis7.enumerations.VariableRecordType;
import edu.nps.moves.dis7.util.DisNetworking;
import edu.nps.moves.dis7.util.PduFactory;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mike
 */
public class DataQueryPduRoundTrip
{
  
  public DataQueryPduRoundTrip()
  {
  }
  
  @BeforeAll
  public static void setUpClass()
  {
  }
  
  @AfterAll
  public static void tearDownClass()
  {
  }
  
  @BeforeEach
  public void setUp()
  {
  }
  
  @AfterEach
  public void tearDown()
  {
  }

  private static int REQUEST_ID = 0x00112233;
  private static int TIME_INTERVAL = 0x15151515;

  private static FixedDatum fixedDatum1 = new FixedDatum();  
  private static int fixedDatum1Value = 0x111111FF;
  private static VariableRecordType fixedDatum1VarRecordType = VariableRecordType.$120_MM_HEAT_QUANTITY;
  private static FixedDatum fixedDatum2 = new FixedDatum();
  private static int fixedDatum2Value = 0x222222FF;
  private static VariableRecordType fixedDatum2VarRecordType = VariableRecordType.ACCELERATION;
  private static FixedDatum fixedDatum3 = new FixedDatum();
  private static int fixedDatum3Value = 0x333333FF;
  private static VariableRecordType fixedDatum3VarRecordType = VariableRecordType.NUMBER_OF_INTERCEPTORS_FIRED;
  
  private static VariableDatum variableDatum1 = new VariableDatum();
  private static VariableRecordType variableDatum1Type = VariableRecordType.ADA_SHOOTING_STATUS;
  private static byte[] variableDatum1Value = new String("varDatum1Value111").getBytes();
  
  private static VariableDatum variableDatum2 = new VariableDatum();
  private static VariableRecordType variableDatum2Type = VariableRecordType.ORDER_STATUS;
  private static byte[] variableDatum2Value = new String("222varDatum1Value222").getBytes();

  static {
    fixedDatum1.setFixedDatumValue(fixedDatum1Value);
    fixedDatum1.setFixedDatumID(fixedDatum1VarRecordType);
    
    fixedDatum2.setFixedDatumValue(fixedDatum2Value);
    fixedDatum2.setFixedDatumID(fixedDatum2VarRecordType);
    
    fixedDatum3.setFixedDatumValue(fixedDatum3Value);
    fixedDatum3.setFixedDatumID(fixedDatum3VarRecordType);
    
    variableDatum1.setVariableDatumID(variableDatum1Type);
    variableDatum1.setVariableDatumValue(variableDatum1Value);
   // variableDatum1.setVariableDatumLength(variableDatum1Value.length);  // should be done automatically
    
    variableDatum2.setVariableDatumID(variableDatum2Type);
    variableDatum2.setVariableDatumValue(variableDatum2Value);
  //  variableDatum2.setVariableDatumLength(variableDatum2Value.length);  // should be done automatically
 }
  
  private Pdu receivedPdu;
  private Object waiter = new Object();
  
   @Test
   public void TestRoundTrip()
   {
     PduFactory factory = new PduFactory();
     
     DataQueryPdu sendingPdu = factory.makeDataQueryPdu();
     sendingPdu.setRequestID(REQUEST_ID);
     sendingPdu.setTimeInterval(TIME_INTERVAL);
     
     sendingPdu.getFixedDatums().add(fixedDatum1);
     sendingPdu.getFixedDatums().add(fixedDatum2);
     sendingPdu.getFixedDatums().add(fixedDatum3);
     
     sendingPdu.getVariableDatums().add(variableDatum1);
     sendingPdu.getVariableDatums().add(variableDatum2);
     
     setUpReceiver();
     
     try {
       Thread.sleep(250l); // make sure receiver is listening
       new DisNetworking().sendPdu(sendingPdu);
       Thread.sleep(1000l); //(180*1000l));//waiter.wait();
     }
     catch(Exception ex) {
         System.err.println("Error sending Multicast: "+ex.getLocalizedMessage());
         System.exit(1);
     }
    
    // Compare
    // If we made it this far, we've sent and received.  Now compare.
    if(receivedPdu.equalsImpl(sendingPdu))
      System.out.println("passed test");
    else
      System.err.println("failed test");
   }
   
   private void setUpReceiver()
   {
     Thread rcvThread = new Thread( ()->{
       try {
         receivedPdu = new DisNetworking().receivePdu();  // blocks
       }
       catch(IOException ex) {
         System.err.println("Error receiving Multicast: "+ex.getLocalizedMessage());
         System.exit(1);
       }
    //   waiter.notify();
     });
     
     rcvThread.setPriority(Thread.NORM_PRIORITY);
     rcvThread.setDaemon(true);
     rcvThread.start();
   }
   
   public static void main(String[] args)
   {
     new DataQueryPduRoundTrip().TestRoundTrip();
   }
}
