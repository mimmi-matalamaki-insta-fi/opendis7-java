/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 323,
 * marshal size 8;
 * EntityAssociationPhysicalAssociationType has 28 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum EntityAssociationPhysicalAssociationType 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Not Specified */
    // autogenerated using string template disenumpart2.txt
    NOT_SPECIFIED (0, "Not Specified"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed in Air (Single Hook, Not Specified) */
    // autogenerated using string template disenumpart2.txt
    TOWED_IN_AIR_SINGLE_HOOK_NOT_SPECIFIED (1, "Towed in Air (Single Hook, Not Specified)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed on Land */
    // autogenerated using string template disenumpart2.txt
    TOWED_ON_LAND (2, "Towed on Land"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed on Water Surface */
    // autogenerated using string template disenumpart2.txt
    TOWED_ON_WATER_SURFACE (3, "Towed on Water Surface"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed Underwater */
    // autogenerated using string template disenumpart2.txt
    TOWED_UNDERWATER (4, "Towed Underwater"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mounted Attached */
    // autogenerated using string template disenumpart2.txt
    MOUNTED_ATTACHED (5, "Mounted Attached"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mounted Unattached and Unsupported */
    // autogenerated using string template disenumpart2.txt
    MOUNTED_UNATTACHED_AND_UNSUPPORTED (6, "Mounted Unattached and Unsupported"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mounted Unattached and Supported */
    // autogenerated using string template disenumpart2.txt
    MOUNTED_UNATTACHED_AND_SUPPORTED (7, "Mounted Unattached and Supported"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed in Air (Center Hook) */
    // autogenerated using string template disenumpart2.txt
    TOWED_IN_AIR_CENTER_HOOK (8, "Towed in Air (Center Hook)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed in Air (Forward Hook) */
    // autogenerated using string template disenumpart2.txt
    TOWED_IN_AIR_FORWARD_HOOK (9, "Towed in Air (Forward Hook)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed in Air (Aft Hook) */
    // autogenerated using string template disenumpart2.txt
    TOWED_IN_AIR_AFT_HOOK (10, "Towed in Air (Aft Hook)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed in Air (Tandem Hook - Fore and Aft) */
    // autogenerated using string template disenumpart2.txt
    TOWED_IN_AIR_TANDEM_HOOK_FORE_AND_AFT (11, "Towed in Air (Tandem Hook - Fore and Aft)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed in Air (Mismanaged Tandem - Fore and Center) */
    // autogenerated using string template disenumpart2.txt
    TOWED_IN_AIR_MISMANAGED_TANDEM_FORE_AND_CENTER (12, "Towed in Air (Mismanaged Tandem - Fore and Center)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed in Air (Mismanaged Tandem - Center and Aft) */
    // autogenerated using string template disenumpart2.txt
    TOWED_IN_AIR_MISMANAGED_TANDEM_CENTER_AND_AFT (13, "Towed in Air (Mismanaged Tandem - Center and Aft)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Towed in Air (All Hooks) */
    // autogenerated using string template disenumpart2.txt
    TOWED_IN_AIR_ALL_HOOKS (14, "Towed in Air (All Hooks)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Hoisted */
    // autogenerated using string template disenumpart2.txt
    HOISTED (15, "Hoisted"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Restrained to a Lifeform */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Restrained to a Lifeform"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Restrained to a Platform */
    // autogenerated using string template disenumpart2.txt
    RESTRAINED_TO_A_PLATFORM (31, "Restrained to a Platform"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Restrained to an Object */
    // autogenerated using string template disenumpart2.txt
    RESTRAINED_TO_AN_OBJECT (32, "Restrained to an Object"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Refueling Operation */
    // autogenerated using string template disenumpart2.txt
    EVENT_REPORT_RELIABLE (61, "Refueling Operation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Search and Rescue Basket */
    // autogenerated using string template disenumpart2.txt
    COMMENT_RELIABLE (62, "Search and Rescue Basket"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Search and Rescue Rescue Collar */
    // autogenerated using string template disenumpart2.txt
    RECORD_RELIABLE (63, "Search and Rescue Rescue Collar"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Engagement/Object 2 is Being Engaged */
    // autogenerated using string template disenumpart2.txt
    SET_RECORD_RELIABLE (64, "Engagement/Object 2 is Being Engaged"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Return To Base/Object 2 is the Destination Object */
    // autogenerated using string template disenumpart2.txt
    RECORD_QUERY_RELIABLE (65, "Return To Base/Object 2 is the Destination Object"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Line between Communication Towers */
    // autogenerated using string template disenumpart2.txt
    LINE_BETWEEN_COMMUNICATION_TOWERS (90, "Line between Communication Towers"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Line Between Power Towers */
    // autogenerated using string template disenumpart2.txt
    LINE_BETWEEN_POWER_TOWERS (91, "Line Between Power Towers"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Indoors */
    // autogenerated using string template disenumpart2.txt
    INDOORS (92, "Indoors"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Top Surface */
    // autogenerated using string template disenumpart2.txt
    TOP_SURFACE (93, "Top Surface");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    EntityAssociationPhysicalAssociationType(int value, String description)
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
    public static EntityAssociationPhysicalAssociationType getEnumForValue(int value)
    {
       for (EntityAssociationPhysicalAssociationType nextEnum : EntityAssociationPhysicalAssociationType.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum EntityAssociationPhysicalAssociationType");
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
    public static EntityAssociationPhysicalAssociationType unmarshalEnum (DataInputStream dis) throws Exception
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
    public static EntityAssociationPhysicalAssociationType unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
   * Provide name
   * @return  name
   */
    public String getName()
    {
        return name();
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
