// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Gepard39Class</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Gepard39Class.createInstance()</code> or <code>new Gepard39Class()</code>. </p>
 * <ul>
 *     <li> Country: Viet Nam (VNM) = <code>230</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: Gepard39Class  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28603; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@67e77f52. </p>
 * @see Country#VIET_NAM_VNM
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class Gepard39Class extends EntityType
{
    /** Default constructor */
    public Gepard39Class()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28602, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 28603, Gepard 3.9 Class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Gepard39Class createInstance()
    {
            return new Gepard39Class();
    }
}
