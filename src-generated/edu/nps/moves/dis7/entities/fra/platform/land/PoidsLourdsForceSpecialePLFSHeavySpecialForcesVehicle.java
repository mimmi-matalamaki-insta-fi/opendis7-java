// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PoidsLourdsForceSpecialePLFSHeavySpecialForcesVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PoidsLourdsForceSpecialePLFSHeavySpecialForcesVehicle.createInstance()</code> or <code>new PoidsLourdsForceSpecialePLFSHeavySpecialForcesVehicle()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: SherpaLightTactialVehicle  = <code>7</code>; </li>
 *     <li> Specific: PoidsLourdsForceSpecialePLFSHeavySpecialForcesVehicle  = <code>2</code>; </li>
 *     <li> Entity type uid: 31115; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@565f390. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class PoidsLourdsForceSpecialePLFSHeavySpecialForcesVehicle extends EntityType
{
    /** Default constructor */
    public PoidsLourdsForceSpecialePLFSHeavySpecialForcesVehicle()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 15674, Small Wheeled Utility Vehicle
        setSubCategory((byte)7); // uid 31113, Sherpa Light Tactial Vehicle
        setSpecific((byte)2); // uid 31115, Poids Lourds Force Speciale (PLFS) - Heavy Special Forces Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PoidsLourdsForceSpecialePLFSHeavySpecialForcesVehicle createInstance()
    {
            return new PoidsLourdsForceSpecialePLFSHeavySpecialForcesVehicle();
    }
}
