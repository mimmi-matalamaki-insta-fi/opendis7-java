// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 19,
 * marshal size 8;
 * LifeFormsSubcategoryFrenchWeapons has 8 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum LifeFormsSubcategoryFrenchWeapons implements SubCategory
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** ACL-STRIM */
    // autogenerated using string template disenumpart2.txt
    ACL_STRIM (1, "ACL-STRIM"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mistral missile */
    // autogenerated using string template disenumpart2.txt
    MISTRAL_MISSILE (2, "Mistral missile"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Milan AT missile */
    // autogenerated using string template disenumpart2.txt
    MILAN_AT_MISSILE (3, "Milan AT missile"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** LRAC F1 89-mm AT rocket launcher */
    // autogenerated using string template disenumpart2.txt
    LRAC_F1_89_MM_AT_ROCKET_LAUNCHER (4, "LRAC F1 89-mm AT rocket launcher"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** FA-MAS rifle */
    // autogenerated using string template disenumpart2.txt
    FA_MAS_RIFLE (5, "FA-MAS rifle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AA-52 machine gun */
    // autogenerated using string template disenumpart2.txt
    AA_52_MACHINE_GUN (6, "AA-52 machine gun"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 58-mm rifle grenade */
    // autogenerated using string template disenumpart2.txt
    _58_MM_RIFLE_GRENADE (7, "58-mm rifle grenade"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** FR-F1 sniper rifle */
    // autogenerated using string template disenumpart2.txt
    FR_F1_SNIPER_RIFLE (8, "FR-F1 sniper rifle"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    LifeFormsSubcategoryFrenchWeapons(int value, String description)
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
    public static LifeFormsSubcategoryFrenchWeapons getEnumForValue(int value)
    {
       for (LifeFormsSubcategoryFrenchWeapons nextEnum : LifeFormsSubcategoryFrenchWeapons.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum LifeFormsSubcategoryFrenchWeapons");
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
    public static LifeFormsSubcategoryFrenchWeapons unmarshalEnum (DataInputStream dis) throws Exception
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
    public static LifeFormsSubcategoryFrenchWeapons unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
