// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Commandowith90mmturretmountedgun</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Commandowith90mmturretmountedgun.createInstance()</code> or <code>new Commandowith90mmturretmountedgun()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: CadillacGageCommandoV150  = <code>19</code>; </li>
 *     <li> Specific: Commandowith90mmturretmountedgun  = <code>10</code>; </li>
 *     <li> Entity type uid: 10193; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@414f87a9. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class Commandowith90mmturretmountedgun extends EntityType
{
    /** Default constructor */
    public Commandowith90mmturretmountedgun()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)19); // uid 10183, Cadillac Gage Commando V-150
        setSpecific((byte)10); // uid 10193, Commando with 90-mm turret-mounted gun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Commandowith90mmturretmountedgun createInstance()
    {
            return new Commandowith90mmturretmountedgun();
    }
}
