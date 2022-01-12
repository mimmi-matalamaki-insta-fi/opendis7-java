// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class1subsistence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MealReadytoEatMREUSA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MealReadytoEatMREUSA.createInstance()</code> or <code>new MealReadytoEatMREUSA()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_1_SUBSISTENCE</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: C - Combat Rations = <code>3</code>; </li>
 *     <li> SubCategory: MealReadytoEatMREUSA  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30646; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@38826984. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see CCombatRations
 * @see SubCategory

 */
public final class MealReadytoEatMREUSA extends EntityType
{
    /** Default constructor */
    public MealReadytoEatMREUSA()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_1_SUBSISTENCE));

        setCategory((byte)3); // uid 30645, C - Combat Rations
        setSubCategory((byte)1); // uid 30646, Meal Ready to Eat (MRE) - USA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MealReadytoEatMREUSA createInstance()
    {
            return new MealReadytoEatMREUSA();
    }
}
