// autogenerated using string template disenumpart1withfootnote.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 133, marshal size 8;
 * AddSpecificDimensionEnumerationsforSubsurfaceAreaSize has 6 enumerations total.
 * The gaps in enumeration values are intentional and are reserved for future additions.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum AddSpecificDimensionEnumerationsforSubsurfaceAreaSize 
{

    // autogenerated using string template disenumfootnotecomment.txt

    /** Small School (.5km long x 250m wide x 83m deep - 1km x .5km x 166m) */
    // autogenerated using string template disenumpart2.txt
    SMALL_SCHOOL_5KM_LONG_X_250M_WIDE_X_83M_DEEP_1KM_X_5KM_X_166M (222, "Small School (.5km long x 250m wide x 83m deep - 1km x .5km x 166m)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Small School, Dense (.5km long x 250m wide x 83m deep - 1km x .5km x 166m) */
    // autogenerated using string template disenumpart2.txt
    SMALL_SCHOOL_DENSE_5KM_LONG_X_250M_WIDE_X_83M_DEEP_1KM_X_5KM_X_166M (223, "Small School, Dense (.5km long x 250m wide x 83m deep - 1km x .5km x 166m)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Medium School (.5km x 1km x 125m - 1km x 2km x 500m) */
    // autogenerated using string template disenumpart2.txt
    MEDIUM_SCHOOL_5KM_X_1KM_X_125M_1KM_X_2KM_X_500M (224, "Medium School (.5km x 1km x 125m - 1km x 2km x 500m)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Medium School, Dense (.5km x 1km x 125m - 1km x 2km x 500m) */
    // autogenerated using string template disenumpart2.txt
    MEDIUM_SCHOOL_DENSE_5KM_X_1KM_X_125M_1KM_X_2KM_X_500M (225, "Medium School, Dense (.5km x 1km x 125m - 1km x 2km x 500m)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Large School (5km x 2km x 500m - 10km x 4km x 1km) */
    // autogenerated using string template disenumpart2.txt
    LARGE_SCHOOL_5KM_X_2KM_X_500M_10KM_X_4KM_X_1KM (226, "Large School (5km x 2km x 500m - 10km x 4km x 1km)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Large School, Dense (5km x 2km x 500m - 10km x 4km x 1km) */
    // autogenerated using string template disenumpart2.txt
    LARGE_SCHOOL_DENSE_5KM_X_2KM_X_500M_10KM_X_4KM_X_1KM (227, "Large School, Dense (5km x 2km x 500m - 10km x 4km x 1km)"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    AddSpecificDimensionEnumerationsforSubsurfaceAreaSize(int value, String description)
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
    public static AddSpecificDimensionEnumerationsforSubsurfaceAreaSize getEnumForValue(int value)
    {
       for (AddSpecificDimensionEnumerationsforSubsurfaceAreaSize nextEnum : AddSpecificDimensionEnumerationsforSubsurfaceAreaSize.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum AddSpecificDimensionEnumerationsforSubsurfaceAreaSize");
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
    public static AddSpecificDimensionEnumerationsforSubsurfaceAreaSize unmarshalEnum (DataInputStream dis) throws Exception
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
    public static AddSpecificDimensionEnumerationsforSubsurfaceAreaSize unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
