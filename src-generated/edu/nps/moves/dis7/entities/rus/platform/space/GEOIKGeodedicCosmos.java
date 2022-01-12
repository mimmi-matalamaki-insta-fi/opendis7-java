// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GEOIKGeodedicCosmos</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GEOIKGeodedicCosmos.createInstance()</code> or <code>new GEOIKGeodedicCosmos()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>2</code>; </li>
 *     <li> SubCategory: Navigationsatellite  = <code>2</code>; </li>
 *     <li> Specific: GEOIKGeodedicCosmos  = <code>1</code>; </li>
 *     <li> Entity type uid: 14854; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d95a72e. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class GEOIKGeodedicCosmos extends EntityType
{
    /** Default constructor */
    public GEOIKGeodedicCosmos()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 14850, Unmanned
        setSubCategory((byte)2); // uid 14853, Navigation satellite
        setSpecific((byte)1); // uid 14854, GEO-IK Geodedic Cosmos
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GEOIKGeodedicCosmos createInstance()
    {
            return new GEOIKGeodedicCosmos();
    }
}
