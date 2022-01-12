// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CrotaleP4RRadarSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CrotaleP4RRadarSystem.createInstance()</code> or <code>new CrotaleP4RRadarSystem()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: CrotaleSAMSystem  = <code>1</code>; </li>
 *     <li> Specific: CrotaleP4RRadarSystem  = <code>2</code>; </li>
 *     <li> Entity type uid: 15714; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a38c7fe. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class CrotaleP4RRadarSystem extends EntityType
{
    /** Default constructor */
    public CrotaleP4RRadarSystem()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 15711, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 15712, Crotale SAM System
        setSpecific((byte)2); // uid 15714, Crotale P4R Radar System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CrotaleP4RRadarSystem createInstance()
    {
            return new CrotaleP4RRadarSystem();
    }
}
