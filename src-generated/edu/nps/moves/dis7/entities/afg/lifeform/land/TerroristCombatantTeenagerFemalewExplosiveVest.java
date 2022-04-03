// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TerroristCombatantTeenagerFemalewExplosiveVest</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TerroristCombatantTeenagerFemalewExplosiveVest.createInstance()</code> or <code>new TerroristCombatantTeenagerFemalewExplosiveVest()</code>. </p>
 * <ul>
 *     <li> Country: Afghanistan (AFG) = <code>1</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Terrorist Combatant = <code>101</code>; </li>
 *     <li> SubCategory: WeaponNonspecific  = <code>1</code>; </li>
 *     <li> Specific: ExplosiveVest  = <code>100</code>; </li>
 *     <li> Entity type uid: 32208; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@319b1c77. </p>
 * @see Country#AFGHANISTAN_AFG
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TerroristCombatant
 * @see SubCategory

 */
public final class TerroristCombatantTeenagerFemalewExplosiveVest extends EntityType
{
    /** Default constructor */
    public TerroristCombatantTeenagerFemalewExplosiveVest()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)101); // uid 32204, Terrorist Combatant
        setSubCategory((byte)1); // uid 32205, Weapon, Non-specific
        setSpecific((byte)100); // uid 32206, Explosive Vest
        setExtra((byte)150); // uid 32208, Terrorist Combatant Teenager, Female w/ Explosive Vest
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TerroristCombatantTeenagerFemalewExplosiveVest createInstance()
    {
            return new TerroristCombatantTeenagerFemalewExplosiveVest();
    }
}
