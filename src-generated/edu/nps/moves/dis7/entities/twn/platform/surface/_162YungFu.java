// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_162YungFu</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_162YungFu.createInstance()</code> or <code>new _162YungFu()</code>. </p>
 * <ul>
 *     <li> Country: Taiwan, Province of China (TWN) = <code>208</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Coutermeasures Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: AdjutantClass  = <code>2</code>; </li>
 *     <li> Specific: _162YungFu  = <code>2</code>; </li>
 *     <li> Entity type uid: 24216; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6af5bbd0. </p>
 * @see Country#TAIWAN_PROVINCE_OF_CHINA_TWN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCoutermeasuresShipCraft
 * @see SubCategory

 */
public final class _162YungFu extends EntityType
{
    /** Default constructor */
    public _162YungFu()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 19219, Mine Coutermeasures Ship/Craft
        setSubCategory((byte)2); // uid 24214, Adjutant Class
        setSpecific((byte)2); // uid 24216, 162 Yung Fu
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _162YungFu createInstance()
    {
            return new _162YungFu();
    }
}
