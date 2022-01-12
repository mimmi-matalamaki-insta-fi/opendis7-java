// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>THAADLaunchControlStation</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>THAADLaunchControlStation.createInstance()</code> or <code>new THAADLaunchControlStation()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: TerminalHighAltitudeAreaDefenseTHAADSystem  = <code>4</code>; </li>
 *     <li> Specific: THAADLaunchControlStation  = <code>4</code>; </li>
 *     <li> Entity type uid: 25377; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7c241a9f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class THAADLaunchControlStation extends EntityType
{
    /** Default constructor */
    public THAADLaunchControlStation()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)4); // uid 10701, Terminal High Altitude Area Defense (THAAD) System
        setSpecific((byte)4); // uid 25377, THAAD Launch Control Station
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static THAADLaunchControlStation createInstance()
    {
            return new THAADLaunchControlStation();
    }
}
