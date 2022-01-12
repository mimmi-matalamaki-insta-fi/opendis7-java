// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BushmasterProtectedMobilityVehicleDirectFireWeapons</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BushmasterProtectedMobilityVehicleDirectFireWeapons.createInstance()</code> or <code>new BushmasterProtectedMobilityVehicleDirectFireWeapons()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: BushmasterProtectedMobilityVehicle  = <code>2</code>; </li>
 *     <li> Specific: BushmasterProtectedMobilityVehicleDirectFireWeapons  = <code>3</code>; </li>
 *     <li> Entity type uid: 28608; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f205aa. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class BushmasterProtectedMobilityVehicleDirectFireWeapons extends EntityType
{
    /** Default constructor */
    public BushmasterProtectedMobilityVehicleDirectFireWeapons()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armored Utility Vehicle
        setSubCategory((byte)2); // uid 26912, Bushmaster Protected Mobility Vehicle
        setSpecific((byte)3); // uid 28608, Bushmaster Protected Mobility Vehicle - Direct Fire Weapons
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BushmasterProtectedMobilityVehicleDirectFireWeapons createInstance()
    {
            return new BushmasterProtectedMobilityVehicleDirectFireWeapons();
    }
}
