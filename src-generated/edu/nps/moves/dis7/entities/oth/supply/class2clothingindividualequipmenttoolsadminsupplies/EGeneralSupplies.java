// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class2clothingindividualequipmenttoolsadminsupplies;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EGeneralSupplies</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EGeneralSupplies.createInstance()</code> or <code>new EGeneralSupplies()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_2_CLOTHING_INDIVIDUAL_EQUIPMENT_TOOLS_ADMIN_SUPPLIES</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: E - General Supplies = <code>4</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30671; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4a41caed. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see EGeneralSupplies

 */
public final class EGeneralSupplies extends EntityType
{
    /** Default constructor */
    public EGeneralSupplies()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_2_CLOTHING_INDIVIDUAL_EQUIPMENT_TOOLS_ADMIN_SUPPLIES));

        setCategory((byte)4); // uid 30671, E - General Supplies
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EGeneralSupplies createInstance()
    {
            return new EGeneralSupplies();
    }
}
