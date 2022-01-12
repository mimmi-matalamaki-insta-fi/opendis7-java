// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DoubleLaneMasonryArchBridgeSpan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DoubleLaneMasonryArchBridgeSpan.createInstance()</code> or <code>new DoubleLaneMasonryArchBridgeSpan()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Bridge Span = <code>19</code>; </li>
 *     <li> SubCategory: DoubleLaneEachWay  = <code>2</code>; </li>
 *     <li> Specific: DoubleLaneMasonryArchBridgeSpan  = <code>3</code>; </li>
 *     <li> Entity type uid: 22091; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d73767e. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see BridgeSpan
 * @see SubCategory

 */
public final class DoubleLaneMasonryArchBridgeSpan extends EntityType
{
    /** Default constructor */
    public DoubleLaneMasonryArchBridgeSpan()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 22073, Bridge Span
        setSubCategory((byte)2); // uid 22088, Double Lane Each Way
        setSpecific((byte)3); // uid 22091, Double Lane Masonry Arch Bridge Span
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DoubleLaneMasonryArchBridgeSpan createInstance()
    {
            return new DoubleLaneMasonryArchBridgeSpan();
    }
}
