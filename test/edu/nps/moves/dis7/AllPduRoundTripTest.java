/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
package edu.nps.moves.dis7;

/**
 * This is a test class (which can also be run through its main() method) which tests round-tripping of pdus, i.e.,
 * creating a pdu instance in java, serializing it and sending over the network as a stream of bytes, at the same time
 * reading them back from the net.  It also uses the pdu logger in the Player class to  save the received pdus to disk.
 * 
 * Two tests for pdu equivalency are performed:
 * 1.  Sent vs. received
 * 2.  Sent vs. persisted
 * 
 * @author Mike Bailey, jmbailey@edu.nps.edu
 * @version $Id$
 */
import com.google.common.io.Files;
import edu.nps.moves.dis7.enumerations.Country;
import edu.nps.moves.dis7.enumerations.DISPDUType;
import edu.nps.moves.dis7.utilities.DisThreadedNetIF;
import edu.nps.moves.dis7.utilities.PduFactory;
import edu.nps.moves.dis7.utilities.stream.PduPlayer;
import edu.nps.moves.dis7.utilities.stream.PduRecorder;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("All Pdu Round Trip Test")

public class AllPduRoundTripTest
{
  private PduFactory pduFactory;

  @BeforeAll
  public static void beforeAllTests()
  {
    System.out.println("AllPduRoundTripTest");
  }

  @AfterAll
  public static void afterAllTests()
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

  @Test
  public void testRoundTripAllPdus()
  {
    Throwable ex = null;
    try {
      setupRecorder();
      setupSender();
      sleep(250L); // these have to be fully setup before continuing
      
      pduFactory = new PduFactory(Country.PHILIPPINES_PHL, (byte) 11, (byte) 22, (short) 33, true);

      sendOnePdu(pduFactory.makeAcknowledgePdu());
      sendOnePdu(pduFactory.makeAcknowledgeReliablePdu());
      sendOnePdu(pduFactory.makeActionRequestPdu());
      sendOnePdu(pduFactory.makeActionRequestReliablePdu());
      sendOnePdu(pduFactory.makeActionResponsePdu());
      sendOnePdu(pduFactory.makeActionResponseReliablePdu());
      sendOnePdu(pduFactory.makeAggregateStatePdu());
      sendOnePdu(pduFactory.makeAppearancePdu());
      sendOnePdu(pduFactory.makeArealObjectStatePdu());
      sendOnePdu(pduFactory.makeArticulatedPartsPdu());
      sendOnePdu(pduFactory.makeAttributePdu());
      sendOnePdu(pduFactory.makeCollisionElasticPdu());
      sendOnePdu(pduFactory.makeCollisionPdu());
      sendOnePdu(pduFactory.makeCommentPdu());
      sendOnePdu(pduFactory.makeCommentReliablePdu());
      sendOnePdu(pduFactory.makeCreateEntityPdu());
      sendOnePdu(pduFactory.makeCreateEntityReliablePdu());
      sendOnePdu(pduFactory.makeDataPdu());
      sendOnePdu(pduFactory.makeDataQueryPdu());
      sendOnePdu(pduFactory.makeDataQueryReliablePdu());
      sendOnePdu(pduFactory.makeDataReliablePdu());
      sendOnePdu(pduFactory.makeDesignatorPdu());
      sendOnePdu(pduFactory.makeDetonationPdu());
      sendOnePdu(pduFactory.makeDirectedEnergyFirePdu());
      sendOnePdu(pduFactory.makeElectronicEmissionsPdu());
      sendOnePdu(pduFactory.makeEntityDamageStatusPdu());
      sendOnePdu(pduFactory.makeEntityStatePdu());
      sendOnePdu(pduFactory.makeEntityStateUpdatePdu());
      sendOnePdu(pduFactory.makeEnvironmentalProcessPdu());
      sendOnePdu(pduFactory.makeEventReportPdu());
      sendOnePdu(pduFactory.makeEventReportReliablePdu());
      sendOnePdu(pduFactory.makeFirePdu());
      sendOnePdu(pduFactory.makeGriddedDataPdu());
      sendOnePdu(pduFactory.makeIffPdu());
      sendOnePdu(pduFactory.makeInformationOperationsReportPdu());
      sendOnePdu(pduFactory.makeInformationOperationsActionPdu());
      sendOnePdu(pduFactory.makeIntercomControlPdu());
      sendOnePdu(pduFactory.makeIntercomSignalPdu());
      sendOnePdu(pduFactory.makeIsGroupOfPdu());
      sendOnePdu(pduFactory.makeIsPartOfPdu());
      sendOnePdu(pduFactory.makeLEDetonationPdu());
      sendOnePdu(pduFactory.makeLEFirePdu());
      sendOnePdu(pduFactory.makeLinearObjectStatePdu());
      sendOnePdu(pduFactory.makeMinefieldDataPdu());
      sendOnePdu(pduFactory.makeMinefieldQueryPdu());
      sendOnePdu(pduFactory.makeMinefieldResponseNackPdu());
      sendOnePdu(pduFactory.makeMinefieldStatePdu());
      sendOnePdu(pduFactory.makePointObjectStatePdu());
      sendOnePdu(pduFactory.makeReceiverPdu());
      sendOnePdu(pduFactory.makeRecordQueryReliablePdu());
      sendOnePdu(pduFactory.makeRecordReliablePdu());
      sendOnePdu(pduFactory.makeRemoveEntityPdu());
      sendOnePdu(pduFactory.makeRemoveEntityReliablePdu());
      sendOnePdu(pduFactory.makeRepairCompletePdu());
      sendOnePdu(pduFactory.makeRepairResponsePdu());
      sendOnePdu(pduFactory.makeResupplyCancelPdu());
      sendOnePdu(pduFactory.makeResupplyOfferPdu());
      sendOnePdu(pduFactory.makeResupplyReceivedPdu());
      sendOnePdu(pduFactory.makeSeesPdu());
      sendOnePdu(pduFactory.makeServiceRequestPdu());
      sendOnePdu(pduFactory.makeSetDataPdu());
      sendOnePdu(pduFactory.makeSetDataReliablePdu());
      sendOnePdu(pduFactory.makeSetRecordReliablePdu());
      sendOnePdu(pduFactory.makeSignalPdu());
      sendOnePdu(pduFactory.makeStartResumePdu());
      sendOnePdu(pduFactory.makeStartResumeReliablePdu());
      sendOnePdu(pduFactory.makeStopFreezePdu());
      sendOnePdu(pduFactory.makeStopFreezeReliablePdu());
      sendOnePdu(pduFactory.makeTransferOwnershipPdu());
      sendOnePdu(pduFactory.makeTransmitterPdu());
      sendOnePdu(pduFactory.makeTspiPdu());
      sendOnePdu(pduFactory.makeUnderwaterAcousticPdu());

      //sleep(100L); // go sender/receiver go!  is this enough time to receive?
//        try {
//            Thread.sleep(250L); // TODO shouldn't this kind of delay timing be in a DIS sender class?
//        } 
//        catch (InterruptedException ex2) {
//        }
                    
      // TODO is there a more reliable way to determine whether receiver is complete?

      shutDownSender(); // TODO hopefully this finishes reading the pending buffer before shutting down
      shutDownRecorder();
      
      System.out.println("pduReceivedMap.size()=" + pduReceivedMap.size() + ", pduSentMap.size()=" + pduSentMap.size() + 
           ", match=" + (pduReceivedMap.size() == pduSentMap.size()));
           
      assertTrue(pduReceivedMap.size() == pduSentMap.size(),"No pdus, or not all sent pdus, received"); // TODO debugger fails??

      testForEquals();
      
      Semaphore mutex = new Semaphore(1);
      getAllFromRecorder(mutex);
      mutex.acquire(); // wait until above method is done
      
      testRecorderForEquals();
    }
    catch (Exception t) {
      ex = t;
      System.err.println(t.getLocalizedMessage());
      t.printStackTrace(System.err);
    }

    assertNull(ex, "Exception should be null if successful creation of all objects");
  }

