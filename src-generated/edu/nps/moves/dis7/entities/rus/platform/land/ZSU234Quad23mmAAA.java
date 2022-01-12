// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ZSU234Quad23mmAAA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ZSU234Quad23mmAAA.createInstance()</code> or <code>new ZSU234Quad23mmAAA()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SelfPropelledVSHORADGunMissileSystem  = <code>12</code>; </li>
 *     <li> Specific: ZSU234Quad23mmAAA  = <code>1</code>; </li>
 *     <li> Entity type uid: 13113; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d774249. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class ZSU234Quad23mmAAA extends EntityType
{
    /** Default constructor */
    public ZSU234Quad23mmAAA()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)12); // uid 13112, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)1); // uid 13113, ZSU-23/4 Quad 23mm AAA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ZSU234Quad23mmAAA createInstance()
    {
            return new ZSU234Quad23mmAAA();
    }
}
