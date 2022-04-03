// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LeylandwUnitBulkRefuelingEquipmentUBRE</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LeylandwUnitBulkRefuelingEquipmentUBRE.createInstance()</code> or <code>new LeylandwUnitBulkRefuelingEquipmentUBRE()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: _4Tonne  = <code>1</code>; </li>
 *     <li> Specific: Leyland4TonneTruck  = <code>1</code>; </li>
 *     <li> Entity type uid: 33253; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2db1b657. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class LeylandwUnitBulkRefuelingEquipmentUBRE extends EntityType
{
    /** Default constructor */
    public LeylandwUnitBulkRefuelingEquipmentUBRE()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 14935, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 14936, 4 Tonne
        setSpecific((byte)1); // uid 33251, Leyland 4-Tonne Truck
        setExtra((byte)2); // uid 33253, Leyland w/ Unit Bulk Refueling Equipment (UBRE)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LeylandwUnitBulkRefuelingEquipmentUBRE createInstance()
    {
            return new LeylandwUnitBulkRefuelingEquipmentUBRE();
    }
}
