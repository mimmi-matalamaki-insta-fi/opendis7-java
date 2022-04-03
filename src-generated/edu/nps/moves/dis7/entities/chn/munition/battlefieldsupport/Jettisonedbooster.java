// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Jettisonedbooster</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Jettisonedbooster.createInstance()</code> or <code>new Jettisonedbooster()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: M7CSS8HQ2SSMvariant  = <code>22</code>; </li>
 *     <li> Specific: Jettisonedbooster  = <code>2</code>; </li>
 *     <li> Entity type uid: 21551; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38bc5ac0. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class Jettisonedbooster extends EntityType
{
    /** Default constructor */
    public Jettisonedbooster()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21465, Ballistic
        setSubCategory((byte)22); // uid 21549, M-7/CSS-8 (HQ-2 SSM variant)
        setSpecific((byte)2); // uid 21551, Jettisoned booster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Jettisonedbooster createInstance()
    {
            return new Jettisonedbooster();
    }
}
