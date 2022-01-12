// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HQ374</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HQ374.createInstance()</code> or <code>new HQ374()</code>. </p>
 * <ul>
 *     <li> Country: Viet Nam (VNM) = <code>230</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: TarantulIClass  = <code>1</code>; </li>
 *     <li> Specific: HQ374  = <code>4</code>; </li>
 *     <li> Entity type uid: 27841; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7708b66a. </p>
 * @see Country#VIET_NAM_VNM
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class HQ374 extends EntityType
{
    /** Default constructor */
    public HQ374()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27836, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 27837, Tarantul I Class
        setSpecific((byte)4); // uid 27841, HQ-374
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HQ374 createInstance()
    {
            return new HQ374();
    }
}
