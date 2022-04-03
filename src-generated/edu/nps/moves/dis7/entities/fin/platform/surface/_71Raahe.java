// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fin.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_71Raahe</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_71Raahe.createInstance()</code> or <code>new _71Raahe()</code>. </p>
 * <ul>
 *     <li> Country: Finland (FIN) = <code>70</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: RaumaClass  = <code>1</code>; </li>
 *     <li> Specific: _71Raahe  = <code>2</code>; </li>
 *     <li> Entity type uid: 23024; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b8d604b. </p>
 * @see Country#FINLAND_FIN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _71Raahe extends EntityType
{
    /** Default constructor */
    public _71Raahe()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 23021, Light/Patrol Craft
        setSubCategory((byte)1); // uid 23022, Rauma Class
        setSpecific((byte)2); // uid 23024, 71 Raahe
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _71Raahe createInstance()
    {
            return new _71Raahe();
    }
}
