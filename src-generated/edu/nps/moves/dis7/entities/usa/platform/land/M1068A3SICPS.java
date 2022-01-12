// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1068A3SICPS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1068A3SICPS.createInstance()</code> or <code>new M1068A3SICPS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: M1068  = <code>13</code>; </li>
 *     <li> Specific: M1068A3SICPS  = <code>1</code>; </li>
 *     <li> Entity type uid: 22865; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@270d43a7. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class M1068A3SICPS extends EntityType
{
    /** Default constructor */
    public M1068A3SICPS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 10233, Armored Utility Vehicle
        setSubCategory((byte)13); // uid 10257, M1068
        setSpecific((byte)1); // uid 22865, M1068A3 SICPS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1068A3SICPS createInstance()
    {
            return new M1068A3SICPS();
    }
}
