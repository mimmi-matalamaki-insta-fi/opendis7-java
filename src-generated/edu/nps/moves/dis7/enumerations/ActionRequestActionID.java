// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 71,
 * marshal size 32;
 * ActionRequestActionID has 65 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum ActionRequestActionID 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Local storage of the requested information */
    // autogenerated using string template disenumpart2.txt
    LOCAL_STORAGE_OF_THE_REQUESTED_INFORMATION (1, "Local storage of the requested information"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Inform SM of event 'ran out of ammunition' */
    // autogenerated using string template disenumpart2.txt
    INFORM_SM_OF_EVENT_RAN_OUT_OF_AMMUNITION (2, "Inform SM of event 'ran out of ammunition'"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Inform SM of event 'killed in action' */
    // autogenerated using string template disenumpart2.txt
    INFORM_SM_OF_EVENT_KILLED_IN_ACTION (3, "Inform SM of event 'killed in action'"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Inform SM of event 'damage' */
    // autogenerated using string template disenumpart2.txt
    INFORM_SM_OF_EVENT_DAMAGE (4, "Inform SM of event 'damage'"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Inform SM of event 'mobility disabled' */
    // autogenerated using string template disenumpart2.txt
    INFORM_SM_OF_EVENT_MOBILITY_DISABLED (5, "Inform SM of event 'mobility disabled'"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Inform SM of event 'fire disabled' */
    // autogenerated using string template disenumpart2.txt
    INFORM_SM_OF_EVENT_FIRE_DISABLED (6, "Inform SM of event 'fire disabled'"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Inform SM of event 'ran out of fuel' */
    // autogenerated using string template disenumpart2.txt
    INFORM_SM_OF_EVENT_RAN_OUT_OF_FUEL (7, "Inform SM of event 'ran out of fuel'"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Recall checkpoint data */
    // autogenerated using string template disenumpart2.txt
    RECALL_CHECKPOINT_DATA (8, "Recall checkpoint data"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Recall initial parameters */
    // autogenerated using string template disenumpart2.txt
    RECALL_INITIAL_PARAMETERS (9, "Recall initial parameters"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Initiate tether-lead */
    // autogenerated using string template disenumpart2.txt
    INITIATE_TETHER_LEAD (10, "Initiate tether-lead"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Initiate tether-follow */
    // autogenerated using string template disenumpart2.txt
    INITIATE_TETHER_FOLLOW (11, "Initiate tether-follow"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Unthether */
    // autogenerated using string template disenumpart2.txt
    UNTHETHER (12, "Unthether"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Initiate service station resupply */
    // autogenerated using string template disenumpart2.txt
    INITIATE_SERVICE_STATION_RESUPPLY (13, "Initiate service station resupply"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Initiate tailgate resupply */
    // autogenerated using string template disenumpart2.txt
    INITIATE_TAILGATE_RESUPPLY (14, "Initiate tailgate resupply"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Initiate hitch lead */
    // autogenerated using string template disenumpart2.txt
    INITIATE_HITCH_LEAD (15, "Initiate hitch lead"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Initiate hitch follow */
    // autogenerated using string template disenumpart2.txt
    INITIATE_HITCH_FOLLOW (16, "Initiate hitch follow"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Unhitch */
    // autogenerated using string template disenumpart2.txt
    UNHITCH (17, "Unhitch"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mount */
    // autogenerated using string template disenumpart2.txt
    MOUNT (18, "Mount"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dismount */
    // autogenerated using string template disenumpart2.txt
    DISMOUNT (19, "Dismount"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Start DRC (Daily Readiness Check) */
    // autogenerated using string template disenumpart2.txt
    START_DRC_DAILY_READINESS_CHECK (20, "Start DRC (Daily Readiness Check)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Stop DRC */
    // autogenerated using string template disenumpart2.txt
    STOP_DRC (21, "Stop DRC"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Data Query */
    // autogenerated using string template disenumpart2.txt
    DATA_QUERY (22, "Data Query"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Status Request */
    // autogenerated using string template disenumpart2.txt
    STATUS_REQUEST (23, "Status Request"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Send Object State Data */
    // autogenerated using string template disenumpart2.txt
    SEND_OBJECT_STATE_DATA (24, "Send Object State Data"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Reconstitute */
    // autogenerated using string template disenumpart2.txt
    RECONSTITUTE (25, "Reconstitute"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Lock Site Configuration */
    // autogenerated using string template disenumpart2.txt
    LOCK_SITE_CONFIGURATION (26, "Lock Site Configuration"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Unlock Site Configuration */
    // autogenerated using string template disenumpart2.txt
    UNLOCK_SITE_CONFIGURATION (27, "Unlock Site Configuration"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Update Site Configuration */
    // autogenerated using string template disenumpart2.txt
    IDENTIFICATION_FRIEND_OR_FOE (28, "Update Site Configuration"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Query Site Configuration */
    // autogenerated using string template disenumpart2.txt
    QUERY_SITE_CONFIGURATION (29, "Query Site Configuration"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tethering Information */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Tethering Information"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mount Intent */
    // autogenerated using string template disenumpart2.txt
    MOUNT_INTENT (31, "Mount Intent"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Accept Subscription */
    // autogenerated using string template disenumpart2.txt
    ACCEPT_SUBSCRIPTION (33, "Accept Subscription"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Unsubscribe */
    // autogenerated using string template disenumpart2.txt
    UNSUBSCRIBE (34, "Unsubscribe"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Teleport entity */
    // autogenerated using string template disenumpart2.txt
    TELEPORT_ENTITY (35, "Teleport entity"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Change aggregate state */
    // autogenerated using string template disenumpart2.txt
    CHANGE_AGGREGATE_STATE (36, "Change aggregate state"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Request Start PDU */
    // autogenerated using string template disenumpart2.txt
    REQUEST_START_PDU (37, "Request Start PDU"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wakeup get ready for initialization */
    // autogenerated using string template disenumpart2.txt
    WAKEUP_GET_READY_FOR_INITIALIZATION (38, "Wakeup get ready for initialization"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Initialize internal parameters */
    // autogenerated using string template disenumpart2.txt
    INITIALIZE_INTERNAL_PARAMETERS (39, "Initialize internal parameters"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Send plan data */
    // autogenerated using string template disenumpart2.txt
    SEND_PLAN_DATA (40, "Send plan data"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Synchronize internal clocks */
    // autogenerated using string template disenumpart2.txt
    SYNCHRONIZE_INTERNAL_CLOCKS (41, "Synchronize internal clocks"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Run */
    // autogenerated using string template disenumpart2.txt
    RUN (42, "Run"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Save internal parameters */
    // autogenerated using string template disenumpart2.txt
    SAVE_INTERNAL_PARAMETERS (43, "Save internal parameters"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Simulate malfunction */
    // autogenerated using string template disenumpart2.txt
    SIMULATE_MALFUNCTION (44, "Simulate malfunction"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Join exercise */
    // autogenerated using string template disenumpart2.txt
    JOIN_EXERCISE (45, "Join exercise"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Resign exercise */
    // autogenerated using string template disenumpart2.txt
    TIME_SPACE_POSITION_INFORMATION (46, "Resign exercise"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Time advance */
    // autogenerated using string template disenumpart2.txt
    TIME_ADVANCE (47, "Time advance"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Command from Simulator */
    // autogenerated using string template disenumpart2.txt
    COMMAND_FROM_SIMULATOR (48, "Command from Simulator"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TACCSF LOS Request-Type 1 */
    // autogenerated using string template disenumpart2.txt
    TACCSF_LOS_REQUEST_TYPE_1 (100, "TACCSF LOS Request-Type 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TACCSF LOS Request-Type 2 */
    // autogenerated using string template disenumpart2.txt
    TACCSF_LOS_REQUEST_TYPE_2 (101, "TACCSF LOS Request-Type 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAF DMO DDCP Join Transaction Join Request Message, The requested range is separated from and chosen to be non-intersecting with values in the 2006 Enum Document. */
    // autogenerated using string template disenumpart2.txt
    CAF_DMO_DDCP_JOIN_TRANSACTION_JOIN_REQUEST_MESSAGE (1001, "CAF DMO DDCP Join Transaction Join Request Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAF DMO DDCP Set Playback Window Transaction Set Playback Window Request Message */
    // autogenerated using string template disenumpart2.txt
    CAF_DMO_DDCP_SET_PLAYBACK_WINDOW_TRANSACTION_SET_PLAYBACK_WINDOW_REQUEST_MESSAGE (1002, "CAF DMO DDCP Set Playback Window Transaction Set Playback Window Request Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAF DMO DDCP Load Mission Recording Transaction Load Mission Recording Request Message */
    // autogenerated using string template disenumpart2.txt
    CAF_DMO_DDCP_LOAD_MISSION_RECORDING_TRANSACTION_LOAD_MISSION_RECORDING_REQUEST_MESSAGE (1003, "CAF DMO DDCP Load Mission Recording Transaction Load Mission Recording Request Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAF DMO DDCP Cue Transaction Cue Request Message */
    // autogenerated using string template disenumpart2.txt
    CAF_DMO_DDCP_CUE_TRANSACTION_CUE_REQUEST_MESSAGE (1004, "CAF DMO DDCP Cue Transaction Cue Request Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAF DMO DDCP Play Transaction Play Request Message */
    // autogenerated using string template disenumpart2.txt
    CAF_DMO_DDCP_PLAY_TRANSACTION_PLAY_REQUEST_MESSAGE (1005, "CAF DMO DDCP Play Transaction Play Request Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAF DMO DDCP Stop Transaction Stop Request Message */
    // autogenerated using string template disenumpart2.txt
    CAF_DMO_DDCP_STOP_TRANSACTION_STOP_REQUEST_MESSAGE (1006, "CAF DMO DDCP Stop Transaction Stop Request Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAF DMO DDCP Pause Transaction Pause Request Message */
    // autogenerated using string template disenumpart2.txt
    CAF_DMO_DDCP_PAUSE_TRANSACTION_PAUSE_REQUEST_MESSAGE (1007, "CAF DMO DDCP Pause Transaction Pause Request Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Reserved for DDCP */
    // autogenerated using string template disenumpart2.txt
    RESERVED_FOR_DDCP (1008, "Reserved for DDCP"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAF DMO DDCP End Transaction End Request Message */
    // autogenerated using string template disenumpart2.txt
    CAF_DMO_DDCP_END_TRANSACTION_END_REQUEST_MESSAGE (1009, "CAF DMO DDCP End Transaction End Request Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sling Load Capability Request */
    // autogenerated using string template disenumpart2.txt
    SLING_LOAD_CAPABILITY_REQUEST (4300, "Sling Load Capability Request"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sling Load Attach Request */
    // autogenerated using string template disenumpart2.txt
    SLING_LOAD_ATTACH_REQUEST (4301, "Sling Load Attach Request"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sling Load Release Request */
    // autogenerated using string template disenumpart2.txt
    SLING_LOAD_RELEASE_REQUEST (4302, "Sling Load Release Request"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Airmount Mount Request */
    // autogenerated using string template disenumpart2.txt
    AIRMOUNT_MOUNT_REQUEST (4303, "Airmount Mount Request"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Airmount Dismount Request */
    // autogenerated using string template disenumpart2.txt
    AIRMOUNT_DISMOUNT_REQUEST (4304, "Airmount Dismount Request"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Airmount Information Request */
    // autogenerated using string template disenumpart2.txt
    AIRMOUNT_INFORMATION_REQUEST (4305, "Airmount Information Request"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    ActionRequestActionID(int value, String description)
    {
        this.value = value;
        this.description = description;
    }
    /** Provide enumeration value
      * @return integer value */
    public int getValue()
    {
        return value;
    }

    /** Provide enumeration description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /** bit width for this enumeration
     * @return number of bits wide
     */
    public static int getEnumBitWidth()
    {
      return 32;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static ActionRequestActionID getEnumForValue(int value)
    {
       for (ActionRequestActionID nextEnum : ActionRequestActionID.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum ActionRequestActionID");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_32.txt

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeInt(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output */
    public void marshal(ByteBuffer byteBuffer)
    {
        byteBuffer.putInt(getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static ActionRequestActionID unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readInt());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @return enumeration of interest */
    public static ActionRequestActionID unmarshalEnum (ByteBuffer byteBuffer)
    {
        return getEnumForValue(byteBuffer.getInt());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 4; // 32 bits
    }
    
    @Override
    public String toString()
    {
        return "ActionRequestActionID: " + getValue() + " " + name();
    }
}
