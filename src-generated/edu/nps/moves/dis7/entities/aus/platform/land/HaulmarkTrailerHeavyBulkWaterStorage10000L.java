// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HaulmarkTrailerHeavyBulkWaterStorage10000L</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HaulmarkTrailerHeavyBulkWaterStorage10000L.createInstance()</code> or <code>new HaulmarkTrailerHeavyBulkWaterStorage10000L()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Water Trailer = <code>17</code>; </li>
 *     <li> SubCategory: _10015000Gallons  = <code>2</code>; </li>
 *     <li> Specific: HaulmarkTrailerHeavyBulkWaterStorage10000L  = <code>2</code>; </li>
 *     <li> Entity type uid: 29407; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@50cbc42f. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see WaterTrailer
 * @see SubCategory

 */
public final class HaulmarkTrailerHeavyBulkWaterStorage10000L extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerHeavyBulkWaterStorage10000L()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 29403, Water Trailer
        setSubCategory((byte)2); // uid 29405, 1001- 5000 Gallons
        setSpecific((byte)2); // uid 29407, Haulmark - Trailer, Heavy, Bulk Water Storage, 10000L
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HaulmarkTrailerHeavyBulkWaterStorage10000L createInstance()
    {
            return new HaulmarkTrailerHeavyBulkWaterStorage10000L();
    }
}
