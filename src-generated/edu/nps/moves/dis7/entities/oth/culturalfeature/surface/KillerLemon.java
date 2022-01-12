// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KillerLemon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KillerLemon.createInstance()</code> or <code>new KillerLemon()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Target = <code>8</code>; </li>
 *     <li> SubCategory: NavalGunneryTargetSurfaceBallons  = <code>1</code>; </li>
 *     <li> Specific: KillerLemon  = <code>2</code>; </li>
 *     <li> Entity type uid: 29919; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ed19b69. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Target
 * @see SubCategory

 */
public final class KillerLemon extends EntityType
{
    /** Default constructor */
    public KillerLemon()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 29916, Target
        setSubCategory((byte)1); // uid 29917, Naval Gunnery Target Surface Ballons
        setSpecific((byte)2); // uid 29919, Killer Lemon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KillerLemon createInstance()
    {
            return new KillerLemon();
    }
}
