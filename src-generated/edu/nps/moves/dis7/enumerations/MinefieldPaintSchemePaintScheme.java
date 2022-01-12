// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 425,
 * marshal size 6;
 * MinefieldPaintSchemePaintScheme has 19 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum MinefieldPaintSchemePaintScheme 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Standard */
    // autogenerated using string template disenumpart2.txt
    STANDARD (1, "Standard"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage Desert */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_DESERT (2, "Camouflage Desert"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage Jungle */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_JUNGLE (3, "Camouflage Jungle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage Snow */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_SNOW (4, "Camouflage Snow"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage Gravel */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_GRAVEL (5, "Camouflage Gravel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage Pavement */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_PAVEMENT (6, "Camouflage Pavement"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage Sand */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_SAND (7, "Camouflage Sand"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Natural Wood */
    // autogenerated using string template disenumpart2.txt
    NATURAL_WOOD (8, "Natural Wood"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Clear */
    // autogenerated using string template disenumpart2.txt
    CLEAR (9, "Clear"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Red */
    // autogenerated using string template disenumpart2.txt
    RED (10, "Red"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Blue */
    // autogenerated using string template disenumpart2.txt
    BLUE (11, "Blue"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Green */
    // autogenerated using string template disenumpart2.txt
    GREEN (12, "Green"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Olive */
    // autogenerated using string template disenumpart2.txt
    OLIVE (13, "Olive"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** White */
    // autogenerated using string template disenumpart2.txt
    WHITE (14, "White"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tan */
    // autogenerated using string template disenumpart2.txt
    TAN (15, "Tan"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Black */
    // autogenerated using string template disenumpart2.txt
    BLACK (16, "Black"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Yellow */
    // autogenerated using string template disenumpart2.txt
    YELLOW (17, "Yellow"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Brown */
    // autogenerated using string template disenumpart2.txt
    BROWN (18, "Brown"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    MinefieldPaintSchemePaintScheme(int value, String description)
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
      return 6;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static MinefieldPaintSchemePaintScheme getEnumForValue(int value)
    {
       for (MinefieldPaintSchemePaintScheme nextEnum : MinefieldPaintSchemePaintScheme.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum MinefieldPaintSchemePaintScheme");
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
    public static MinefieldPaintSchemePaintScheme unmarshalEnum (DataInputStream dis) throws Exception
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
    public static MinefieldPaintSchemePaintScheme unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
