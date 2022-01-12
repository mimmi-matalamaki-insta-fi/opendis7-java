// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M113ASArmoredLogisticsVehicleFuelALVF</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M113ASArmoredLogisticsVehicleFuelALVF.createInstance()</code> or <code>new M113ASArmoredLogisticsVehicleFuelALVF()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: M113ASArmoredLogisticsVehicleStoresALVS  = <code>5</code>; </li>
 *     <li> Specific: M113ASArmoredLogisticsVehicleFuelALVF  = <code>2</code>; </li>
 *     <li> Entity type uid: 28624; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68f7aae2. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class M113ASArmoredLogisticsVehicleFuelALVF extends EntityType
{
    /** Default constructor */
    public M113ASArmoredLogisticsVehicleFuelALVF()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armored Utility Vehicle
        setSubCategory((byte)5); // uid 28622, M113-AS Armored Logistics Vehicle (Stores) (ALV-S)
        setSpecific((byte)2); // uid 28624, M113-AS Armored Logistics Vehicle (Fuel) (ALV-F)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M113ASArmoredLogisticsVehicleFuelALVF createInstance()
    {
            return new M113ASArmoredLogisticsVehicleFuelALVF();
    }
}
