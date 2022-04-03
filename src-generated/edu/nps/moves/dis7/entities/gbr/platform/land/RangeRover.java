// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RangeRover</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RangeRover.createInstance()</code> or <code>new RangeRover()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Car = <code>81</code>; </li>
 *     <li> SubCategory: SportsUtilityVehicleSUVFullPremiumLuxuryLarge  = <code>114</code>; </li>
 *     <li> Specific: RangeRover  = <code>1</code>; </li>
 *     <li> Entity type uid: 24917; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e13f304. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Car
 * @see SubCategory

 */
public final class RangeRover extends EntityType
{
    /** Default constructor */
    public RangeRover()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24911, Car
        setSubCategory((byte)114); // uid 24916, Sports Utility Vehicle (SUV), Full/Premium/Luxury (Large)
        setSpecific((byte)1); // uid 24917, Range Rover
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RangeRover createInstance()
    {
            return new RangeRover();
    }
}
