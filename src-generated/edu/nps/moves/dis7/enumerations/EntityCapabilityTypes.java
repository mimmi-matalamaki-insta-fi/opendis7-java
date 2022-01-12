// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 55,
 * marshal size 32;
 * EntityCapabilities has 13 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum EntityCapabilityTypes 
{
    // autogenerated using string template disdictenumcomment.txt

    /** LandPlatformCapabilities */    // autogenerated using string template disenumpart21.txt
    LAND_PLATFORM_ENTITY_CAPABILITIES_2 (0, "Land Platform Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** AirPlatformCapabilities */    // autogenerated using string template disenumpart21.txt
    AIR_PLATFORM_ENTITY_CAPABILITIES_2 (1, "Air Platform Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** SurfacePlatformCapabilities */    // autogenerated using string template disenumpart21.txt
    SURFACE_PLATFORM_ENTITY_CAPABILITIES_2 (2, "Surface Platform Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** SubsurfacePlatformCapabilities */    // autogenerated using string template disenumpart21.txt
    SUBSURFACE_PLATFORM_ENTITY_CAPABILITIES_2 (3, "Subsurface Platform Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** SpacePlatformCapabilities */    // autogenerated using string template disenumpart21.txt
    SPACE_PLATFORM_ENTITY_CAPABILITIES_2 (4, "Space Platform Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** MunitionCapabilities */    // autogenerated using string template disenumpart21.txt
    MUNITION_ENTITY_CAPABILITIES_2 (5, "Munition Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** LifeFormsCapabilities */    // autogenerated using string template disenumpart21.txt
    LIFE_FORMS_ENTITY_CAPABILITIES_2 (6, "Life Forms Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** EnvironmentalCapabilities */    // autogenerated using string template disenumpart21.txt
    ENVIRONMENTAL_ENTITY_CAPABILITIES_2 (7, "Environmental Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** CulturalFeatureCapabilities */    // autogenerated using string template disenumpart21.txt
    CULTURAL_FEATURE_ENTITY_CAPABILITIES_2 (8, "Cultural Feature Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** SupplyCapabilities */    // autogenerated using string template disenumpart21.txt
    SUPPLY_ENTITY_CAPABILITIES_2 (9, "Supply Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** RadioCapabilities */    // autogenerated using string template disenumpart21.txt
    RADIO_ENTITY_CAPABILITIES_2 (10, "Radio Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** ExpendableCapabilities */    // autogenerated using string template disenumpart21.txt
    EXPENDABLE_ENTITY_CAPABILITIES_2 (11, "Expendable Entity Capabilities"),
    // autogenerated using string template disdictenumcomment.txt

    /** SensorEmitterCapabilities */    // autogenerated using string template disenumpart21.txt
    SENSOR_EMITTER_ENTITY_CAPABILITIES_2 (12, "Sensor/Emitter Entity Capabilities"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    EntityCapabilityTypes(int value, String description)
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
    public static EntityCapabilityTypes getEnumForValue(int value)
    {
       for (EntityCapabilityTypes nextEnum : EntityCapabilityTypes.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum EntityCapabilityTypes");
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
    public static EntityCapabilityTypes unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readInt());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @return enumeration of interest */
    public static EntityCapabilityTypes unmarshalEnum (ByteBuffer byteBuffer)
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
        return "EntityCapabilityTypes: " + getValue() + " " + name();
    }
}
