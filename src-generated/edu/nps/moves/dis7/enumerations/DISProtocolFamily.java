// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 5,
 * marshal size 8;
 * DISProtocolFamily has 14 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum DISProtocolFamily 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Entity Information/Interaction */
    // autogenerated using string template disenumpart2.txt
    ENTITY_INFORMATION_INTERACTION (1, "Entity Information/Interaction"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Warfare */
    // autogenerated using string template disenumpart2.txt
    WARFARE (2, "Warfare"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Logistics */
    // autogenerated using string template disenumpart2.txt
    LOGISTICS (3, "Logistics"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Radio Communications */
    // autogenerated using string template disenumpart2.txt
    RADIO_COMMUNICATIONS (4, "Radio Communications"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Simulation Management */
    // autogenerated using string template disenumpart2.txt
    SIMULATION_MANAGEMENT (5, "Simulation Management"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Distributed Emission Regeneration */
    // autogenerated using string template disenumpart2.txt
    DISTRIBUTED_EMISSION_REGENERATION (6, "Distributed Emission Regeneration"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Entity Management */
    // autogenerated using string template disenumpart2.txt
    ENTITY_MANAGEMENT (7, "Entity Management"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Minefield */
    // autogenerated using string template disenumpart2.txt
    MINEFIELD (8, "Minefield"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Synthetic Environment */
    // autogenerated using string template disenumpart2.txt
    SYNTHETIC_ENVIRONMENT (9, "Synthetic Environment"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Simulation Management with Reliability */
    // autogenerated using string template disenumpart2.txt
    SIMULATION_MANAGEMENT_WITH_RELIABILITY (10, "Simulation Management with Reliability"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Live Entity (LE) Information/Interaction */
    // autogenerated using string template disenumpart2.txt
    LIVE_ENTITY_LE_INFORMATION_INTERACTION (11, "Live Entity (LE) Information/Interaction"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Non-Real-Time */
    // autogenerated using string template disenumpart2.txt
    NON_REAL_TIME (12, "Non-Real-Time"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Information Operations */
    // autogenerated using string template disenumpart2.txt
    INFORMATION_OPERATIONS (13, "Information Operations"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    DISProtocolFamily(int value, String description)
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
      return 8;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static DISProtocolFamily getEnumForValue(int value)
    {
       for (DISProtocolFamily nextEnum : DISProtocolFamily.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum DISProtocolFamily");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_8.txt

    private boolean TRACE = false;

    /** Set tracing on/off for this object 
     * @param value whether tracing is on or off */
    public void setTRACE (boolean value)
    {
        TRACE = value;
    }

    /** Whether tracing is on or off for this object
     * @return whether tracing is on or off */
    public boolean getTRACE ()
    {
        return TRACE;
    }

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.put((byte)getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static DISProtocolFamily unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static DISProtocolFamily unmarshalEnum(ByteBuffer byteBuffer) throws Exception
    {
        /*
        try {
            value = (int)byteBuffer.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue(byteBuffer.get());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
  /**
   * Provide simple identifier
   * @return class name, value and name
   */
    @Override
    public String toString()
    {
        String padding = new String();
        if (this.getClass().getName().endsWith("DisPduType") && (getValue() < 10))
            padding = "0"; // leading zero for column spacing
        String result = this.getClass().getSimpleName() + " " + padding + getValue() + " " + name();
        if (getTRACE())
            System.out.println ("*** enum " + this.getClass().getSimpleName() + " name=" + name() + ", value=" + getValue() + "; " +
               result); // debug diagnostic
        return result;
    }
}
