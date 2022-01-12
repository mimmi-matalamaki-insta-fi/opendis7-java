// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MTLBwAT6AntiTankGuidedWeaponATGW</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MTLBwAT6AntiTankGuidedWeaponATGW.createInstance()</code> or <code>new MTLBwAT6AntiTankGuidedWeaponATGW()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: MTLBtrackedvehicle  = <code>7</code>; </li>
 *     <li> Specific: MTLBwAT6AntiTankGuidedWeaponATGW  = <code>23</code>; </li>
 *     <li> Entity type uid: 12646; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6124287a. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class MTLBwAT6AntiTankGuidedWeaponATGW extends EntityType
{
    /** Default constructor */
    public MTLBwAT6AntiTankGuidedWeaponATGW()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)7); // uid 12623, MT-LB tracked vehicle
        setSpecific((byte)23); // uid 12646, MT-LB w/ AT-6 (Anti-Tank Guided Weapon) ATGW
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MTLBwAT6AntiTankGuidedWeaponATGW createInstance()
    {
            return new MTLBwAT6AntiTankGuidedWeaponATGW();
    }
}
