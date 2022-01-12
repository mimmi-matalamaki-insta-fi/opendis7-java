// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RG31Mk3withProtectorRemoteWeaponStationRWS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RG31Mk3withProtectorRemoteWeaponStationRWS.createInstance()</code> or <code>new RG31Mk3withProtectorRemoteWeaponStationRWS()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: RG31Nyala4x4  = <code>3</code>; </li>
 *     <li> Specific: RG31Mk3withProtectorRemoteWeaponStationRWS  = <code>1</code>; </li>
 *     <li> Entity type uid: 31205; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b68ddbd. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class RG31Mk3withProtectorRemoteWeaponStationRWS extends EntityType
{
    /** Default constructor */
    public RG31Mk3withProtectorRemoteWeaponStationRWS()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 27893, Large Wheeled Utility Vehicle
        setSubCategory((byte)3); // uid 31204, RG-31 Nyala 4x4
        setSpecific((byte)1); // uid 31205, RG-31 Mk3 with Protector Remote Weapon Station (RWS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RG31Mk3withProtectorRemoteWeaponStationRWS createInstance()
    {
            return new RG31Mk3withProtectorRemoteWeaponStationRWS();
    }
}
