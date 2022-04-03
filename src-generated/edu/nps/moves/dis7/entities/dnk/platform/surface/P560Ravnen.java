// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P560Ravnen</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P560Ravnen.createInstance()</code> or <code>new P560Ravnen()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/ Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: FlyvefiskenClass  = <code>4</code>; </li>
 *     <li> Specific: P560Ravnen  = <code>11</code>; </li>
 *     <li> Entity type uid: 29462; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7526515b. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P560Ravnen extends EntityType
{
    /** Default constructor */
    public P560Ravnen()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18790, Light/ Patrol Craft
        setSubCategory((byte)4); // uid 29451, Flyvefisken Class
        setSpecific((byte)11); // uid 29462, P560 Ravnen
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P560Ravnen createInstance()
    {
            return new P560Ravnen();
    }
}