  private File recorderDirectory;
  private Map<DISPDUType, Pdu> pduSentMap = new HashMap<>();
  private Map<DISPDUType, Pdu> pduReceivedMap = new HashMap<>();
  private Map<DISPDUType, Pdu> pduReadMap = new HashMap<>();

  DisThreadedNetIF disnetworking;
  PduRecorder recorder;

  private void setupSender()
  {
      disnetworking = recorder.getDisThreadedNetIF();
      disnetworking.addListener(pdu -> {
          pduReceivedMap.put(pdu.getPduType(), pdu);
      });
  }

  private void shutDownSender()
  {
//    disnetworking.kill();
  }

  private void sendOnePdu(Pdu pdu)
  {
    pduSentMap.put(pdu.getPduType(), pdu);
    if (pdu.getPduType() == DISPDUType.OTHER)
        System.out.println ("*** Note: DISPDUType.OTHER not supported");
    disnetworking.send(pdu);
//    sleep(100L); // TODO debugging
  }

  private void setupRecorder() throws Exception
  {
    recorderDirectory = Files.createTempDir();
    recorder = new PduRecorder(recorderDirectory.getAbsolutePath());
    System.out.println("Recorder log at " + recorderDirectory.getAbsolutePath());
  }

  private void shutDownRecorder() throws Exception
  {
    recorder.end();
  }

  private void testForEquals() throws Exception
  {
    assertEquals(pduSentMap.size(), pduReceivedMap.size(), "Different number of pdus received than sent");

    pduSentMap.keySet().forEach(typ -> assertTrue(pduSentMap.get(typ).equals(pduReceivedMap.get(typ)), "Sent and received pdus not identical"));
    
    // TODO is this sufficient?  has each PDU value been compared as well?
  }

  private void getAllFromRecorder(Semaphore sem) throws Exception
  {
    sem.acquire();
    PduPlayer player = new PduPlayer(disnetworking.getMcastGroup(), disnetworking.getDisPort(), recorderDirectory.toPath());
    player.sendToNet(false);
    player.addRawListener(ba -> {
      if (ba != null) {
        Pdu pdu = pduFactory.createPdu(ba);
        pduReadMap.put(pdu.getPduType(), pdu);
      }
      else {
        player.end();
        sem.release();
      }
    });

    player.startResume();
  }

  private void testRecorderForEquals() throws Exception
  {
    assertEquals(pduSentMap.size(), pduReadMap.size(), "Different number of pdus sent than read");

    pduSentMap.keySet().forEach(typ -> assertTrue(pduSentMap.get(typ).equals(pduReadMap.get(typ)), "Sent and read pdus not identical"));
    
    // TODO is this sufficient?  has each PDU value been compared as well?
  }
  
//@formatter:off
  private void sleep(long ms)
  {
    try {
        Thread.sleep(ms);
    }
    catch (InterruptedException ex) {}
  }
//@formatter:on
  
  public static void main(String[] args)
  {
    new AllPduRoundTripTest().testRoundTripAllPdus();
  }
}
