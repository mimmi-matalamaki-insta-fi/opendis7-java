// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RoadSectionCurvedFourLane</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RoadSectionCurvedFourLane.createInstance()</code> or <code>new RoadSectionCurvedFourLane()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Road element = <code>20</code>; </li>
 *     <li> SubCategory: RoadSectionCurved  = <code>2</code>; </li>
 *     <li> Specific: RoadSectionCurvedFourLane  = <code>4</code>; </li>
 *     <li> Entity type uid: 22110; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65503a26. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Roadelement
 * @see SubCategory

 */
public final class RoadSectionCurvedFourLane extends EntityType
{
    /** Default constructor */
    public RoadSectionCurvedFourLane()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)20); // uid 22100, Road element
        setSubCategory((byte)2); // uid 22106, Road Section Curved
        setSpecific((byte)4); // uid 22110, Road Section Curved, Four Lane
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RoadSectionCurvedFourLane createInstance()
    {
            return new RoadSectionCurvedFourLane();
    }
}
