// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>UAZ469BwDIMVehicleMountedMagneticMineDetector</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>UAZ469BwDIMVehicleMountedMagneticMineDetector.createInstance()</code> or <code>new UAZ469BwDIMVehicleMountedMagneticMineDetector()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: UAZ469BUAZ31512  = <code>2</code>; </li>
 *     <li> Specific: UAZ469BwDIMVehicleMountedMagneticMineDetector  = <code>1</code>; </li>
 *     <li> Entity type uid: 12858; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64aad6db. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class UAZ469BwDIMVehicleMountedMagneticMineDetector extends EntityType
{
    /** Default constructor */
    public UAZ469BwDIMVehicleMountedMagneticMineDetector()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 12854, Small Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 12857, UAZ-469B (UAZ-31512)
        setSpecific((byte)1); // uid 12858, UAZ-469B w/ DIM Vehicle-Mounted Magnetic Mine Detector
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static UAZ469BwDIMVehicleMountedMagneticMineDetector createInstance()
    {
            return new UAZ469BwDIMVehicleMountedMagneticMineDetector();
    }
}
