// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HY2GCSSC3B</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HY2GCSSC3B.createInstance()</code> or <code>new HY2GCSSC3B()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SHIP</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: HY2CSSC3  = <code>9</code>; </li>
 *     <li> Specific: HY2GCSSC3B  = <code>2</code>; </li>
 *     <li> Entity type uid: 21425; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2ba024cb. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class HY2GCSSC3B extends EntityType
{
    /** Default constructor */
    public HY2GCSSC3B()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21409, Guided
        setSubCategory((byte)9); // uid 21423, HY-2/CSSC-3
        setSpecific((byte)2); // uid 21425, HY-2G/CSSC-3B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HY2GCSSC3B createInstance()
    {
            return new HY2GCSSC3B();
    }
}
