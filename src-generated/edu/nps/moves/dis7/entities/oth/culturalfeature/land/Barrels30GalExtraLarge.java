// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Barrels30GalExtraLarge</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Barrels30GalExtraLarge.createInstance()</code> or <code>new Barrels30GalExtraLarge()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Obstacle = <code>5</code>; </li>
 *     <li> SubCategory: Barrels30Gal  = <code>29</code>; </li>
 *     <li> Specific: Barrels30GalExtraLarge  = <code>4</code>; </li>
 *     <li> Entity type uid: 26930; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b88af70. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Obstacle
 * @see SubCategory

 */
public final class Barrels30GalExtraLarge extends EntityType
{
    /** Default constructor */
    public Barrels30GalExtraLarge()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)29); // uid 26459, Barrels, 30 Gal
        setSpecific((byte)4); // uid 26930, Barrels, 30 Gal, Extra Large
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Barrels30GalExtraLarge createInstance()
    {
            return new Barrels30GalExtraLarge();
    }
}
