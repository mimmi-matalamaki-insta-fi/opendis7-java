// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 196,
 * marshal size 12;
 * MinefieldSensorTypesRADAR has 6 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum MinefieldSensorTypesRADAR 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Generic */
    // autogenerated using string template disenumpart2.txt
    GENERIC (0, "Generic"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Generic GPR */
    // autogenerated using string template disenumpart2.txt
    GENERIC_GPR (1, "Generic GPR"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GSTAMIDS I */
    // autogenerated using string template disenumpart2.txt
    GSTAMIDS_I (2, "GSTAMIDS I"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GSTAMIDS II */
    // autogenerated using string template disenumpart2.txt
    GSTAMIDS_II (3, "GSTAMIDS II"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HSTAMIDS I */
    // autogenerated using string template disenumpart2.txt
    HSTAMIDS_I (4, "HSTAMIDS I"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HSTAMIDS II */
    // autogenerated using string template disenumpart2.txt
    HSTAMIDS_II (5, "HSTAMIDS II"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    MinefieldSensorTypesRADAR(int value, String description)
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
      return 12;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static MinefieldSensorTypesRADAR getEnumForValue(int value)
    {
       for (MinefieldSensorTypesRADAR nextEnum : MinefieldSensorTypesRADAR.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum MinefieldSensorTypesRADAR");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_16.txt

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.putShort((short)getValue());
    }
    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static MinefieldSensorTypesRADAR unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static MinefieldSensorTypesRADAR unmarshalEnum (ByteBuffer byteBuffer) throws Exception
    {
        return getEnumForValue(byteBuffer.getShort());
    }   

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 2; // 16 bits
    }
    
  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        return "MinefieldSensorTypesRADAR " + getValue() + " " + name(); 
    }
}
