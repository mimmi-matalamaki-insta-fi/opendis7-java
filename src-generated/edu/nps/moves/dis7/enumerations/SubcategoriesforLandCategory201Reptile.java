// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 101,
 * marshal size 8;
 * SubcategoriesforLandCategory201Reptile has 23 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum SubcategoriesforLandCategory201Reptile implements SubCategory
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** New Zealand Northern Tuatara, 1-29 Lizard/tuatara */
    // autogenerated using string template disenumpart2.txt
    NEW_ZEALAND_NORTHERN_TUATARA (1, "New Zealand Northern Tuatara"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Monitor */
    // autogenerated using string template disenumpart2.txt
    MONITOR (3, "Monitor"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gecko */
    // autogenerated using string template disenumpart2.txt
    GECKO (8, "Gecko"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Iguana */
    // autogenerated using string template disenumpart2.txt
    IGUANA (13, "Iguana"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chameleon */
    // autogenerated using string template disenumpart2.txt
    CHAMELEON (17, "Chameleon"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Non-Venomous Snake, 30-59 Non-venomous snake */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Non-Venomous Snake"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Boa */
    // autogenerated using string template disenumpart2.txt
    BOA (31, "Boa"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Python */
    // autogenerated using string template disenumpart2.txt
    PYTHON (35, "Python"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Bullsnake */
    // autogenerated using string template disenumpart2.txt
    BULLSNAKE (39, "Bullsnake"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Kingsnake */
    // autogenerated using string template disenumpart2.txt
    KINGSNAKE (43, "Kingsnake"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Venomous Snake, 60-89 Venomous snake */
    // autogenerated using string template disenumpart2.txt
    DATA_RELIABLE (60, "Venomous Snake"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Rattlesnake */
    // autogenerated using string template disenumpart2.txt
    EVENT_REPORT_RELIABLE (61, "Rattlesnake"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Copperhead */
    // autogenerated using string template disenumpart2.txt
    COMMENT_RELIABLE (62, "Copperhead"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cottonmouth */
    // autogenerated using string template disenumpart2.txt
    RECORD_RELIABLE (63, "Cottonmouth"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Taipan */
    // autogenerated using string template disenumpart2.txt
    SET_RECORD_RELIABLE	 (64, "Taipan"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Viper */
    // autogenerated using string template disenumpart2.txt
    RECORD_QUERY_RELIABLE (65, "Viper"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cobra */
    // autogenerated using string template disenumpart2.txt
    COBRA (66, "Cobra"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Australian Brown Snake */
    // autogenerated using string template disenumpart2.txt
    AUSTRALIAN_BROWN_SNAKE (67, "Australian Brown Snake"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tortoise, 90-119 Turtle/Tortoise */
    // autogenerated using string template disenumpart2.txt
    TORTOISE (90, "Tortoise"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Turtle */
    // autogenerated using string template disenumpart2.txt
    TURTLE (100, "Turtle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** American Alligator, 120-149 Crocodilian */
    // autogenerated using string template disenumpart2.txt
    AMERICAN_ALLIGATOR (120, "American Alligator"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Crocodile */
    // autogenerated using string template disenumpart2.txt
    CROCODILE (121, "Crocodile"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Australian Freshwater Crocodile */
    // autogenerated using string template disenumpart2.txt
    AUSTRALIAN_FRESHWATER_CROCODILE (122, "Australian Freshwater Crocodile"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    SubcategoriesforLandCategory201Reptile(int value, String description)
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
    public static SubcategoriesforLandCategory201Reptile getEnumForValue(int value)
    {
       for (SubcategoriesforLandCategory201Reptile nextEnum : SubcategoriesforLandCategory201Reptile.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum SubcategoriesforLandCategory201Reptile");
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
    public static SubcategoriesforLandCategory201Reptile unmarshalEnum (DataInputStream dis) throws Exception
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
    public static SubcategoriesforLandCategory201Reptile unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
