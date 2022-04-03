// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HawkeiProtectedMobilityVehicleLightSpecialOperationsVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HawkeiProtectedMobilityVehicleLightSpecialOperationsVehicle.createInstance()</code> or <code>new HawkeiProtectedMobilityVehicleLightSpecialOperationsVehicle()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: HawkeiProtectedMobilityVehicleLight4x4  = <code>3</code>; </li>
 *     <li> Specific: HawkeiProtectedMobilityVehicleLightSpecialOperationsVehicle  = <code>3</code>; </li>
 *     <li> Entity type uid: 29417; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ada9e37. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class HawkeiProtectedMobilityVehicleLightSpecialOperationsVehicle extends EntityType
{
    /** Default constructor */
    public HawkeiProtectedMobilityVehicleLightSpecialOperationsVehicle()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 28910, Small Wheeled Utility Vehicle
        setSubCategory((byte)3); // uid 29414, Hawkei Protected Mobility Vehicle - Light 4x4
        setSpecific((byte)3); // uid 29417, Hawkei Protected Mobility Vehicle - Light - Special Operations Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HawkeiProtectedMobilityVehicleLightSpecialOperationsVehicle createInstance()
    {
            return new HawkeiProtectedMobilityVehicleLightSpecialOperationsVehicle();
    }
}
