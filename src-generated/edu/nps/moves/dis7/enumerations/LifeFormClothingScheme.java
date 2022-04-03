// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 539,
 * marshal size 8;
 * LifeFormClothingScheme has 17 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum LifeFormClothingScheme 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Default */
    // autogenerated using string template disenumpart2.txt
    DEFAULT (0, "Default"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Solid Color (Primary) */
    // autogenerated using string template disenumpart2.txt
    SOLID_COLOR_PRIMARY (1, "Solid Color (Primary)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Two Tone (top primary, bottom secondary) */
    // autogenerated using string template disenumpart2.txt
    TWO_TONE_TOP_PRIMARY_BOTTOM_SECONDARY (2, "Two Tone (top primary, bottom secondary)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Uniformed Solid Color (Military) */
    // autogenerated using string template disenumpart2.txt
    UNIFORMED_SOLID_COLOR_MILITARY (3, "Uniformed Solid Color (Military)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Uniformed Solid Color (Civilian) */
    // autogenerated using string template disenumpart2.txt
    UNIFORMED_SOLID_COLOR_CIVILIAN (4, "Uniformed Solid Color (Civilian)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Desert */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_DESERT (5, "Camouflage, Desert"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Jungle */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_JUNGLE (6, "Camouflage, Jungle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Snow */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_SNOW (7, "Camouflage, Snow"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Gravel */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_GRAVEL (8, "Camouflage, Gravel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Pavement */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_PAVEMENT (9, "Camouflage, Pavement"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Sand */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_SAND (10, "Camouflage, Sand"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Forest */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_FOREST (11, "Camouflage, Forest"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Naked */
    // autogenerated using string template disenumpart2.txt
    NAKED (12, "Naked"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Topless (but not bottomless) */
    // autogenerated using string template disenumpart2.txt
    TOPLESS_BUT_NOT_BOTTOMLESS (13, "Topless (but not bottomless)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Bottomless (but not topless) */
    // autogenerated using string template disenumpart2.txt
    BOTTOMLESS_BUT_NOT_TOPLESS (14, "Bottomless (but not topless)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Indigenous Clothing */
    // autogenerated using string template disenumpart2.txt
    INDIGENOUS_CLOTHING (15, "Indigenous Clothing"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Traditional Clothing */
    // autogenerated using string template disenumpart2.txt
    TRADITIONAL_CLOTHING (16, "Traditional Clothing"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    LifeFormClothingScheme(int value, String description)
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
    public static LifeFormClothingScheme getEnumForValue(int value)
    {
       for (LifeFormClothingScheme nextEnum : LifeFormClothingScheme.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum LifeFormClothingScheme");
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
    public static LifeFormClothingScheme unmarshalEnum (DataInputStream dis) throws Exception
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
    public static LifeFormClothingScheme unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
