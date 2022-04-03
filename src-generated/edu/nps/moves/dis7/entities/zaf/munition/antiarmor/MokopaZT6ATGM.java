// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.zaf.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MokopaZT6ATGM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MokopaZT6ATGM.createInstance()</code> or <code>new MokopaZT6ATGM()</code>. </p>
 * <ul>
 *     <li> Country: South Africa (ZAF) = <code>197</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: MokopaZT6ATGM  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22825; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@182e4365. </p>
 * @see Country#SOUTH_AFRICA_ZAF
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class MokopaZT6ATGM extends EntityType
{
    /** Default constructor */
    public MokopaZT6ATGM()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 22824, Guided
        setSubCategory((byte)1); // uid 22825, Mokopa ZT-6 ATGM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MokopaZT6ATGM createInstance()
    {
            return new MokopaZT6ATGM();
    }
}
