// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AkashSurfacetoAirMissileSAMsystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AkashSurfacetoAirMissileSAMsystem.createInstance()</code> or <code>new AkashSurfacetoAirMissileSAMsystem()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: AkashSurfacetoAirMissileSAMsystem  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31653; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4fbda97b. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class AkashSurfacetoAirMissileSAMsystem extends EntityType
{
    /** Default constructor */
    public AkashSurfacetoAirMissileSAMsystem()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 31652, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 31653, Akash Surface-to-Air Missile (SAM) system
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AkashSurfacetoAirMissileSAMsystem createInstance()
    {
            return new AkashSurfacetoAirMissileSAMsystem();
    }
}
