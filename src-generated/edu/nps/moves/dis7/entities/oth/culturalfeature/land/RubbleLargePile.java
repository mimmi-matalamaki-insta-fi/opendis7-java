// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RubbleLargePile</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RubbleLargePile.createInstance()</code> or <code>new RubbleLargePile()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Obstacle = <code>5</code>; </li>
 *     <li> SubCategory: Rubble  = <code>20</code>; </li>
 *     <li> Specific: RubbleLargePile  = <code>2</code>; </li>
 *     <li> Entity type uid: 27374; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@431babe6. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Obstacle
 * @see SubCategory

 */
public final class RubbleLargePile extends EntityType
{
    /** Default constructor */
    public RubbleLargePile()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)20); // uid 23580, Rubble
        setSpecific((byte)2); // uid 27374, Rubble, Large Pile
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RubbleLargePile createInstance()
    {
            return new RubbleLargePile();
    }
}
