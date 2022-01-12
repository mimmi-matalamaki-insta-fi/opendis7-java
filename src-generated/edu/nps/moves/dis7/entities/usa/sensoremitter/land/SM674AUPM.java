// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SM674AUPM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SM674AUPM.createInstance()</code> or <code>new SM674AUPM()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: TestEquipment  = <code>98</code>; </li>
 *     <li> Specific: SM674  = <code>2</code>; </li>
 *     <li> Entity type uid: 29652; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7252bdb. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class SM674AUPM extends EntityType
{
    /** Default constructor */
    public SM674AUPM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22317, RF Active
        setSubCategory((byte)98); // uid 29648, Test Equipment
        setSpecific((byte)2); // uid 29651, SM-674
        setExtra((byte)1); // uid 29652, SM-674A/UPM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SM674AUPM createInstance()
    {
            return new SM674AUPM();
    }
}
