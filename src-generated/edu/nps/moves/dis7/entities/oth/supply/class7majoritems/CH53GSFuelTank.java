// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CH53GSFuelTank</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CH53GSFuelTank.createInstance()</code> or <code>new CH53GSFuelTank()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Drop Tank = <code>20</code>; </li>
 *     <li> SubCategory: CH53GSFuelTank  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30752; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@22604c7e. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see DropTank
 * @see SubCategory

 */
public final class CH53GSFuelTank extends EntityType
{
    /** Default constructor */
    public CH53GSFuelTank()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)20); // uid 30749, Drop Tank
        setSubCategory((byte)3); // uid 30752, CH-53GS Fuel Tank
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CH53GSFuelTank createInstance()
    {
            return new CH53GSFuelTank();
    }
}
