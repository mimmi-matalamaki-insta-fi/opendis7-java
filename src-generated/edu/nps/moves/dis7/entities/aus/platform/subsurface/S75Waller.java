// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S75Waller</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S75Waller.createInstance()</code> or <code>new S75Waller()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSG (Conventional Guided Missile) = <code>4</code>; </li>
 *     <li> SubCategory: CollinsClass  = <code>1</code>; </li>
 *     <li> Specific: S75Waller  = <code>3</code>; </li>
 *     <li> Entity type uid: 17614; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6cc4c815. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSGConventionalGuidedMissile
 * @see SubCategory

 */
public final class S75Waller extends EntityType
{
    /** Default constructor */
    public S75Waller()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 17609, SSG (Conventional Guided Missile)
        setSubCategory((byte)1); // uid 17611, Collins Class
        setSpecific((byte)3); // uid 17614, S 75 Waller
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S75Waller createInstance()
    {
            return new S75Waller();
    }
}
