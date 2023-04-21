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
 *  UID 517,
 * marshal size 8;
 * LifeFormHumanSpecificGrenadeLaunchingMachineGun has 20 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum LifeFormHumanSpecificGrenadeLaunchingMachineGun 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x53mm HK GMG */
    // autogenerated using string template disenumpart2.txt
    _40X53MM_HK_GMG (20, "40x53mm HK GMG"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x53mm Mk47 Striker */
    // autogenerated using string template disenumpart2.txt
    _40X53MM_MK47_STRIKER (25, "40x53mm Mk47 Striker"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm M75 */
    // autogenerated using string template disenumpart2.txt
    _40MM_M75 (26, "40mm M75"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm M129 */
    // autogenerated using string template disenumpart2.txt
    _40MM_M129 (27, "40mm M129"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm XM 174 */
    // autogenerated using string template disenumpart2.txt
    IDENTIFICATION_FRIEND_OR_FOE (28, "40x46mm XM 174"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Mk18 Mod 0 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_MK18_MOD_0 (29, "40x46mm Mk18 Mod 0"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x53mm Mk19 */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "40x53mm Mk19"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Mk20 Mod 0 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_MK20_MOD_0 (31, "40x46mm Mk20 Mod 0"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 30x29mm RAG-30/SAG-30 */
    // autogenerated using string template disenumpart2.txt
    _30X29MM_RAG_30_SAG_30 (40, "30x29mm RAG-30/SAG-30"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 30x29mm AGS-17 Plamya */
    // autogenerated using string template disenumpart2.txt
    _30X29MM_AGS_17_PLAMYA (41, "30x29mm AGS-17 Plamya"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 30x29mm AGS-30 Atlant */
    // autogenerated using string template disenumpart2.txt
    _30X29MM_AGS_30_ATLANT (42, "30x29mm AGS-30 Atlant"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm VOG AGS-40 Balkan */
    // autogenerated using string template disenumpart2.txt
    _40MM_VOG_AGS_40_BALKAN (43, "40mm VOG AGS-40 Balkan"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x53mm SB LAG 40 */
    // autogenerated using string template disenumpart2.txt
    _40X53MM_SB_LAG_40 (44, "40x53mm SB LAG 40"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x53mm Vektor Y3 */
    // autogenerated using string template disenumpart2.txt
    LIVE_ENTITY_DETONATION (50, "40x53mm Vektor Y3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x53mm CIS 40 */
    // autogenerated using string template disenumpart2.txt
    ACKNOWLEDGE_RELIABLE (55, "40x53mm CIS 40"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x56mm Howa Type-96 */
    // autogenerated using string template disenumpart2.txt
    DATA_RELIABLE (60, "40x56mm Howa Type-96"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x53mm Daewoo Precision Industries K4 */
    // autogenerated using string template disenumpart2.txt
    RECORD_QUERY_RELIABLE (65, "40x53mm Daewoo Precision Industries K4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 25x59mm XM307 Advanced Crew Served Weapon */
    // autogenerated using string template disenumpart2.txt
    _25X59MM_XM307_ADVANCED_CREW_SERVED_WEAPON (70, "25x59mm XM307 Advanced Crew Served Weapon"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 35x32mm QLZ87 */
    // autogenerated using string template disenumpart2.txt
    _35X32MM_QLZ87 (80, "35x32mm QLZ87");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    LifeFormHumanSpecificGrenadeLaunchingMachineGun(int value, String description)
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
    public static LifeFormHumanSpecificGrenadeLaunchingMachineGun getEnumForValue(int value)
    {
       for (LifeFormHumanSpecificGrenadeLaunchingMachineGun nextEnum : LifeFormHumanSpecificGrenadeLaunchingMachineGun.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum LifeFormHumanSpecificGrenadeLaunchingMachineGun");
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
    public static LifeFormHumanSpecificGrenadeLaunchingMachineGun unmarshalEnum (DataInputStream dis) throws Exception
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
    public static LifeFormHumanSpecificGrenadeLaunchingMachineGun unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
