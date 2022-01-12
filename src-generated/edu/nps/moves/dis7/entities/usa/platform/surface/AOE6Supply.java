// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AOE6Supply</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AOE6Supply.createInstance()</code> or <code>new AOE6Supply()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Combat Support Ship = <code>60</code>; </li>
 *     <li> SubCategory: SupplyClass  = <code>2</code>; </li>
 *     <li> Specific: AOE6Supply  = <code>1</code>; </li>
 *     <li> Entity type uid: 12088; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@696fad31. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastCombatSupportShip
 * @see SubCategory

 */
public final class AOE6Supply extends EntityType
{
    /** Default constructor */
    public AOE6Supply()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)60); // uid 12081, Fast Combat Support Ship
        setSubCategory((byte)2); // uid 12087, Supply Class
        setSpecific((byte)1); // uid 12088, AOE 6 Supply
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AOE6Supply createInstance()
    {
            return new AOE6Supply();
    }
}
