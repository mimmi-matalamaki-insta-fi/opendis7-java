// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>IntersectionThreeLanetoFourLane</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>IntersectionThreeLanetoFourLane.createInstance()</code> or <code>new IntersectionThreeLanetoFourLane()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Road element = <code>20</code>; </li>
 *     <li> SubCategory: Intersection  = <code>3</code>; </li>
 *     <li> Specific: IntersectionThreeLanetoFourLane  = <code>34</code>; </li>
 *     <li> Entity type uid: 22120; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43756cb. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Roadelement
 * @see SubCategory

 */
public final class IntersectionThreeLanetoFourLane extends EntityType
{
    /** Default constructor */
    public IntersectionThreeLanetoFourLane()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)20); // uid 22100, Road element
        setSubCategory((byte)3); // uid 22111, Intersection
        setSpecific((byte)34); // uid 22120, Intersection, Three Lane to Four Lane
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static IntersectionThreeLanetoFourLane createInstance()
    {
            return new IntersectionThreeLanetoFourLane();
    }
}
