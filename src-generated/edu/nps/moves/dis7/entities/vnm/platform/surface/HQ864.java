// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HQ864</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HQ864.createInstance()</code> or <code>new HQ864()</code>. </p>
 * <ul>
 *     <li> Country: Viet Nam (VNM) = <code>230</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: SonyaClass  = <code>1</code>; </li>
 *     <li> Specific: HQ864  = <code>4</code>; </li>
 *     <li> Entity type uid: 29967; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a3883c4. </p>
 * @see Country#VIET_NAM_VNM
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class HQ864 extends EntityType
{
    /** Default constructor */
    public HQ864()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 29962, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 29963, Sonya Class
        setSpecific((byte)4); // uid 29967, HQ-864
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HQ864 createInstance()
    {
            return new HQ864();
    }
}
