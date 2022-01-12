// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BTR152DwZPU2twin145mmAAmount</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BTR152DwZPU2twin145mmAAmount.createInstance()</code> or <code>new BTR152DwZPU2twin145mmAAmount()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SelfPropelledVSHORADGunMissileSystem  = <code>12</code>; </li>
 *     <li> Specific: BTR152DwZPU2twin145mmAAmount  = <code>8</code>; </li>
 *     <li> Entity type uid: 13124; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59496961. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class BTR152DwZPU2twin145mmAAmount extends EntityType
{
    /** Default constructor */
    public BTR152DwZPU2twin145mmAAmount()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)12); // uid 13112, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)8); // uid 13124, BTR-152D w/ZPU-2 twin-14.5mm AA mount
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BTR152DwZPU2twin145mmAAmount createInstance()
    {
            return new BTR152DwZPU2twin145mmAAmount();
    }
}
