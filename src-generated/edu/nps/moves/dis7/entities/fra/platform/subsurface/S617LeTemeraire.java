// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S617LeTemeraire</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S617LeTemeraire.createInstance()</code> or <code>new S617LeTemeraire()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSBN (Nuclear Ballistic Missile) = <code>1</code>; </li>
 *     <li> SubCategory: LeTriomphantclassSNLENG  = <code>1</code>; </li>
 *     <li> Specific: S617LeTemeraire  = <code>2</code>; </li>
 *     <li> Entity type uid: 16177; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@14fc1f0. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSBNNuclearBallisticMissile
 * @see SubCategory

 */
public final class S617LeTemeraire extends EntityType
{
    /** Default constructor */
    public S617LeTemeraire()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 16174, SSBN (Nuclear Ballistic Missile)
        setSubCategory((byte)1); // uid 16175, Le Triomphant class (SNLE-NG)
        setSpecific((byte)2); // uid 16177, S 617 Le Temeraire
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S617LeTemeraire createInstance()
    {
            return new S617LeTemeraire();
    }
}
