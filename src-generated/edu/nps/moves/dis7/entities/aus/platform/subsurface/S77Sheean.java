// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S77Sheean</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S77Sheean.createInstance()</code> or <code>new S77Sheean()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSG (Conventional Guided Missile) = <code>4</code>; </li>
 *     <li> SubCategory: CollinsClass  = <code>1</code>; </li>
 *     <li> Specific: S77Sheean  = <code>5</code>; </li>
 *     <li> Entity type uid: 17616; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6a2bcfcb. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSGConventionalGuidedMissile
 * @see SubCategory

 */
public final class S77Sheean extends EntityType
{
    /** Default constructor */
    public S77Sheean()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 17609, SSG (Conventional Guided Missile)
        setSubCategory((byte)1); // uid 17611, Collins Class
        setSpecific((byte)5); // uid 17616, S 77 Sheean
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S77Sheean createInstance()
    {
            return new S77Sheean();
    }
}
