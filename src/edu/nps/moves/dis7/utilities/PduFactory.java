/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.utilities;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * PduFactory.java created on Jun 14, 2019
 * MOVES Institute Naval Postgraduate School, Monterey, CA, USA www.nps.edu
 * <p>
 * A class to 1) create new Pdus (for sending purposes) and 2) create Pdus from byte streams
 * received from the net.
 * <p>
 * For the first use case, pdus will be initialized with country, exerciseId, siteId, applicationId and timestamp format,
 * matching the parameters passed to the constructor.  For no arg constructor, the defaults of USA, 1, 2, 3, and absolute timestamp are used.
 *
 * @author Mike Bailey, jmbailey@nps.edu
 * @version $Id$
 */
public class PduFactory
{
  private Country country = Country.UNITED_STATES_OF_AMERICA_USA;
  private byte defaultExerciseId = 1;
  private short defaultSiteId = 2;
  private short defaultAppId = 3;
  private boolean useAbsoluteTimestamp = true;
  private final DisTime disTime;

  private Method getTime;
  private boolean useFastPdu = false;

  /**
   * Create a PduFactory using defaults for country (USA), exerciseId (2), application (3) and absolute timestamps.
   */
  public PduFactory()
  {
    this.disTime = new DisTime();
    getTimeStampMethod();
  }
  
  /**
   * Create a PduFactory which creates pdus using the specified default values.
   * @param country used in EntityType and RadioType objects
   * @param exerciseId used in standard Pdu header
   * @param siteId used in standard Pdu header
   * @param applicationId used in standard Pdu header
   * @param useAbsoluteTimestamp boolean to specify absolute time stamps (IEEE Std 1278.1-2012, 4.6)
   * @see   edu.nps.moves.dis7.EntityType
   * @see   edu.nps.moves.dis7.RadioType
   */
  public PduFactory(Country country, byte exerciseId, short siteId, short applicationId, boolean useAbsoluteTimestamp)
  {
    this.disTime = new DisTime();
    this.country = country;
    this.defaultExerciseId = exerciseId;
    this.defaultSiteId = siteId;
    this.defaultAppId = applicationId;

    this.useAbsoluteTimestamp = useAbsoluteTimestamp;
    getTimeStampMethod();
  }

  private void getTimeStampMethod()
  {
    try {
      if (useAbsoluteTimestamp)
        getTime = DisTime.class.getDeclaredMethod("getDisAbsoluteTimestamp", new Class<?>[0]);
      else
        getTime = DisTime.class.getDeclaredMethod("getDisRelativeTimestamp", new Class<?>[0]);
    }
    catch (NoSuchMethodException ex) {
      throw new RuntimeException(ex);
    }
  }

  /**
   * Use the default or fast method to create EntityState pdus from input byte streams.
   * @param tf true if fast method
   */
  public void useFastEspdu(boolean tf)
  {
    useFastPdu = tf;
  }

  /* ***************************************************/
 /* utility methods*/
  private int doTime()
  {
    try {
      return (int) getTime.invoke(disTime, (Object[]) null);
    }
    catch (IllegalAccessException | InvocationTargetException ex) {
      throw new RuntimeException(ex);
    }
  }

  private PduBase addBoilerPlate(PduBase pdu)
  {
    pdu.getPduStatus().setValue((byte) (PduStatus.AII_ACTIVE | PduStatus.CEI_COUPLED));
    pdu.setExerciseID(defaultExerciseId)
      .setTimestamp(doTime())
      .setLength((short) pdu.getMarshalledSize());  //todo check if should be done in Pdu class

    return pdu;
  }

  private LiveEntityPdu addBoilerPlate(LiveEntityPdu pdu)
  {
    pdu.setSubprotocolNumber(DISLiveEntitySubprotocolNumber.NO_SUBPROTOCOL)
      .setExerciseID(defaultExerciseId)
      .setTimestamp(doTime())
      .setLength((short) pdu.getMarshalledSize());  //todo check if should be done in Pdu class

    return pdu;
  }

  private EntityID newEntityID()
  {
    EntityID e = new EntityID()
      .setApplicationID(defaultAppId)
      .setSiteID(defaultSiteId);
    return e;
  }

  private EntityType newEntityType()
  {
    EntityType et = new EntityType()
      .setCountry(this.country);
    /*
            .setDomain(PlatformDomain.SURFACE)
            .setEntityKind(EntityKind.OTHER)
     */
    return et;
  }

  private SimulationAddress newSimulationAddress()
  {
    SimulationAddress saddr = new SimulationAddress()
      .setApplication(defaultAppId)
      .setSite(defaultSiteId);
    return saddr;
  }

  private ObjectIdentifier newObjectIdentifier()
  {
    ObjectIdentifier oi = new ObjectIdentifier()
      .setSimulationAddress(newSimulationAddress());
    return oi;
  }

  private EventIdentifier newEventIdentifier()
  {
    EventIdentifier eid = new EventIdentifier();
    eid.setSimulationAddress(newSimulationAddress());
    return eid;
  }

  private SimulationIdentifier newSimulationIdentifier()
  {
    SimulationIdentifier si = new SimulationIdentifier();
    si.setSimulationAddress(newSimulationAddress());
    return si;
  }

  private MunitionDescriptor newMunitionDescriptor()
  {
    MunitionDescriptor md = new MunitionDescriptor()
      .setMunitionType(newEntityType());
    /*
            .setFuse(MunitionDescriptorFuse.OTHER)
            .setWarhead(MunitionDescriptorWarhead.OTHER);
     */
    return md;
  }

  private MinefieldIdentifier newMinefieldIdentifier()
  {
    MinefieldIdentifier mi = new MinefieldIdentifier()
      .setSimulationAddress(newSimulationAddress());
    return mi;
  }

  private RadioCommsHeader newRadioCommsHeader()
  {
    RadioCommsHeader rch = new RadioCommsHeader()
      .setRadioReferenceID(newEntityID());
    return rch;
  }

  private RadioType newRadioType()
  {
    RadioType rt = new RadioType()
      .setCountry(this.country);
    /*
            .setCategory(RadioCategory.OTHER)
            .setEntityKind(EntityKind.OTHER)
            .setSubcategory(RadioSubcategory.OTHER)
     */
    return rt;
  }

  /* ********************************** */
  /* Pdu construction methods */
  
