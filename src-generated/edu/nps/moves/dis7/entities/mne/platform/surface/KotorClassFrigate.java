// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mne.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KotorClassFrigate</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KotorClassFrigate.createInstance()</code> or <code>new KotorClassFrigate()</code>. </p>
 * <ul>
 *     <li> Country: Montenegro (MNE) = <code>259</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: KotorClassFrigate  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30131; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4e2c95ee. </p>
 * @see Country#MONTENEGRO_MNE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class KotorClassFrigate extends EntityType
{
    /** Default constructor */
    public KotorClassFrigate()
    {
        setCountry(Country.MONTENEGRO_MNE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 30130, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 30131, Kotor-Class Frigate
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KotorClassFrigate createInstance()
    {
            return new KotorClassFrigate();
    }
}
