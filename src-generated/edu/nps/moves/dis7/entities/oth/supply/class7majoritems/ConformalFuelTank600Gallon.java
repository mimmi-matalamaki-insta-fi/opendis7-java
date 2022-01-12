// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ConformalFuelTank600Gallon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ConformalFuelTank600Gallon.createInstance()</code> or <code>new ConformalFuelTank600Gallon()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Conformal Fuel Tank = <code>21</code>; </li>
 *     <li> SubCategory: ConformalFuelTank600Gallon  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30759; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@14b5325f. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see ConformalFuelTank
 * @see SubCategory

 */
public final class ConformalFuelTank600Gallon extends EntityType
{
    /** Default constructor */
    public ConformalFuelTank600Gallon()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)21); // uid 30755, Conformal Fuel Tank
        setSubCategory((byte)4); // uid 30759, Conformal Fuel Tank - 600 Gallon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ConformalFuelTank600Gallon createInstance()
    {
            return new ConformalFuelTank600Gallon();
    }
}
