// autogenerated using string template disenumpart1withfootnote.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 443, marshal size 8;
 * PlatformSurfaceTankerSubcategories has 9 enumerations total.
 * Subcategories for Surface Platform Category 82.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum PlatformSurfaceTankerSubcategories implements SubCategory
{

    // autogenerated using string template disenumfootnotecomment.txt

    /** Liquid Petroleum Gas (LPG)Tanker */
    // autogenerated using string template disenumpart2.txt
    LIQUID_PETROLEUM_GAS_LPGTANKER (1, "Liquid Petroleum Gas (LPG)Tanker"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical Tanker */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_TANKER (2, "Chemical Tanker"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Liquid Natural Gas (LNG) Tanker */
    // autogenerated using string template disenumpart2.txt
    LIQUID_NATURAL_GAS_LNG_TANKER (3, "Liquid Natural Gas (LNG) Tanker"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Coastal Trading Vessel (Coaster) */
    // autogenerated using string template disenumpart2.txt
    COASTAL_TRADING_VESSEL_COASTER (4, "Coastal Trading Vessel (Coaster)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Crude Oil Tanker (up to 159,999 DWT) */
    // autogenerated using string template disenumpart2.txt
    CRUDE_OIL_TANKER_UP_TO_159_999_DWT (5, "Crude Oil Tanker (up to 159,999 DWT)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Liquid Bulk Tanker */
    // autogenerated using string template disenumpart2.txt
    LIQUID_BULK_TANKER (6, "Liquid Bulk Tanker"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Very Large Crude Carrier (160,000–319,999 DWT) */
    // autogenerated using string template disenumpart2.txt
    VERY_LARGE_CRUDE_CARRIER_160_000_319_999_DWT (7, "Very Large Crude Carrier (160,000–319,999 DWT)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ultra Large Crude Carrier (320,000–549,999 DWT) */
    // autogenerated using string template disenumpart2.txt
    ULTRA_LARGE_CRUDE_CARRIER_320_000_549_999_DWT (8, "Ultra Large Crude Carrier (320,000–549,999 DWT)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Condensate Storage Tanker */
    // autogenerated using string template disenumpart2.txt
    CONDENSATE_STORAGE_TANKER (9, "Condensate Storage Tanker"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformSurfaceTankerSubcategories(int value, String description)
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
    public static PlatformSurfaceTankerSubcategories getEnumForValue(int value)
    {
       for (PlatformSurfaceTankerSubcategories nextEnum : PlatformSurfaceTankerSubcategories.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum PlatformSurfaceTankerSubcategories");
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
    public static PlatformSurfaceTankerSubcategories unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformSurfaceTankerSubcategories unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