  /**
   * Create an Entity State PDU<br>
   * IEEE Std 1278.1-2012, 5.3.2
   * @return the pdu
   */
  public EntityStatePdu makeEntityStatePdu()
  {
    EntityStatePdu pdu = new EntityStatePdu()
      .setEntityID(newEntityID())
      .setEntityType(newEntityType())
      .setAlternativeEntityType(newEntityType());
    /*
            .setCapabilities(new SurfacePlatformCapabilities())
            .setDeadReckoningParameters(newDeadReckoningParameters())
            .setEntityLinearVelocity(new Vector3Float())
            .setEntityLocation(new Vector3Double())
            .setEntityOrientation(new EulerAngles())
            .setForceId(ForceID.OTHER)
            .setMarking(newEntityMarking())
     */
    return (EntityStatePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Fire PDU<br>
   * IEEE Std 1278.1-2012, 5.4.3
   * @return the pdu
   */  
  public FirePdu makeFirePdu()
  {
    FirePdu pdu = new FirePdu()
      .setFiringEntityID(newEntityID())
      .setMunitionExpendibleID(newEntityID())
      .setTargetEntityID(newEntityID())
      .setEventID(new EventIdentifier())
      .setDescriptor(newMunitionDescriptor());
    /*
            .setLocationInWorldCoordinates(new Vector3Double())
     */
    return (FirePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Detonation PDU<br>
   * IEEE Std 1278.1-2012, 5.4.4
   * @return the pdu
   */  
  public DetonationPdu makeDetonationPdu()
  {
    DetonationPdu pdu = new DetonationPdu()
      .setEventID(newEventIdentifier())
      .setDescriptor(newMunitionDescriptor());
    /*
            .setDetonationResult(DetonationResult.OTHER)
     */
    return (DetonationPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Collision PDU<br>
   * IEEE Std 1278.1-2012, 5.3.3
   * @return the pdu
   */  
  public CollisionPdu makeCollisionPdu()
  {
    CollisionPdu pdu = new CollisionPdu()
      .setCollidingEntityID(newEntityID())
      .setEventID(newEventIdentifier())
      .setIssuingEntityID(newEntityID());
    /*
            .setCollisionType(CollisionType.INELASTIC)
            .setLocation(new Vector3Float())
            .setVelocity(new Vector3Float())*/

    return (CollisionPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Service Request PDU<br>
   * IEEE Std 1278.1-2012, 5.5.5
   * @return the pdu
   */  
  public ServiceRequestPdu makeServiceRequestPdu()
  {
    ServiceRequestPdu pdu = new ServiceRequestPdu()
      .setRequestingEntityID(newEntityID())
      .setServicingEntityID(newEntityID());
    /*
            .setServiceTypeRequested(ServiceRequestServiceTypeRequested.OTHER)
     */

    return (ServiceRequestPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Resupply Offer PDU<br>
   * IEEE Std 1278.1-2012, 5.5.6
   * @return the pdu
   */  
  public ResupplyOfferPdu makeResupplyOfferPdu()
  {
    ResupplyOfferPdu pdu = new ResupplyOfferPdu()
      .setReceivingEntityID(newEntityID())
      .setSupplyingEntityID(newEntityID());

    return (ResupplyOfferPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Resupply Received PDU<br>
   * IEEE Std 1278.1-2012, 5.5.7
   * @return the pdu
   */  
  public ResupplyReceivedPdu makeResupplyReceivedPdu()
  {
    ResupplyReceivedPdu pdu = new ResupplyReceivedPdu()
      .setReceivingEntityID(newEntityID())
      .setSupplyingEntityID(newEntityID());

    return (ResupplyReceivedPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Resupply Cancel PDU<br>
   * IEEE Std 1278.1-2012, 5.5.8
   * @return the pdu
   */  
  public ResupplyCancelPdu makeResupplyCancelPdu()
  {
    ResupplyCancelPdu pdu = new ResupplyCancelPdu()
      .setReceivingEntityID(newEntityID())
      .setSupplyingEntityID(newEntityID());

    return (ResupplyCancelPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Repair Complete PDU<br>
   * IEEE Std 1278.1-2012, 5.5.10
   * @return the pdu
   */  
  public RepairCompletePdu makeRepairCompletePdu()
  {
    RepairCompletePdu pdu = new RepairCompletePdu()
      .setReceivingEntityID(newEntityID())
      .setRepairingEntityID(newEntityID());
    /* 
            .setRepair(RepairCompleteRepair.AIRFRAME)
     */

    return (RepairCompletePdu) addBoilerPlate(pdu);
  }

   /**
   * Create a Repair Response PDU<br>
   * IEEE Std 1278.1-2012, 5.5.11
   * @return the pdu
   */  
 public RepairResponsePdu makeRepairResponsePdu()
  {
    RepairResponsePdu pdu = new RepairResponsePdu()
      .setReceivingEntityID(newEntityID())
      .setRepairingEntityID(newEntityID());
    /*
            .setRepairResult(RepairResponseRepairResult.REPAIR_ENDED)
     */

    return (RepairResponsePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Create Entity PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.2
   * @return the pdu
   */  
  public CreateEntityPdu makeCreateEntityPdu()
  {
    CreateEntityPdu pdu = new CreateEntityPdu();

    return (CreateEntityPdu) addBoilerPlate(pdu);
  }

   /**
   * Create a Remove Entity PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.3
   * @return the pdu
   */  
 public RemoveEntityPdu makeRemoveEntityPdu()
  {
    RemoveEntityPdu pdu = new RemoveEntityPdu();
    pdu.setOriginatingID(newSimulationIdentifier());
    pdu.setReceivingID(newSimulationIdentifier());

    return (RemoveEntityPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Start Resume PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.4
   * @return the pdu
   */  
  public StartResumePdu makeStartResumePdu()
  {
    StartResumePdu pdu = new StartResumePdu();

    return (StartResumePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Stop Freeze PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.5
   * @return the pdu
   */  
  public StopFreezePdu makeStopFreezePdu()
  {
    StopFreezePdu pdu = new StopFreezePdu();
    /*
            .setFrozenBehavior(new StopFreezeFrozenBehavior())
            .setRealWorldTime(new ClockTime())
            .setReason(StopFreezeReason.OTHER)
     */
    return (StopFreezePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Acknowledge PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.6
   * @return the pdu
   */  
  public AcknowledgePdu makeAcknowledgePdu()
  {
    AcknowledgePdu pdu = new AcknowledgePdu();
    pdu.setOriginatingID(newSimulationIdentifier());
    /*
            .setAcknowledgeFlag(AcknowledgeAcknowledgeFlag.CREATE_ENTITY);
            .setResponseFlag(AcknowledgeResponseFlag.OTHER);
            .setPduStatus((byte)0)
     */
    return (AcknowledgePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Action Request PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.7
   * @return the pdu
   */  
  public ActionRequestPdu makeActionRequestPdu()
  {
    ActionRequestPdu pdu = new ActionRequestPdu();
    /*
            .setActionID(ActionRequestActionID.OTHER)
     */
    return (ActionRequestPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Action Response PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.8
   * @return the pdu
   */  
  public ActionResponsePdu makeActionResponsePdu()
  {
    ActionResponsePdu pdu = new ActionResponsePdu();
    /*
            .setRequestStatus(ActionResponseRequestStatus.OTHER)
     */
    return (ActionResponsePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Data Query PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.9
   * @return the pdu
   */  
  public DataQueryPdu makeDataQueryPdu()
  {
    DataQueryPdu pdu = new DataQueryPdu();

    return (DataQueryPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Set DataPDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.10
   * @return the pdu
   */  
  public SetDataPdu makeSetDataPdu()
  {
    SetDataPdu pdu = new SetDataPdu();

    return (SetDataPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Data PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.11
   * @return the pdu
   */  
  public DataPdu makeDataPdu()
  {
    DataPdu pdu = new DataPdu();

    return (DataPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Event Report PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.12
   * @return the pdu
   */  
  public EventReportPdu makeEventReportPdu()
  {
    EventReportPdu pdu = new EventReportPdu();
    /*
            .setEventType(EventReportEventType.OTHER)
     */
    return (EventReportPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Comment PDU<br>
   * IEEE Std 1278.1-2012, 5.6.5.13
   * @return the pdu
   */  
  public CommentPdu makeCommentPdu()
  {
    CommentPdu pdu = new CommentPdu();

    return (CommentPdu) addBoilerPlate(pdu);
  }
  
  /**
   * Create a Comment PDU containing the given String(s), variable record type = "OTHER"
   * @param comments 
   * @return the pdu
   */
  public CommentPdu makeCommentPdu(String ... comments)
  {
    return makeCommentPdu(VariableRecordType.OTHER, comments);
  }
  
  /**
   * Create a Comment PDU containing the given String(s) and variable record type
   * @param typ VariableRecordType
   * @param comments 
   * @return the pdu
   */
  public CommentPdu makeCommentPdu(VariableRecordType typ, String... comments)
  {
    CommentPdu pdu = makeCommentPdu();
    List<VariableDatum> list = pdu.getVariableDatums();
    Stream.of(comments).forEach(s -> {
      VariableDatum vardat = new VariableDatum();
      vardat.setVariableDatumID(typ);
      vardat.setVariableDatumValue(s.getBytes());
      list.add(vardat);
    });

    return pdu;
  }
  
  /**
   * Create a Electromagnetic Emission (EE) PDU<br>
   * IEEE Std 1278.1-2012, 5.7.3
   * @return the pdu
   */  
  public ElectromagneticEmissionPdu makeElectronicEmissionsPdu()
  {
    ElectromagneticEmissionPdu pdu = new ElectromagneticEmissionPdu()
      .setEmittingEntityID(newEntityID())
      .setEventID(newEventIdentifier());
    /*
            .setStateUpdateIndicator(ElectromagneticEmissionStateUpdateIndicator.HEARTBEAT_UPDATE)
     */
    return (ElectromagneticEmissionPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Designator PDU<br>
   * IEEE Std 1278.1-2012, 5.7.4
   * @return the pdu
   */
  public DesignatorPdu makeDesignatorPdu()
  {
    DesignatorPdu pdu = new DesignatorPdu()
      .setDesignatedEntityID(newEntityID())
      .setDesignatingEntityID(newEntityID());
    /*
            .setCodeName(DesignatorSystemName.NOT_SPECIFIED)
            .setDeadReckoningAlgorithm(DeadReckoningAlgorithm.OTHER)
            .setDesignatorCode(DesignatorDesignatorCode.OTHER)
            .setDesignatorSpotLocation(new Vector3Double())
            .setDesignatorSpotWrtDesignated(new Vector3Float())
            .setEntityLinearAcceleration(new Vector3Float())
     */
    return (DesignatorPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Transmitter PDU<br>
   * IEEE Std 1278.1-2012, 5.8.3
   * @return the pdu
   */
  public TransmitterPdu makeTransmitterPdu()
  {
    TransmitterPdu pdu = new TransmitterPdu()
      .setHeader(newRadioCommsHeader())
      .setRadioEntityType(newRadioType());
    /*
            .setAntennaLocation(new Vector3Double())
            .setAntennaPatternType(TransmitterAntennaPatternType.BEAM)
            .setCryptoSystem(TransmitterCryptoSystem.NO_ENCRYPTION_DEVICE)
            .setInputSource(TransmitterInputSource.OTHER)
            .setModulationType(newModulationType())
            .setRelativeAntennaLocation(new Vector3Float())
            .setTransmitState(TransmitterTransmitState.OFF)
     */
    return (TransmitterPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Signal PDU<br>
   * IEEE Std 1278.1-2012, 5.7.4
   * @return the pdu
   */
  public SignalPdu makeSignalPdu()
  {
    SignalPdu pdu = new SignalPdu()
      .setHeader(newRadioCommsHeader());
    /*
            .setTdlType(SignalTDLType.OTHER)
     */
    return (SignalPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Receiver PDU<br>
   * IEEE Std 1278.1-2012, 5.8.5
   * @return the pdu
   */
  public ReceiverPdu makeReceiverPdu()
  {
    ReceiverPdu pdu = new ReceiverPdu()
      .setTransmitterEntityId(newEntityID())
      .setHeader(newRadioCommsHeader());
    /*
            .setReceiverState(ReceiverReceiverState.OFF)
     */
    return (ReceiverPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a an Identification Friend or Foe (IFF) PDU<br>
   * IEEE Std 1278.1-2012, 5.7.6
   * @return the pdu
   */
  public IFFPdu makeIffPdu()
  {
    IFFPdu pdu = new IFFPdu()
      .setEmittingEntityId(newEntityID())
      .setEventID(newEventIdentifier());
    /*
            .setFundamentalParameters(new FundamentalOperationalData())
            .setLocation(new Vector3Float())
            .setSystemID(newSystemIdentifier())
     */

    return (IFFPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Designator PDU<br>
   * IEEE Std 1278.1-2012, 5.7.4
   * @return the pdu
   */
  public UnderwaterAcousticPdu makeUnderwaterAcousticPdu()
  {
    UnderwaterAcousticPdu pdu = new UnderwaterAcousticPdu()
      .setEmittingEntityID(newEntityID())
      .setEventID(newEventIdentifier());
    /*
            .setPassiveParameterIndex(UAPassiveParameterIndex.OTHER)
            .setStateChangeIndicator(UAStateChangeUpdateIndicator.STATE_UPDATE)
     */
    return (UnderwaterAcousticPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Supplemental Emission/Entity State (SEES) PDU<br>
   * IEEE Std 1278.1-2012, 5.7.7
   * @return the pdu
   */
  public SEESPdu makeSeesPdu()
  {
    SEESPdu pdu = new SEESPdu();

    return (SEESPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Intercom Signal PDU<br>
   * IEEE Std 1278.1-2012, 5.8.6
   * @return the pdu
   */
  public IntercomSignalPdu makeIntercomSignalPdu()
  {
    IntercomSignalPdu pdu = new IntercomSignalPdu();

    return (IntercomSignalPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Intercom Control PDU<br>
   * IEEE Std 1278.1-2012, 5.8.7
   * @return the pdu
   */
  public IntercomControlPdu makeIntercomControlPdu()
  {
    IntercomControlPdu pdu = new IntercomControlPdu()
      .setSourceEntityID(newEntityID());
    /*
            .setCommand(IntercomControlCommand.NO_COMMAND)
            .setControlType(IntercomControlControlType.STATUS)
            .setTransmitLineState(IntercomControlTransmitLineState.NOT_TRANSMITTING)
     */
    return (IntercomControlPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Designator PDU<br>
   * IEEE Std 1278.1-2012, 5.7.4
   * @return the pdu
   */
  public AggregateStatePdu makeAggregateStatePdu()
  {
    AggregateStatePdu pdu = new AggregateStatePdu();
    /*
            .setAggregateState(AggregateStateAggregateState.OTHER)
            .setAggregateType(newAggregateType())
            .setForceID(ForceID.OTHER)
            .setFormation(AggregateStateFormation.OTHER)
            .setAggregateMarking(newAggregateMarking())
     */
    return (AggregateStatePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an IsGroupOf PDU<br>
   * IEEE Std 1278.1-2012, 5.9.3
   * @return the pdu
   */
  public IsGroupOfPdu makeIsGroupOfPdu()
  {
    IsGroupOfPdu pdu = new IsGroupOfPdu()
      .setGroupEntityID(newEntityID());
    /*
            .setGroupedEntityCategory(IsGroupOfGroupedEntityCategory.UNDEFINED)
     */
    return (IsGroupOfPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Transfer Ownership PDU<br>
   * IEEE Std 1278.1-2012, 5.9.4
   * @return the pdu
   */
  public TransferOwnershipPdu makeTransferOwnershipPdu()
  {
    TransferOwnershipPdu pdu = new TransferOwnershipPdu()
      .setOriginatingEntityID(newEntityID())
      .setReceivingEntityID(newEntityID())
      .setTransferEntityID(newEntityID());
    /*
            .setRecordSets(new RecordSpecification())
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED)
            .setTransferType(TransferControlTransferType.OTHER)
     */
    return (TransferOwnershipPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an IsPartOf PDU<br>
   * IEEE Std 1278.1-2012, 5.9.5
   * @return the pdu
   */
  public IsPartOfPdu makeIsPartOfPdu()
  {
    IsPartOfPdu pdu = new IsPartOfPdu()
      .setPartEntityType(newEntityType())
      .setOrginatingEntityID(newEntityID())
      .setReceivingEntityID(newEntityID());
    /*
            .setNamedLocationID(newNamedLocationIdentification())
            .setPartLocation(new Vector3Float())
            .setRelationship(newRelationship())
     */
    return (IsPartOfPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Minefield State PDU<br>
   * IEEE Std 1278.1-2012, 5.10.2
   * @return the pdu
   */
  public MinefieldStatePdu makeMinefieldStatePdu()
  {
    MinefieldStatePdu pdu = new MinefieldStatePdu();
    pdu.setMinefieldType(newEntityType())
      .setMinefieldID(newMinefieldIdentifier());
    /*
            .setAppearance(new MinefieldStateAppearanceBitMap())
            .setForceID(ForceID.OTHER)
            .setMinefieldLocation(new Vector3Double())
            .setMinefieldOrientation(new EulerAngles())         
            .setProtocolMode(new ProtocolMode())
     */
    return (MinefieldStatePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Minefield Query PDU<br>
   * IEEE Std 1278.1-2012, 5.10.3
   * @return the pdu
   */
  public MinefieldQueryPdu makeMinefieldQueryPdu()
  {
    MinefieldQueryPdu pdu = new MinefieldQueryPdu()
      .setRequestedMineType(newEntityType())
      .setRequestingEntityID(newEntityID())
      .setMinefieldID(newMinefieldIdentifier());
    /*
            .setDataFilter(new DataFilterRecord())
     */
    return (MinefieldQueryPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Minefield Data PDU<br>
   * IEEE Std 1278.1-2012, 5.10.4
   * @return the pdu
   */
  public MinefieldDataPdu makeMinefieldDataPdu()
  {
    MinefieldDataPdu pdu = new MinefieldDataPdu()
      .setMineType(newEntityType())
      .setMinefieldID(newMinefieldIdentifier())
      .setRequestingEntityID(newSimulationIdentifier());
    /*
            .setDataFilter(new DataFilterRecord())
            .setNumberOfMinesInThisPdu((byte)1);
            pdu.getFusing().add(new MinefieldDataFusing());
            pdu.getPaintScheme().add(new MinefieldDataPaintScheme())
     */
    return (MinefieldDataPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Minefield Response Negative Acknowledgment (NACK) PDU<br>
   * IEEE Std 1278.1-2012, 5.10.5
   * @return the pdu
   */
  public MinefieldResponseNACKPdu makeMinefieldResponseNackPdu()
  {
    MinefieldResponseNACKPdu pdu = new MinefieldResponseNACKPdu();

    return (MinefieldResponseNACKPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Environmental Process PDU<br>
   * IEEE Std 1278.1-2012, 5.11.2.2
   * @return the pdu
   */
  public EnvironmentalProcessPdu makeEnvironmentalProcessPdu()
  {
    EnvironmentalProcessPdu pdu = new EnvironmentalProcessPdu()
      .setEnvironementalProcessID(newObjectIdentifier())
      .setEnvironmentType(newEntityType());
    /*
            .setEnvironmentStatus(new EnvironmentalProcessEnvironmentStatus(EnvironmentalProcessEnvironmentStatus.IS_ACTIVE,1))
            .setModelType(EnvironmentalProcessModelType.NO_STATEMENT)
     */
    return (EnvironmentalProcessPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Gridded Data PDU<br>
   * IEEE Std 1278.1-2012, 5.11.2.3
   * @return the pdu
   */
  public GriddedDataPdu makeGriddedDataPdu()
  {
    GriddedDataPdu pdu = new GriddedDataPdu()
      .setEnvironmentType(newEntityType());
    /*
            .setConstantGrid(GriddedDataConstantGrid.CONSTANT_GRID)
            .setCoordinateSystem(GriddedDataCoordinateSystem.LATITUDE_LONGITUDE_DEPTH)
            .setEnvironmentalSimulationApplicationID(newSimulationIdentifier())
            .setOrientation(new EulerAngles())
            .setSampleTime(new ClockTime())
     */
    return (GriddedDataPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Point Object State PDU<br>
   * IEEE Std 1278.1-2012, 5.11.3.2
   * @return the pdu
   */
  public PointObjectStatePdu makePointObjectStatePdu()
  {
    PointObjectStatePdu pdu = new PointObjectStatePdu()
      .setObjectID(newEntityID());
    /*
            .setForceID(ForceID.OTHER)
            .setGenerObjectAppearance(new ObjectStateAppearanceGeneral())
            .setModifications(new ObjectStateModificationPointObject())
            .setObjectLocation(new Vector3Double())
            .setObjectOrientation(new EulerAngles())
            .setObjectType(newObjectType())
            .setReceivingID(newSimulationAddress()
     */
    return (PointObjectStatePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Linear Object State PDU<br>
   * IEEE Std 1278.1-2012, 5.11.3.3
   * @return the pdu
   */
  public LinearObjectStatePdu makeLinearObjectStatePdu()
  {
    LinearObjectStatePdu pdu = new LinearObjectStatePdu()
      .setObjectID(newObjectIdentifier())
      .setReceivingID(newSimulationAddress())
      .setReferencedObjectID(newObjectIdentifier())
      .setRequesterID(newSimulationAddress());
    /*
            .setForceID(ForceID.OTHER)
            .setObjectType(newObjectType())
     */
    return (LinearObjectStatePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Areal Object State PDU<br>
   * IEEE Std 1278.1-2012, 5.11.3.4
   * @return the pdu
   */
  public ArealObjectStatePdu makeArealObjectStatePdu()
  {
    ArealObjectStatePdu pdu = new ArealObjectStatePdu()
      .setObjectID(newObjectIdentifier());
    /*
            .setForceID(ForceID.OTHER)
            .setModifications(new ObjectStateModificationArealObject())
            .setObjectType(newObjectType())
     */
    return (ArealObjectStatePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Time Space Position Information (TSPI) PDU<br>
   * IEEE Std 1278.1-2012, 9.4.2
   * @return the pdu
   */
  public TSPIPdu makeTspiPdu()
  {
    TSPIPdu pdu = new TSPIPdu()
      .setLiveEntityId(newEntityID());
    /*
            .setDeadReckoningParameters(newLiveDeadReckoningParameters())
            .setEntityLinearVelocity(new LiveEntityLinearVelocity())
            .setEntityLocation(new LiveEntityRelativeWorldCoordinates())
            .setEntityOrientation(new LiveEntityOrientation())
            .setOrientationError(new LiveEntityOrientationError())
            .setPositionError(new LiveEntityPositionError())*/
    pdu.setSubprotocolNumber(DISLiveEntitySubprotocolNumber.NO_SUBPROTOCOL);
    return (TSPIPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Appearance PDU<br>
   * IEEE Std 1278.1-2012, 9.4.3
   * @return the pdu
   */
  public AppearancePdu makeAppearancePdu()
  {
    AppearancePdu pdu = new AppearancePdu()
      .setEntityType(newEntityType())
      .setAlternateEntityType(newEntityType())
      .setLiveEntityId(new EntityID());
    /*
            .setCapabilities(new SurfacePlatformCapabilities())
            .setAppearanceFields(new Appearance())
            .setEntityMarking(newEntityMarking())
            .setForceId(ForceID.OTHER)*/
    pdu.setSubprotocolNumber(DISLiveEntitySubprotocolNumber.NO_SUBPROTOCOL);
    return (AppearancePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Articulated Parts PDU<br>
   * IEEE Std 1278.1-2012, 9.4.4
   * @return the pdu
   */
  public ArticulatedPartsPdu makeArticulatedPartsPdu()
  {
    ArticulatedPartsPdu pdu = new ArticulatedPartsPdu()
      .setLiveEntityId(new EntityID());
    pdu.setSubprotocolNumber(DISLiveEntitySubprotocolNumber.NO_SUBPROTOCOL);
    return (ArticulatedPartsPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Live Entity (LE) Fire PDU<br>
   * IEEE Std 1278.1-2012, 9.4.5
   * @return the pdu
   */
  public LEFirePdu makeLEFirePdu()
  {
    LEFirePdu pdu = new LEFirePdu()
      .setEventId(newEventIdentifier())
      .setFiringLiveEntityId(newEntityID())
      .setMunitionLiveEntityId(newEntityID())
      .setTargetLiveEntityId(newEntityID())
      .setMunitionDescriptor(newMunitionDescriptor());
    /*
            .setLocation(new LiveEntityRelativeWorldCoordinates())
            .setVelocity(new LiveEntityLinearVelocity())
     */
    pdu.setSubprotocolNumber(DISLiveEntitySubprotocolNumber.NO_SUBPROTOCOL);
    return (LEFirePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Live Entity (LE) Detonation PDU<br>
   * IEEE Std 1278.1-2012, 9.4.6
   * @return the pdu
   */
  public LEDetonationPdu makeLEDetonationPdu()
  {
    LEDetonationPdu pdu = new LEDetonationPdu()
      .setEventId(newEventIdentifier())
      .setFiringLiveEntityId(newEntityID())
      .setMunitionLiveEntityId(newEntityID())
      .setTargetLiveEntityId(newEntityID())
      .setMunitionDescriptor(newMunitionDescriptor());
    /*
            .setEntityLocation(new LiveEntityLinearVelocity())
            .setMunitionOrientation(new LiveEntityOrientation16())
            .setVelocity(new LiveEntityLinearVelocity())
            .setWorldLocation(new LiveEntityRelativeWorldCoordinates())
     */
    pdu.setSubprotocolNumber(DISLiveEntitySubprotocolNumber.NO_SUBPROTOCOL);
    return (LEDetonationPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Create Entity-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.2
   * @return the pdu
   */
  public CreateEntityReliablePdu makeCreateEntityReliablePdu()
  {
    CreateEntityReliablePdu pdu = new CreateEntityReliablePdu();
    /*
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED);
     */
    pdu.setOriginatingID(newSimulationIdentifier())
      .setReceivingID(newSimulationIdentifier());
    return (CreateEntityReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Remove Entity-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.3
   * @return the pdu
   */
  public RemoveEntityReliablePdu makeRemoveEntityReliablePdu()
  {
    RemoveEntityReliablePdu pdu = new RemoveEntityReliablePdu();
    /*
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED)
     */
    return (RemoveEntityReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Start/Resume-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.4
   * @return the pdu
   */
  public StartResumeReliablePdu makeStartResumeReliablePdu()
  {
    StartResumeReliablePdu pdu = new StartResumeReliablePdu();
    /*
            .setRealWorldTime(new ClockTime())
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED)
            .setSimulationTime(new ClockTime())
     */
    return (StartResumeReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Stop/Freeze-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.5
   * @return the pdu
   */
  public StopFreezeReliablePdu makeStopFreezeReliablePdu()
  {
    StopFreezeReliablePdu pdu = new StopFreezeReliablePdu();
    /*
            .setFrozenBehavior(new StopFreezeFrozenBehavior())
            .setRealWorldTime(new ClockTime())
            .setReason(StopFreezeReason.OTHER)
            .setRequiredReliablityService(RequiredReliabilityService.ACKNOWLEDGED)
     */
    return (StopFreezeReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Acknowledge-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.6
   * @return the pdu
   */
  public AcknowledgeReliablePdu makeAcknowledgeReliablePdu()
  {
    AcknowledgeReliablePdu pdu = new AcknowledgeReliablePdu();
    pdu.setOriginatingID(newSimulationIdentifier());
    /*
            .setAcknowledgeFlag(AcknowledgeAcknowledgeFlag.CREATE_ENTITY)
            .setResponseFlag(AcknowledgeResponseFlag.OTHER);
            .setPduStatus((byte)0)
     */
    return (AcknowledgeReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Action Request-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.7
   * @return the pdu
   */
  public ActionRequestReliablePdu makeActionRequestReliablePdu()
  {
    ActionRequestReliablePdu pdu = new ActionRequestReliablePdu();
    /*
            .setActionID(ActionRequestActionID.OTHER)
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED)
     */
    return (ActionRequestReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Action Response-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.8
   * @return the pdu
   */
  public ActionResponseReliablePdu makeActionResponseReliablePdu()
  {
    ActionResponseReliablePdu pdu = new ActionResponseReliablePdu();
    /*
            .setResponseStatus(ActionResponseRequestStatus.OTHER)
     */
    return (ActionResponseReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Data Query-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.9
   * @return the pdu
   */
  public DataQueryReliablePdu makeDataQueryReliablePdu()
  {
    DataQueryReliablePdu pdu = new DataQueryReliablePdu();
    pdu.setOriginatingID(new SimulationIdentifier());
    pdu.setReceivingID(newSimulationIdentifier());
    /*
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED);
     */
    return (DataQueryReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Set Data-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.10
   * @return the pdu
   */
  public SetDataReliablePdu makeSetDataReliablePdu()
  {
    SetDataReliablePdu pdu = new SetDataReliablePdu();
    pdu.setReceivingID(newSimulationIdentifier());
    pdu.setOriginatingID(newSimulationIdentifier());
    /*
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED);
     */
    return (SetDataReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Data-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.11
   * @return the pdu
   */
  public DataReliablePdu makeDataReliablePdu()
  {
    DataReliablePdu pdu = new DataReliablePdu();
    pdu.setOriginatingID(newSimulationIdentifier());
    pdu.setReceivingID(newSimulationIdentifier());
    /*
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED);
     */
    return (DataReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Event Report-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.12
   * @return the pdu
   */
  public EventReportReliablePdu makeEventReportReliablePdu()
  {
    EventReportReliablePdu pdu = new EventReportReliablePdu();
    /*
            .setEventType(EventReportEventType.OTHER)
     */
    return (EventReportReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Comment-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.13
   * @return the pdu
   */
  public CommentReliablePdu makeCommentReliablePdu()
  {
    CommentReliablePdu pdu = new CommentReliablePdu();

    return (CommentReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Comment-R PDU containing the given String(s), variable record type = "OTHER"
   * @param comments 
   * @return the pdu
   */
  public CommentReliablePdu makeCommentReliablePdu(String ... comments)
  {
    return makeCommentReliablePdu(VariableRecordType.OTHER, comments);
  }
  
  /**
   * Create a CommentR PDU containing the given String(s) and variable record type
   * @param typ VariableRecordType
   * @param comments 
   * @return the pdu
   */
  public CommentReliablePdu makeCommentReliablePdu(VariableRecordType typ, String... comments)
  {
    CommentReliablePdu pdu = makeCommentReliablePdu();
    List<VariableDatum> list = pdu.getVariableDatumRecords();
    Stream.of(comments).forEach(s -> {
      VariableDatum vardat = new VariableDatum();
      vardat.setVariableDatumID(typ);
      vardat.setVariableDatumValue(s.getBytes());
      list.add(vardat);
    });

    return pdu;
  }
  
  /**
   * Create a Record-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.16
   * @return the pdu
   */
  public RecordReliablePdu makeRecordReliablePdu()
  {
    RecordReliablePdu pdu = new RecordReliablePdu();
    /*
            .setEventType(RecordREventType.OTHER)
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED)
     */
    return (RecordReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Set Record-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.15
   * @return the pdu
   */
  public SetRecordReliablePdu makeSetRecordReliablePdu()
  {
    SetRecordReliablePdu pdu = new SetRecordReliablePdu();
    /*
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED)
     */
    return (SetRecordReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Record Query-R (Reliable) PDU<br>
   * IEEE Std 1278.1-2012, 5.12.4.14
   * @return the pdu
   */
  public RecordQueryReliablePdu makeRecordQueryReliablePdu()
  {
    RecordQueryReliablePdu pdu = new RecordQueryReliablePdu();
    /*
            .setEventType(RecordQueryREventType.PERIODIC)
            .setRequiredReliabilityService(RequiredReliabilityService.ACKNOWLEDGED)
     */
    return (RecordQueryReliablePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Collision-Elastic PDU<br>
   * IEEE Std 1278.1-2012, 5.3.4
   * @return the pdu
   */
  public CollisionElasticPdu makeCollisionElasticPdu()
  {
    CollisionElasticPdu pdu = new CollisionElasticPdu();
    return (CollisionElasticPdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Entity State Update PDU<br>
   * IEEE Std 1278.1-2012, 5.3.5
   * @return the pdu
   */
  public EntityStateUpdatePdu makeEntityStateUpdatePdu()
  {
    EntityStateUpdatePdu pdu = new EntityStateUpdatePdu()
      .setEntityID(newEntityID());
    /*
            .setEntityLinearVelocity(new Vector3Float())
            .setEntityLocation(new Vector3Double())
            .setEntityOrientation(new EulerAngles())
     */
    return (EntityStateUpdatePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Directed Energy (DE) Fire PDU<br>
   * IEEE Std 1278.1-2012, 5.4.5
   * @return the pdu
   */
  public DirectedEnergyFirePdu makeDirectedEnergyFirePdu()
  {
    DirectedEnergyFirePdu pdu = new DirectedEnergyFirePdu()
      .setEventID(newEventIdentifier())
      .setFiringEntityID(newEntityID())
      .setMunitionType(newEntityType());
    /*
            .setApertureEmitterLocation(new Vector3Float())
            .setFlags(new DEFireFlags(DEFireFlags.WEAPON_ON,1))
            .setPulseShape(DEFirePulseShape.OTHER)
     */
    return (DirectedEnergyFirePdu) addBoilerPlate(pdu);
  }

  /**
   * Create a Collision-Elastic PDU<br>
   * IEEE Std 1278.1-2012, 5.3.3
   * @return the pdu
   */
  public EntityDamageStatusPdu makeEntityDamageStatusPdu()
  {
    EntityDamageStatusPdu pdu = new EntityDamageStatusPdu();
    return (EntityDamageStatusPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Information Operations (IO) Action PDU<br>
   * IEEE Std 1278.1-2012, 5.13.3
   * @return the pdu
   */
  public InformationOperationsActionPdu makeInformationOperationsActionPdu()
  {
    InformationOperationsActionPdu pdu = new InformationOperationsActionPdu()
      .setIoAttackerID(newEntityID())
      .setIoPrimaryTargetID(newEntityID())
      .setReceivingSimID(newEntityID());
    /*
            .setIOActionPhase(IOActionIOActionPhase.NO_STATEMENT)
            .setIOActionType(IOActionIOActionType.NO_STATEMENT)
            .setIOSimulationSource(IOActionIOSimulationSource.NO_STATEMENT)
            .setIOWarfareType(IOActionIOWarfareType.NO_STATEMENT)
     */
    return (InformationOperationsActionPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Information Operations (IO) Report PDU<br>
   * IEEE Std 1278.1-2012, 5.13.4
   * @return the pdu
   */
  public InformationOperationsReportPdu makeInformationOperationsReportPdu()
  {
    InformationOperationsReportPdu pdu = new InformationOperationsReportPdu()
      .setIoAttackerID(newEntityID())
      .setIoPrimaryTargetID(newEntityID());
    /*
            .setIoReportType(IOReportIOReportType.NO_STATEMENT)
            .setIoSimSource(IOActionIOSimulationSource.NO_STATEMENT)
            .setPadding1((byte)0)
     */

    return (InformationOperationsReportPdu) addBoilerPlate(pdu);
  }

  /**
   * Create an Attribute PDU<br>
   * IEEE Std 1278.1-2012, 5.3.6
   * @return the pdu
   */
  public AttributePdu makeAttributePdu()
  {
    AttributePdu pdu = new AttributePdu()
      .setOriginatingSimulationAddress(newSimulationAddress());
    /*
            .setActionCode(DISAttributeActionCode.NO_STATEMENT)
            .setAttributeRecordPduType(DISPDUType.OTHER)
            .setAttributeRecordProtocolVersion(DISProtocolFamily.OTHER)
            .setMasterAttributeRecordType(VariableRecordTypes.OTHER)
     */

    return (AttributePdu) addBoilerPlate(pdu);
  }

  /**
   * PDU builder. Pass in an array of bytes, get the correct type of pdu back,
   * based on the PDU type field contained in the byte array.
   *
   * @param data
   * @return A PDU of the appropriate concrete subclass of PDU or null if there was an error
   */
  public Pdu createPdu(byte data[])
  {
    return createPdu(ByteBuffer.wrap(data));
  }

  /**
   * PDU builder. Pass in an array of bytes, get the correct type of pdu back,
   * based on the PDU type field contained in the byte buffer.  (Implementation note: includes
   * workaround code for a jdk8 bytecode bug.)
   *
   * @param buff
   * @return the pdu or null if there was an error creating the Pdu
   */
  public Pdu createPdu(java.nio.ByteBuffer buff)
  {
    // The (unnecessary) casts around the position() calls are a workaround for an apparent bytecode bug with
    // javac involving jdk 8.  Google "java bytebuffer no such method position" and see https://github.com/eclipse/jetty.project/issues/3244
    // specifically for the workaround used in three places below.
    
    int pos = buff.position();        // Save buffer's position
    if (pos + 2 > buff.limit()) {     // Make sure there's enough space in buffer
      return null;                    // Else return null
    } // end if: buffer too short
    
    buff = buff.position(pos + 2);    // Advance to third byte
    final int pduIdx = Byte.toUnsignedInt(buff.get());    // Read Pdu type
    buff = buff.position(pos);        // Reset buffer

    DISPDUType pduType = DISPDUType.getEnumForValue(pduIdx);
    return createPdu(pduType, buff);
  }

  /**
   * Create an empty PDU of the given type
   * @param pduType
   * @return the pdu
   */
  public Pdu createPdu(DISPDUType pduType)
  {
    return createPdu(pduType, null);
  }

  /**
   * Return the enumerated pdu type from a byte array, typically received from the network
   * @param ba byte array
   * @return the type
   */
  public DISPDUType getTypeFromByteArray(byte[] ba)
  {
    return DISPDUType.getEnumForValue(Byte.toUnsignedInt(ba[2])); // 3rd byte
  }
  
  private Pdu createPdu(DISPDUType pduType, ByteBuffer buff)
  {
    Pdu aPdu = null;
    switch (pduType) {
      // NOTE: 'OTHER' is a valid pduTypeEnum, but has no corresponding object
      case ENTITY_STATE:
        // if the user has created the factory requesting that he get fast espdus back, give him those.
        if (useFastPdu) {
          aPdu = new FastEntityStatePdu();
        }
        else {
          aPdu = new EntityStatePdu();
        }
        break;

      case FIRE:
        aPdu = new FirePdu();
        break;

      case DETONATION:
        aPdu = new DetonationPdu();
        break;

      case COLLISION:
        aPdu = new CollisionPdu();
        break;

      case SERVICE_REQUEST:
        aPdu = new ServiceRequestPdu();
        break;

      case RESUPPLY_OFFER:
        aPdu = new ResupplyOfferPdu();
        break;

      case RESUPPLY_RECEIVED:
        aPdu = new ResupplyReceivedPdu();
        break;

      case RESUPPLY_CANCEL:
        aPdu = new ResupplyCancelPdu();
        break;

      case REPAIR_COMPLETE:
        aPdu = new RepairCompletePdu();
        break;

      case REPAIR_RESPONSE:
        aPdu = new RepairResponsePdu();
        break;

      case CREATE_ENTITY:
        aPdu = new CreateEntityPdu();
        break;

      case REMOVE_ENTITY:
        aPdu = new RemoveEntityPdu();
        break;

      case START_RESUME:
        aPdu = new StartResumePdu();
        break;

      case STOP_FREEZE:
        aPdu = new StopFreezePdu();
        break;

      case ACKNOWLEDGE:
        aPdu = new AcknowledgePdu();
        break;

      case ACTION_REQUEST:
        aPdu = new ActionRequestPdu();
        break;

      case ACTION_RESPONSE:
        aPdu = new ActionResponsePdu();
        break;

      case DATA_QUERY:
        aPdu = new DataQueryPdu();
        break;

      case SET_DATA:
        aPdu = new SetDataPdu();
        break;

      case DATA:
        aPdu = new DataPdu();
        break;

      case EVENT_REPORT:
        aPdu = new EventReportPdu();
        break;

      case COMMENT:
        aPdu = new CommentPdu();
        break;

      case ELECTROMAGNETIC_EMISSION:
        aPdu = new ElectromagneticEmissionPdu();
        break;

      case DESIGNATOR:
        aPdu = new DesignatorPdu();
        break;

      case TRANSMITTER:
        aPdu = new TransmitterPdu();
        break;

      case SIGNAL:
        aPdu = new SignalPdu();
        break;

      case RECEIVER:
        aPdu = new ReceiverPdu();
        break;

      case IDENTIFICATION_FRIEND_OR_FOE:
        aPdu = new IFFPdu();
        break;

      case UNDERWATER_ACOUSTIC:
        aPdu = new UnderwaterAcousticPdu();
        break;

      case SUPPLEMENTAL_EMISSION_ENTITY_STATE:
        aPdu = new SEESPdu();
        break;

      case INTERCOM_SIGNAL:
        aPdu = new IntercomSignalPdu();
        break;

      case INTERCOM_CONTROL:
        aPdu = new IntercomControlPdu();
        break;

      case AGGREGATE_STATE:
        aPdu = new AggregateStatePdu();
        break;

      case ISGROUPOF:
        aPdu = new IsGroupOfPdu();
        break;

      case TRANSFER_OWNERSHIP:
        aPdu = new TransferOwnershipPdu();
        break;

      case ISPARTOF:
        aPdu = new IsPartOfPdu();
        break;

      case MINEFIELD_STATE:
        aPdu = new MinefieldStatePdu();
        break;

      case MINEFIELD_QUERY:
        aPdu = new MinefieldQueryPdu();
        break;

      case MINEFIELD_DATA:
        aPdu = new MinefieldDataPdu();
        break;

      case MINEFIELD_RESPONSE_NACK:
        aPdu = new MinefieldResponseNACKPdu();
        break;

      case ENVIRONMENTAL_PROCESS:
        aPdu = new EnvironmentalProcessPdu();
        break;

      case GRIDDED_DATA:
        aPdu = new GriddedDataPdu();
        break;

      case POINT_OBJECT_STATE:
        aPdu = new PointObjectStatePdu();
        break;

      case LINEAR_OBJECT_STATE:
        aPdu = new LinearObjectStatePdu();
        break;

      case AREAL_OBJECT_STATE:
        aPdu = new ArealObjectStatePdu();
        break;

      case TIME_SPACE_POSITION_INFORMATION:
        aPdu = new TSPIPdu();
        break;

      case APPEARANCE:
        aPdu = new AppearancePdu();
        break;

      case ARTICULATED_PARTS:
        aPdu = new ArticulatedPartsPdu();
        break;

      case LIVE_ENTITY_FIRE:
        aPdu = new LEFirePdu();
        break;

      case LIVE_ENTITY_DETONATION:
        aPdu = new LEDetonationPdu();
        break;

      case CREATE_ENTITY_RELIABLE:
        aPdu = new CreateEntityReliablePdu();
        break;

      case REMOVE_ENTITY_RELIABLE:
        aPdu = new RemoveEntityReliablePdu();
        break;

      case START_RESUME_RELIABLE:
        aPdu = new StartResumeReliablePdu();
        break;

      case STOP_FREEZE_RELIABLE:
        aPdu = new StopFreezeReliablePdu();
        break;

      case ACKNOWLEDGE_RELIABLE:
        aPdu = new AcknowledgeReliablePdu();
        break;

      case ACTION_REQUEST_RELIABLE:
        aPdu = new ActionRequestReliablePdu();
        break;

      case ACTION_RESPONSE_RELIABLE:
        aPdu = new ActionResponseReliablePdu();
        break;

      case DATA_QUERY_RELIABLE:
        aPdu = new DataQueryReliablePdu();
        break;

      case SET_DATA_RELIABLE:
        aPdu = new SetDataReliablePdu();
        break;

      case DATA_RELIABLE:
        aPdu = new DataReliablePdu();
        break;

      case EVENT_REPORT_RELIABLE:
        aPdu = new EventReportReliablePdu();
        break;

      case COMMENT_RELIABLE:
        aPdu = new CommentReliablePdu();
        break;

      case RECORD_RELIABLE:
        aPdu = new RecordReliablePdu();
        break;

      case SET_RECORD_RELIABLE:
        aPdu = new SetRecordReliablePdu();
        break;

      case RECORD_QUERY_RELIABLE:
        aPdu = new RecordQueryReliablePdu();
        break;

      case COLLISION_ELASTIC:
        aPdu = new CollisionElasticPdu();
        break;

      case ENTITY_STATE_UPDATE:
        aPdu = new EntityStateUpdatePdu();
        break;

      case DIRECTED_ENERGY_FIRE:
        aPdu = new DirectedEnergyFirePdu();
        break;

      case ENTITY_DAMAGE_STATUS:
        aPdu = new EntityDamageStatusPdu();
        break;

      case INFORMATION_OPERATIONS_ACTION:
        aPdu = new InformationOperationsActionPdu();
        break;

      case INFORMATION_OPERATIONS_REPORT:
        aPdu = new InformationOperationsReportPdu();
        break;

      case ATTRIBUTE:
        aPdu = new AttributePdu();
        break;

      default:
        System.out.println("PDU not implemented. Type = " + pduType + "\n");
    }   // end switch

    if (aPdu != null) {
      if (buff != null) {
        try {
          aPdu.unmarshal(buff);
        }
        catch (Exception ex) {
          System.err.println("error unmarshalling " + pduType);
          System.err.println(ex);
        }
      }
    }

    return aPdu;
  }

    /**
     * Decodes datagram contents with bundled PDUs.As a performance hack DIS may
     * include several PDUs in one datagram. Typically the max datagram size is
     * 8K (above that it runs into some issues with the default incoming socket
     * buffer size) but it may be more. The PDUs may be of multiple types and
     * different lengths, so we have to step through the buffer and depend on
     * the reported PDU length in the header. There's a lot that can go wrong.
     * If something blows up, we return all the decoded PDUs we can.<p>
     *
     * @param data
     * @param length
     * @return List of PDUs decoded
     */
    public List<Pdu> getPdusFromBundle(byte data[], int length) {
        
        // All the PDUs in this bundle we were able to decode
        List<Pdu> pdus = new ArrayList<>();
        
        // The start point of a PDU in the data. We advance this by the size
        // of each PDU as we read it.
        int pduStartPointInData = 0;
        byte remaining[];
        Pdu pdu;
        int pduLength;

        while (true) {
            // This is inefficient, but screw it. Give the GC a workout. Create a new
            // data array from where the last PDU left off to the end of the original
            // data array. This lets us reuse a bunch of old code.

            remaining = Arrays.copyOfRange(data, pduStartPointInData, length);

            try {
                // Decode one PDU
                pdu = this.createPdu(remaining);

                // If the read is muffed somehow, give up on decoding the rest of
                // the data
                if (pdu == null) {
                    //System.out.println("Stopped reading bundled PDU due to bad PDU");
                    break;
                } else // otherwise add it to the list of PDUs we have decoded from this UDP packet
                {
                    pdus.add(pdu);
                }

                // Advance the index to the start of the next PDU
                pduLength = pdu.getMarshalledSize();

                pduStartPointInData = pduStartPointInData + pduLength;

                //System.out.println("PDUStartPoint:" + pduStartPointInData + " data: " + length);
                // Have we read all the data?
                if (pduStartPointInData >= length) {
                    //System.out.println("Out of data to read" + pduStartPointInData + " data length:" + length);
                    break;
                }

            } catch (Exception e) {
                System.err.println("Problems decoding multiple PDUs in datagram; decoded as may as possible");
                break;
            }
        } // end while

        return pdus;
    }
}
