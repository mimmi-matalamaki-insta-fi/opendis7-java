// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANPLM3A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANPLM3A.createInstance()</code> or <code>new ANPLM3A()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Electro-Optical = <code>5</code>; </li>
 *     <li> SubCategory: TestEquipment  = <code>98</code>; </li>
 *     <li> Specific: ANPLM3  = <code>1</code>; </li>
 *     <li> Entity type uid: 29655; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@30b9728f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectroOptical
 * @see SubCategory

 */
public final class ANPLM3A extends EntityType
{
    /** Default constructor */
    public ANPLM3A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 23721, Electro-Optical
        setSubCategory((byte)98); // uid 29653, Test Equipment
        setSpecific((byte)1); // uid 29654, AN/PLM-3
        setExtra((byte)1); // uid 29655, AN/PLM-3A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANPLM3A createInstance()
    {
            return new ANPLM3A();
    }
}
