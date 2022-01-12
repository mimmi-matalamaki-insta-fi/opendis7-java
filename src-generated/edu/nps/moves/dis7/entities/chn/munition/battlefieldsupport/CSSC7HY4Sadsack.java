// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CSSC7HY4Sadsack</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CSSC7HY4Sadsack.createInstance()</code> or <code>new CSSC7HY4Sadsack()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: CSSC7HY4Sadsack  = <code>16</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 21464; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@23564dd2. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class CSSC7HY4Sadsack extends EntityType
{
    /** Default constructor */
    public CSSC7HY4Sadsack()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 21448, Guided
        setSubCategory((byte)16); // uid 21464, CSSC-7 (HY-4) Sadsack
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CSSC7HY4Sadsack createInstance()
    {
            return new CSSC7HY4Sadsack();
    }
}
