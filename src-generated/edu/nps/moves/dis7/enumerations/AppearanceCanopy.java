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
 *  UID 387,
 * marshal size 3;
 * AppearanceCanopy has 7 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum AppearanceCanopy 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Not Applicable */
    // autogenerated using string template disenumpart2.txt
    NOT_APPLICABLE (0, "Not Applicable"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Single Canopy/Single Troop Door Closed */
    // autogenerated using string template disenumpart2.txt
    SINGLE_CANOPY_SINGLE_TROOP_DOOR_CLOSED (1, "Single Canopy/Single Troop Door Closed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Front and Rear Canopy/Left and Right Troop Door Closed */
    // autogenerated using string template disenumpart2.txt
    FRONT_AND_REAR_CANOPY_LEFT_AND_RIGHT_TROOP_DOOR_CLOSED (2, "Front and Rear Canopy/Left and Right Troop Door Closed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Front Canopy/Left Troop Door Open */
    // autogenerated using string template disenumpart2.txt
    FRONT_CANOPY_LEFT_TROOP_DOOR_OPEN (3, "Front Canopy/Left Troop Door Open"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Single Canopy/Single Troop Door Open */
    // autogenerated using string template disenumpart2.txt
    SINGLE_CANOPY_SINGLE_TROOP_DOOR_OPEN (4, "Single Canopy/Single Troop Door Open"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Rear Canopy/Right Troop Door Open */
    // autogenerated using string template disenumpart2.txt
    REAR_CANOPY_RIGHT_TROOP_DOOR_OPEN (5, "Rear Canopy/Right Troop Door Open"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Front and Rear Canopy/Left and Right Troop Door Open */
    // autogenerated using string template disenumpart2.txt
    FRONT_AND_REAR_CANOPY_LEFT_AND_RIGHT_TROOP_DOOR_OPEN (6, "Front and Rear Canopy/Left and Right Troop Door Open");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    AppearanceCanopy(int value, String description)
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
      return 3;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static AppearanceCanopy getEnumForValue(int value)
    {
       for (AppearanceCanopy nextEnum : AppearanceCanopy.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum AppearanceCanopy");
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
    public static AppearanceCanopy unmarshalEnum (DataInputStream dis) throws Exception
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
    public static AppearanceCanopy unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
