// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BRDM2RKhbNBC</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BRDM2RKhbNBC.createInstance()</code> or <code>new BRDM2RKhbNBC()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: BRDM2Reconnaissancevehicle  = <code>4</code>; </li>
 *     <li> Specific: BRDM2RKhbNBC  = <code>4</code>; </li>
 *     <li> Entity type uid: 12605; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2b8d084. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class BRDM2RKhbNBC extends EntityType
{
    /** Default constructor */
    public BRDM2RKhbNBC()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)4); // uid 12601, BRDM-2 Reconnaissance vehicle
        setSpecific((byte)4); // uid 12605, BRDM-2-RKhb NBC
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BRDM2RKhbNBC createInstance()
    {
            return new BRDM2RKhbNBC();
    }
}
