// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HJ9A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HJ9A.createInstance()</code> or <code>new HJ9A()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: RedArrow9HongJian9HJ9  = <code>4</code>; </li>
 *     <li> Specific: HJ9A  = <code>2</code>; </li>
 *     <li> Entity type uid: 29113; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@52c46334. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class HJ9A extends EntityType
{
    /** Default constructor */
    public HJ9A()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 21353, Guided
        setSubCategory((byte)4); // uid 29111, Red Arrow 9 / HongJian-9 / HJ-9
        setSpecific((byte)2); // uid 29113, HJ-9A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HJ9A createInstance()
    {
            return new HJ9A();
    }
}
