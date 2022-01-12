// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S612Leterrible</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S612Leterrible.createInstance()</code> or <code>new S612Leterrible()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSGN (Nuclear Guided Missile) = <code>2</code>; </li>
 *     <li> SubCategory: LinflexibleclassSNLE  = <code>1</code>; </li>
 *     <li> Specific: S612Leterrible  = <code>2</code>; </li>
 *     <li> Entity type uid: 16182; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a7ed1f. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSGNNuclearGuidedMissile
 * @see SubCategory

 */
public final class S612Leterrible extends EntityType
{
    /** Default constructor */
    public S612Leterrible()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)2); // uid 16179, SSGN (Nuclear Guided Missile)
        setSubCategory((byte)1); // uid 16180, Linflexible class (SNLE)
        setSpecific((byte)2); // uid 16182, S 612 Le terrible
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S612Leterrible createInstance()
    {
            return new S612Leterrible();
    }
}
