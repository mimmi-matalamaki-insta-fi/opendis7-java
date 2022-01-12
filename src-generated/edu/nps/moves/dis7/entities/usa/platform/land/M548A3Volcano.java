// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M548A3Volcano</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M548A3Volcano.createInstance()</code> or <code>new M548A3Volcano()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Tracked Utility Vehicle = <code>9</code>; </li>
 *     <li> SubCategory: M548trackedcargocarrier  = <code>1</code>; </li>
 *     <li> Specific: M548A3Volcano  = <code>13</code>; </li>
 *     <li> Entity type uid: 24087; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@285583d4. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeTrackedUtilityVehicle
 * @see SubCategory

 */
public final class M548A3Volcano extends EntityType
{
    /** Default constructor */
    public M548A3Volcano()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 10578, Large Tracked Utility Vehicle
        setSubCategory((byte)1); // uid 10579, M548 tracked cargo carrier
        setSpecific((byte)13); // uid 24087, M548A3 Volcano
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M548A3Volcano createInstance()
    {
            return new M548A3Volcano();
    }
}
