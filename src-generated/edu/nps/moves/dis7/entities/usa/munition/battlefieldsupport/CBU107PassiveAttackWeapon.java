// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CBU107PassiveAttackWeapon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CBU107PassiveAttackWeapon.createInstance()</code> or <code>new CBU107PassiveAttackWeapon()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: WindCorrectedMunitionsDispenserWCMD  = <code>22</code>; </li>
 *     <li> Specific: CBU107PassiveAttackWeapon  = <code>4</code>; </li>
 *     <li> Entity type uid: 24070; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@29b8df5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class CBU107PassiveAttackWeapon extends EntityType
{
    /** Default constructor */
    public CBU107PassiveAttackWeapon()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 19887, Guided
        setSubCategory((byte)22); // uid 19958, Wind-Corrected Munitions Dispenser (WCMD)
        setSpecific((byte)4); // uid 24070, CBU-107 Passive Attack Weapon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CBU107PassiveAttackWeapon createInstance()
    {
            return new CBU107PassiveAttackWeapon();
    }
}
