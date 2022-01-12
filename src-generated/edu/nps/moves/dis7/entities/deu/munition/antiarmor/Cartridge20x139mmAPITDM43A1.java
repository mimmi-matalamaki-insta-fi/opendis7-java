// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Cartridge20x139mmAPITDM43A1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Cartridge20x139mmAPITDM43A1.createInstance()</code> or <code>new Cartridge20x139mmAPITDM43A1()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _20mmRh202ammunition  = <code>12</code>; </li>
 *     <li> Specific: Cartridge20x139mmAPITDM43A1  = <code>1</code>; </li>
 *     <li> Entity type uid: 23976; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45b7c97f. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class Cartridge20x139mmAPITDM43A1 extends EntityType
{
    /** Default constructor */
    public Cartridge20x139mmAPITDM43A1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21215, Ballistic
        setSubCategory((byte)12); // uid 23975, 20mm Rh-202 ammunition
        setSpecific((byte)1); // uid 23976, Cartridge, 20x139mm, API-T, DM-43A1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Cartridge20x139mmAPITDM43A1 createInstance()
    {
            return new Cartridge20x139mmAPITDM43A1();
    }
}
