// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Agni2Stage2Booster</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Agni2Stage2Booster.createInstance()</code> or <code>new Agni2Stage2Booster()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Agni2  = <code>1</code>; </li>
 *     <li> Specific: Agni2Stage2Booster  = <code>4</code>; </li>
 *     <li> Entity type uid: 32538; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7404ddca. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Agni2Stage2Booster extends EntityType
{
    /** Default constructor */
    public Agni2Stage2Booster()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32533, Guided
        setSubCategory((byte)1); // uid 32534, Agni 2
        setSpecific((byte)4); // uid 32538, Agni 2 Stage 2 Booster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Agni2Stage2Booster createInstance()
    {
            return new Agni2Stage2Booster();
    }
}
