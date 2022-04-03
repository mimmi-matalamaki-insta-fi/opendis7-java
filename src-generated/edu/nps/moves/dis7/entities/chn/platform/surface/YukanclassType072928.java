// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YukanclassType072928</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YukanclassType072928.createInstance()</code> or <code>new YukanclassType072928()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank Landing Ship = <code>10</code>; </li>
 *     <li> SubCategory: YukanclassType072  = <code>2</code>; </li>
 *     <li> Specific: _928  = <code>2</code>; </li>
 *     <li> Entity type uid: 17195; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@10683d9d. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankLandingShip
 * @see SubCategory

 */
public final class YukanclassType072928 extends EntityType
{
    /** Default constructor */
    public YukanclassType072928()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 17190, Tank Landing Ship
        setSubCategory((byte)2); // uid 17193, Yukan class Type 072
        setSpecific((byte)2); // uid 17195, 928
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YukanclassType072928 createInstance()
    {
            return new YukanclassType072928();
    }
}
