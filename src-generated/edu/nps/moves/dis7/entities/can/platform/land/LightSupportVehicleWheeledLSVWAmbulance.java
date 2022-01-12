// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LightSupportVehicleWheeledLSVWAmbulance</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LightSupportVehicleWheeledLSVWAmbulance.createInstance()</code> or <code>new LightSupportVehicleWheeledLSVWAmbulance()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: WesternStar4010WM  = <code>1</code>; </li>
 *     <li> Specific: LightSupportVehicleWheeledLSVWAmbulance  = <code>2</code>; </li>
 *     <li> Entity type uid: 27896; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b1c1ea0. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class LightSupportVehicleWheeledLSVWAmbulance extends EntityType
{
    /** Default constructor */
    public LightSupportVehicleWheeledLSVWAmbulance()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 27893, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 27894, Western Star 40.10 WM
        setSpecific((byte)2); // uid 27896, Light Support Vehicle Wheeled (LSVW)-Ambulance
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LightSupportVehicleWheeledLSVWAmbulance createInstance()
    {
            return new LightSupportVehicleWheeledLSVWAmbulance();
    }
}
