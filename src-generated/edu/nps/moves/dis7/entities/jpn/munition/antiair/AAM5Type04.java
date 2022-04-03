// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AAM5Type04</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AAM5Type04.createInstance()</code> or <code>new AAM5Type04()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: AAM5Type04  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28972; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@18dd7767. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class AAM5Type04 extends EntityType
{
    /** Default constructor */
    public AAM5Type04()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 28969, Guided
        setSubCategory((byte)3); // uid 28972, AAM-5 Type 04
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AAM5Type04 createInstance()
    {
            return new AAM5Type04();
    }
}
