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
 *  UID 392,
 * marshal size 4;
 * AppearanceLifeFormPosture has 16 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum AppearanceLifeFormPosture 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Not Specified */
    // autogenerated using string template disenumpart2.txt
    NOT_SPECIFIED (0, "Not Specified"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Upright, Standing Still */
    // autogenerated using string template disenumpart2.txt
    UPRIGHT_STANDING_STILL (1, "Upright, Standing Still"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Upright, Walking */
    // autogenerated using string template disenumpart2.txt
    UPRIGHT_WALKING (2, "Upright, Walking"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Upright, Running */
    // autogenerated using string template disenumpart2.txt
    UPRIGHT_RUNNING (3, "Upright, Running"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Kneeling */
    // autogenerated using string template disenumpart2.txt
    KNEELING (4, "Kneeling"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Prone */
    // autogenerated using string template disenumpart2.txt
    PRONE (5, "Prone"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Crawling */
    // autogenerated using string template disenumpart2.txt
    CRAWLING (6, "Crawling"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Swimming */
    // autogenerated using string template disenumpart2.txt
    SWIMMING (7, "Swimming"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Parachuting */
    // autogenerated using string template disenumpart2.txt
    PARACHUTING (8, "Parachuting"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Jumping */
    // autogenerated using string template disenumpart2.txt
    JUMPING (9, "Jumping"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sitting */
    // autogenerated using string template disenumpart2.txt
    SITTING (10, "Sitting"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Squatting */
    // autogenerated using string template disenumpart2.txt
    SQUATTING (11, "Squatting"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Crouching */
    // autogenerated using string template disenumpart2.txt
    CROUCHING (12, "Crouching"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wading */
    // autogenerated using string template disenumpart2.txt
    WADING (13, "Wading"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Surrender */
    // autogenerated using string template disenumpart2.txt
    SURRENDER (14, "Surrender"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Detained */
    // autogenerated using string template disenumpart2.txt
    DETAINED (15, "Detained");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    AppearanceLifeFormPosture(int value, String description)
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
      return 4;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static AppearanceLifeFormPosture getEnumForValue(int value)
    {
       for (AppearanceLifeFormPosture nextEnum : AppearanceLifeFormPosture.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum AppearanceLifeFormPosture");
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
    public static AppearanceLifeFormPosture unmarshalEnum (DataInputStream dis) throws Exception
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
    public static AppearanceLifeFormPosture unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
