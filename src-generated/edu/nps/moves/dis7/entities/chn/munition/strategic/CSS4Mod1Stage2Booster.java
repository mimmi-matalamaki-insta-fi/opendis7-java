// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CSS4Mod1Stage2Booster</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CSS4Mod1Stage2Booster.createInstance()</code> or <code>new CSS4Mod1Stage2Booster()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>STRATEGIC</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: CSS4Mod1DF5  = <code>34</code>; </li>
 *     <li> Specific: CSS4Mod1Stage2Booster  = <code>5</code>; </li>
 *     <li> Entity type uid: 33796; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23afc725. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class CSS4Mod1Stage2Booster extends EntityType
{
    /** Default constructor */
    public CSS4Mod1Stage2Booster()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21556, Guided
        setSubCategory((byte)34); // uid 33792, CSS-4 Mod-1 (DF-5)
        setSpecific((byte)5); // uid 33796, CSS-4 Mod-1 Stage 2 Booster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CSS4Mod1Stage2Booster createInstance()
    {
            return new CSS4Mod1Stage2Booster();
    }
}
