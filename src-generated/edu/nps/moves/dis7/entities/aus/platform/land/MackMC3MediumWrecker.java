// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MackMC3MediumWrecker</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MackMC3MediumWrecker.createInstance()</code> or <code>new MackMC3MediumWrecker()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MackMC36x6HeavyUtilityTruck  = <code>6</code>; </li>
 *     <li> Specific: MackMC3MediumWrecker  = <code>2</code>; </li>
 *     <li> Entity type uid: 31286; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18ef96. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MackMC3MediumWrecker extends EntityType
{
    /** Default constructor */
    public MackMC3MediumWrecker()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)6); // uid 31284, Mack MC3 6x6 Heavy Utility Truck
        setSpecific((byte)2); // uid 31286, Mack MC3 Medium Wrecker
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MackMC3MediumWrecker createInstance()
    {
            return new MackMC3MediumWrecker();
    }
}
