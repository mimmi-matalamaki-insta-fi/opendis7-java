// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PIDSSP</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PIDSSP.createInstance()</code> or <code>new PIDSSP()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: J - Racks, Adaptors, Pylons = <code>6</code>; </li>
 *     <li> SubCategory: AirtoAirAAWeaponRack  = <code>2</code>; </li>
 *     <li> Specific: PIDSSP  = <code>15</code>; </li>
 *     <li> Entity type uid: 30736; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69d7bc1a. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see JRacksAdaptorsPylons
 * @see SubCategory

 */
public final class PIDSSP extends EntityType
{
    /** Default constructor */
    public PIDSSP()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)6); // uid 30698, J - Racks, Adaptors, Pylons
        setSubCategory((byte)2); // uid 30721, Air to Air (A/A) Weapon Rack
        setSpecific((byte)15); // uid 30736, PIDS-SP
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PIDSSP createInstance()
    {
            return new PIDSSP();
    }
}
