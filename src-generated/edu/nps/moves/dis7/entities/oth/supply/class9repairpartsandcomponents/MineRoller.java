// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class9repairpartsandcomponents;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MineRoller</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MineRoller.createInstance()</code> or <code>new MineRoller()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_9_REPAIR_PARTS_AND_COMPONENTS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: K - Tactical Vehicles = <code>6</code>; </li>
 *     <li> SubCategory: MineRoller  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30805; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5e7e7a7e. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see KTacticalVehicles
 * @see SubCategory

 */
public final class MineRoller extends EntityType
{
    /** Default constructor */
    public MineRoller()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_9_REPAIR_PARTS_AND_COMPONENTS));

        setCategory((byte)6); // uid 30803, K - Tactical Vehicles
        setSubCategory((byte)2); // uid 30805, Mine Roller
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MineRoller createInstance()
    {
            return new MineRoller();
    }
}
