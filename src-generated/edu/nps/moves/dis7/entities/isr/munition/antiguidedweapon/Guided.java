// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.munition.antiguidedweapon;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Guided</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Guided.createInstance()</code> or <code>new Guided()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_GUIDED_WEAPON</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 21291; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@f9b8129. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided

 */
public final class Guided extends EntityType
{
    /** Default constructor */
    public Guided()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_GUIDED_WEAPON));

        setCategory((byte)1); // uid 21291, Guided
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Guided createInstance()
    {
            return new Guided();
    }
}
