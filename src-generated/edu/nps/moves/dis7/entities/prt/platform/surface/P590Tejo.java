// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P590Tejo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P590Tejo.createInstance()</code> or <code>new P590Tejo()</code>. </p>
 * <ul>
 *     <li> Country: Portugal (PRT) = <code>176</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: TejoClass  = <code>1</code>; </li>
 *     <li> Specific: P590Tejo  = <code>1</code>; </li>
 *     <li> Entity type uid: 30461; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a91d146. </p>
 * @see Country#PORTUGAL_PRT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P590Tejo extends EntityType
{
    /** Default constructor */
    public P590Tejo()
    {
        setCountry(Country.PORTUGAL_PRT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 30459, Light/Patrol Craft
        setSubCategory((byte)1); // uid 30460, Tejo Class
        setSpecific((byte)1); // uid 30461, P590 Tejo
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P590Tejo createInstance()
    {
            return new P590Tejo();
    }
}
