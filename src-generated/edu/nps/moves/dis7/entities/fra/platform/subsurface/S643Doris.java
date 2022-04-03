// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S643Doris</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S643Doris.createInstance()</code> or <code>new S643Doris()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) (Sous-Marins D'attaque) = <code>5</code>; </li>
 *     <li> SubCategory: DaphneClass  = <code>2</code>; </li>
 *     <li> Specific: S643Doris  = <code>1</code>; </li>
 *     <li> Entity type uid: 16202; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5ba88be8. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrolSousMarinsDattaque
 * @see SubCategory

 */
public final class S643Doris extends EntityType
{
    /** Default constructor */
    public S643Doris()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16195, SS (Conventional Attack-Torpedo, Patrol) (Sous-Marins D'attaque)
        setSubCategory((byte)2); // uid 16201, Daphne Class
        setSpecific((byte)1); // uid 16202, S 643 Doris
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S643Doris createInstance()
    {
            return new S643Doris();
    }
}
