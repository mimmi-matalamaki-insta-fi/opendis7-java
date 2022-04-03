// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GAU22A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GAU22A.createInstance()</code> or <code>new GAU22A()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: M - Weapons = <code>9</code>; </li>
 *     <li> SubCategory: _25mmcaliber  = <code>6</code>; </li>
 *     <li> Specific: GAU22A  = <code>1</code>; </li>
 *     <li> Entity type uid: 30640; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@612ac38b. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see MWeapons
 * @see SubCategory

 */
public final class GAU22A extends EntityType
{
    /** Default constructor */
    public GAU22A()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)9); // uid 30622, M - Weapons
        setSubCategory((byte)6); // uid 30639, 25 mm caliber
        setSpecific((byte)1); // uid 30640, GAU-22/A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GAU22A createInstance()
    {
            return new GAU22A();
    }
}
