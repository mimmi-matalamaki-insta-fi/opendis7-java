// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CardboardBoxesMedium</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CardboardBoxesMedium.createInstance()</code> or <code>new CardboardBoxesMedium()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Obstacle = <code>5</code>; </li>
 *     <li> SubCategory: CardboardBoxes  = <code>21</code>; </li>
 *     <li> Specific: CardboardBoxesMedium  = <code>2</code>; </li>
 *     <li> Entity type uid: 23583; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3129299f. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Obstacle
 * @see SubCategory

 */
public final class CardboardBoxesMedium extends EntityType
{
    /** Default constructor */
    public CardboardBoxesMedium()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)21); // uid 23581, Cardboard Boxes
        setSpecific((byte)2); // uid 23583, Cardboard Boxes Medium
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CardboardBoxesMedium createInstance()
    {
            return new CardboardBoxesMedium();
    }
}
