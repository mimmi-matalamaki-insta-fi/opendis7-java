// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MilitaryGatorFirstResponseExpeditionary</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MilitaryGatorFirstResponseExpeditionary.createInstance()</code> or <code>new MilitaryGatorFirstResponseExpeditionary()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: AllTerrainVehicleATV  = <code>26</code>; </li>
 *     <li> Specific: ATV6X6  = <code>2</code>; </li>
 *     <li> Entity type uid: 10412; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@75d366c2. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MilitaryGatorFirstResponseExpeditionary extends EntityType
{
    /** Default constructor */
    public MilitaryGatorFirstResponseExpeditionary()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)26); // uid 10408, All Terrain Vehicle (ATV)
        setSpecific((byte)2); // uid 10410, ATV 6X6
        setExtra((byte)2); // uid 10412, Military Gator First Response Expeditionary
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MilitaryGatorFirstResponseExpeditionary createInstance()
    {
            return new MilitaryGatorFirstResponseExpeditionary();
    }
}
