// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aze.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M326</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M326.createInstance()</code> or <code>new M326()</code>. </p>
 * <ul>
 *     <li> Country: Azerbaijan (AZE) = <code>245</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: SonyaClass  = <code>1</code>; </li>
 *     <li> Specific: M326  = <code>2</code>; </li>
 *     <li> Entity type uid: 29961; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a5ca609. </p>
 * @see Country#AZERBAIJAN_AZE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M326 extends EntityType
{
    /** Default constructor */
    public M326()
    {
        setCountry(Country.AZERBAIJAN_AZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 29958, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 29959, Sonya Class
        setSpecific((byte)2); // uid 29961, M326
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M326 createInstance()
    {
            return new M326();
    }
}
