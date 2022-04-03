// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BRU47ASingleAGWeaponRack</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BRU47ASingleAGWeaponRack.createInstance()</code> or <code>new BRU47ASingleAGWeaponRack()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: J - Racks, Adaptors, Pylons = <code>6</code>; </li>
 *     <li> SubCategory: AirtoGroundAGWeaponRack  = <code>1</code>; </li>
 *     <li> Specific: BRU47ASingleAGWeaponRack  = <code>1</code>; </li>
 *     <li> Entity type uid: 30700; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e3566e. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see JRacksAdaptorsPylons
 * @see SubCategory

 */
public final class BRU47ASingleAGWeaponRack extends EntityType
{
    /** Default constructor */
    public BRU47ASingleAGWeaponRack()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)6); // uid 30698, J - Racks, Adaptors, Pylons
        setSubCategory((byte)1); // uid 30699, Air to Ground (A/G) Weapon Rack
        setSpecific((byte)1); // uid 30700, BRU-47/A Single A/G Weapon Rack
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BRU47ASingleAGWeaponRack createInstance()
    {
            return new BRU47ASingleAGWeaponRack();
    }
}
