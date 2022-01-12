// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Semitrailerfuelservice5000gallonsM131A5C</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Semitrailerfuelservice5000gallonsM131A5C.createInstance()</code> or <code>new Semitrailerfuelservice5000gallonsM131A5C()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fuel trailer = <code>15</code>; </li>
 *     <li> SubCategory: _10015000gallons  = <code>2</code>; </li>
 *     <li> Specific: Semitrailerfuelservice5000gallonsM131A5C  = <code>2</code>; </li>
 *     <li> Entity type uid: 23468; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68ab6ab0. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Fueltrailer
 * @see SubCategory

 */
public final class Semitrailerfuelservice5000gallonsM131A5C extends EntityType
{
    /** Default constructor */
    public Semitrailerfuelservice5000gallonsM131A5C()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 10625, Fuel trailer
        setSubCategory((byte)2); // uid 10627, 1001 - 5000 gallons
        setSpecific((byte)2); // uid 23468, Semi-trailer, fuel service, 5000 gallons, M131A5C
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Semitrailerfuelservice5000gallonsM131A5C createInstance()
    {
            return new Semitrailerfuelservice5000gallonsM131A5C();
    }
}
