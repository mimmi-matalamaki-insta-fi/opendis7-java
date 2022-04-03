// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 250,
 * marshal size 32;
 * EnvironmentalProcessRecordType has 26 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum EnvironmentalProcessRecordType 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** COMBIC State */
    // autogenerated using string template disenumpart2.txt
    COMBIC_STATE (256, "COMBIC State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Flare State */
    // autogenerated using string template disenumpart2.txt
    FLARE_STATE (259, "Flare State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Biological State */
    // autogenerated using string template disenumpart2.txt
    BIOLOGICAL_STATE (4096, "Biological State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical Vapor State */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_VAPOR_STATE (4097, "Chemical Vapor State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Radiological State */
    // autogenerated using string template disenumpart2.txt
    RADIOLOGICAL_STATE (4098, "Radiological State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical Liquid State */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_LIQUID_STATE (4099, "Chemical Liquid State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Obscurant State */
    // autogenerated using string template disenumpart2.txt
    OBSCURANT_STATE (4100, "Obscurant State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Bounding Sphere Record */
    // autogenerated using string template disenumpart2.txt
    BOUNDING_SPHERE_RECORD (65536, "Bounding Sphere Record"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Uniform Geometry Record */
    // autogenerated using string template disenumpart2.txt
    UNIFORM_GEOMETRY_RECORD (327680, "Uniform Geometry Record"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Point Record 1 */
    // autogenerated using string template disenumpart2.txt
    POINT_RECORD_1 (655360, "Point Record 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Line Record 1 */
    // autogenerated using string template disenumpart2.txt
    LINE_RECORD_1 (786432, "Line Record 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sphere Record 1 */
    // autogenerated using string template disenumpart2.txt
    SPHERE_RECORD_1 (851968, "Sphere Record 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ellipsoid Record 1 */
    // autogenerated using string template disenumpart2.txt
    ELLIPSOID_RECORD_1 (1048576, "Ellipsoid Record 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cone Record 1 */
    // autogenerated using string template disenumpart2.txt
    CONE_RECORD_1 (3145728, "Cone Record 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Rectangular Volume Record 1 */
    // autogenerated using string template disenumpart2.txt
    RECTANGULAR_VOLUME_RECORD_1 (5242880, "Rectangular Volume Record 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Rectangular Volume Record 3 */
    // autogenerated using string template disenumpart2.txt
    RECTANGULAR_VOLUME_RECORD_3 (83886080, "Rectangular Volume Record 3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Point Record 2 */
    // autogenerated using string template disenumpart2.txt
    POINT_RECORD_2 (167772160, "Point Record 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Line Record 2 */
    // autogenerated using string template disenumpart2.txt
    LINE_RECORD_2 (201326592, "Line Record 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sphere Record 2 */
    // autogenerated using string template disenumpart2.txt
    SPHERE_RECORD_2 (218103808, "Sphere Record 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ellipsoid Record 2 */
    // autogenerated using string template disenumpart2.txt
    ELLIPSOID_RECORD_2 (268435456, "Ellipsoid Record 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cone Record 2 */
    // autogenerated using string template disenumpart2.txt
    CONE_RECORD_2 (805306368, "Cone Record 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Rectangular Volume Record 2 */
    // autogenerated using string template disenumpart2.txt
    RECTANGULAR_VOLUME_RECORD_2 (1342177280, "Rectangular Volume Record 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gaussian Plume Record */
    // autogenerated using string template disenumpart2.txt
    GAUSSIAN_PLUME_RECORD (1610612736, "Gaussian Plume Record"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gaussian Puff Record 1 */
    // autogenerated using string template disenumpart2.txt
    GAUSSIAN_PUFF_RECORD_1 (1879048192, "Gaussian Puff Record 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gaussian Puff Record 2 */
    // autogenerated using string template disenumpart2.txt
    GAUSSIAN_PUFF_RECORD_2 (1879048193, "Gaussian Puff Record 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Rectangular Volume Record 4 */
    // autogenerated using string template disenumpart2.txt
    RECTANGULAR_VOLUME_RECORD_4 (2147483647, "Rectangular Volume Record 4"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    EnvironmentalProcessRecordType(int value, String description)
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
    public static EnvironmentalProcessRecordType getEnumForValue(int value)
    {
       for (EnvironmentalProcessRecordType nextEnum : EnvironmentalProcessRecordType.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum EnvironmentalProcessRecordType");
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
    public static EnvironmentalProcessRecordType unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readInt());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @return enumeration of interest */
    public static EnvironmentalProcessRecordType unmarshalEnum (ByteBuffer byteBuffer)
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
        return "EnvironmentalProcessRecordType: " + getValue() + " " + name();
    }
}
