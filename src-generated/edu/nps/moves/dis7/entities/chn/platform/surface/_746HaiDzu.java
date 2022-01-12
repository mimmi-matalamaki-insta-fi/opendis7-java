// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_746HaiDzu</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_746HaiDzu.createInstance()</code> or <code>new _746HaiDzu()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: YenPaiclassdegaussing  = <code>23</code>; </li>
 *     <li> Specific: _746HaiDzu  = <code>1</code>; </li>
 *     <li> Entity type uid: 17305; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9597028. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class _746HaiDzu extends EntityType
{
    /** Default constructor */
    public _746HaiDzu()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17231, Auxiliary
        setSubCategory((byte)23); // uid 17304, Yen Pai class (degaussing)
        setSpecific((byte)1); // uid 17305, 746 Hai Dzu
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _746HaiDzu createInstance()
    {
            return new _746HaiDzu();
    }
}
