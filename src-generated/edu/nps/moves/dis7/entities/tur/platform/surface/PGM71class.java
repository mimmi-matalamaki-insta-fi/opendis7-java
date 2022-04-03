// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PGM71class</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PGM71class.createInstance()</code> or <code>new PGM71class()</code>. </p>
 * <ul>
 *     <li> Country: Turkey (TUR) = <code>218</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: PGM71class  = <code>6</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23248; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5fef2aac. </p>
 * @see Country#TURKEY_TUR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class PGM71class extends EntityType
{
    /** Default constructor */
    public PGM71class()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19062, Light/Patrol Craft
        setSubCategory((byte)6); // uid 23248, PGM-71 class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PGM71class createInstance()
    {
            return new PGM71class();
    }
}
