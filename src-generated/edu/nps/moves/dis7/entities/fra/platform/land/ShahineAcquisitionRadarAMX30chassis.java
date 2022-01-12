// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ShahineAcquisitionRadarAMX30chassis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ShahineAcquisitionRadarAMX30chassis.createInstance()</code> or <code>new ShahineAcquisitionRadarAMX30chassis()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: ShahineSAMSystem  = <code>3</code>; </li>
 *     <li> Specific: ShahineAcquisitionRadarAMX30chassis  = <code>1</code>; </li>
 *     <li> Entity type uid: 15717; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6221a451. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class ShahineAcquisitionRadarAMX30chassis extends EntityType
{
    /** Default constructor */
    public ShahineAcquisitionRadarAMX30chassis()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 15711, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)3); // uid 15716, Shahine SAM System
        setSpecific((byte)1); // uid 15717, Shahine Acquisition Radar/AMX-30 chassis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ShahineAcquisitionRadarAMX30chassis createInstance()
    {
            return new ShahineAcquisitionRadarAMX30chassis();
    }
}
