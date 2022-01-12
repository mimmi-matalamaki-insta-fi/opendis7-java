// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 208,
 * marshal size 8;
 * AggregateStateSubcategory has 23 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum AggregateStateSubcategory implements SubCategory
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cavalry Troop */
    // autogenerated using string template disenumpart2.txt
    CAVALRY_TROOP (1, "Cavalry Troop"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Armor */
    // autogenerated using string template disenumpart2.txt
    ARMOR (2, "Armor"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Infantry */
    // autogenerated using string template disenumpart2.txt
    INFANTRY (3, "Infantry"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mechanized Infantry */
    // autogenerated using string template disenumpart2.txt
    MECHANIZED_INFANTRY (4, "Mechanized Infantry"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cavalry */
    // autogenerated using string template disenumpart2.txt
    CAVALRY (5, "Cavalry"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Armored Cavalry */
    // autogenerated using string template disenumpart2.txt
    ARMORED_CAVALRY (6, "Armored Cavalry"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Artillery */
    // autogenerated using string template disenumpart2.txt
    ARTILLERY (7, "Artillery"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Self-Propelled Artillery */
    // autogenerated using string template disenumpart2.txt
    SELF_PROPELLED_ARTILLERY (8, "Self-Propelled Artillery"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Close Air Support */
    // autogenerated using string template disenumpart2.txt
    CLOSE_AIR_SUPPORT (9, "Close Air Support"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Engineer */
    // autogenerated using string template disenumpart2.txt
    ENGINEER (10, "Engineer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Air Defense Artillery */
    // autogenerated using string template disenumpart2.txt
    AIR_DEFENSE_ARTILLERY (11, "Air Defense Artillery"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Anti-Tank */
    // autogenerated using string template disenumpart2.txt
    ANTI_TANK (12, "Anti-Tank"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Army Aviation Fixed-wing */
    // autogenerated using string template disenumpart2.txt
    ARMY_AVIATION_FIXED_WING (13, "Army Aviation Fixed-wing"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Army Aviation Rotary-wing */
    // autogenerated using string template disenumpart2.txt
    ARMY_AVIATION_ROTARY_WING (14, "Army Aviation Rotary-wing"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Army Attack Helicopter */
    // autogenerated using string template disenumpart2.txt
    ARMY_ATTACK_HELICOPTER (15, "Army Attack Helicopter"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Air Cavalry */
    // autogenerated using string template disenumpart2.txt
    AIR_CAVALRY (16, "Air Cavalry"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Armor Heavy Task Force */
    // autogenerated using string template disenumpart2.txt
    ARMOR_HEAVY_TASK_FORCE (17, "Armor Heavy Task Force"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Motorized Rifle */
    // autogenerated using string template disenumpart2.txt
    MOTORIZED_RIFLE (18, "Motorized Rifle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mechanized Heavy Task Force */
    // autogenerated using string template disenumpart2.txt
    MECHANIZED_HEAVY_TASK_FORCE (19, "Mechanized Heavy Task Force"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Command Post */
    // autogenerated using string template disenumpart2.txt
    COMMAND_POST (20, "Command Post"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CEWI */
    // autogenerated using string template disenumpart2.txt
    CEWI (21, "CEWI"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tank only */
    // autogenerated using string template disenumpart2.txt
    TANK_ONLY (22, "Tank only"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    AggregateStateSubcategory(int value, String description)
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
    public static AggregateStateSubcategory getEnumForValue(int value)
    {
       for (AggregateStateSubcategory nextEnum : AggregateStateSubcategory.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum AggregateStateSubcategory");
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
    public static AggregateStateSubcategory unmarshalEnum (DataInputStream dis) throws Exception
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
    public static AggregateStateSubcategory unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
