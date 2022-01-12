// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_1L269Krasukha2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_1L269Krasukha2.createInstance()</code> or <code>new _1L269Krasukha2()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: Jammer  = <code>42</code>; </li>
 *     <li> Specific: Krasukha  = <code>2</code>; </li>
 *     <li> Entity type uid: 32295; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5600a278. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class _1L269Krasukha2 extends EntityType
{
    /** Default constructor */
    public _1L269Krasukha2()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22411, RF Active
        setSubCategory((byte)42); // uid 32292, Jammer
        setSpecific((byte)2); // uid 32294, Krasukha
        setExtra((byte)1); // uid 32295, 1L269 Krasukha-2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _1L269Krasukha2 createInstance()
    {
            return new _1L269Krasukha2();
    }
}
