// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HaulmarkTrailerHeavyEquipmentBulkFuelStorage12000LHBFS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HaulmarkTrailerHeavyEquipmentBulkFuelStorage12000LHBFS.createInstance()</code> or <code>new HaulmarkTrailerHeavyEquipmentBulkFuelStorage12000LHBFS()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fuel Trailer = <code>15</code>; </li>
 *     <li> SubCategory: _10015000Gallons  = <code>2</code>; </li>
 *     <li> Specific: HaulmarkTrailerHeavyEquipmentBulkFuelStorage12000LHBFS  = <code>2</code>; </li>
 *     <li> Entity type uid: 29400; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@22a71081. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FuelTrailer
 * @see SubCategory

 */
public final class HaulmarkTrailerHeavyEquipmentBulkFuelStorage12000LHBFS extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerHeavyEquipmentBulkFuelStorage12000LHBFS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 29396, Fuel Trailer
        setSubCategory((byte)2); // uid 29398, 1001 - 5000 Gallons
        setSpecific((byte)2); // uid 29400, Haulmark - Trailer, Heavy Equipment, Bulk Fuel Storage, 12000L (HBFS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HaulmarkTrailerHeavyEquipmentBulkFuelStorage12000LHBFS createInstance()
    {
            return new HaulmarkTrailerHeavyEquipmentBulkFuelStorage12000LHBFS();
    }
}
