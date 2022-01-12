// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F43Trishul</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F43Trishul.createInstance()</code> or <code>new F43Trishul()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: TalwarType11356Project17ClassFFG  = <code>2</code>; </li>
 *     <li> Specific: F43Trishul  = <code>2</code>; </li>
 *     <li> Entity type uid: 23165; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13518f37. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F43Trishul extends EntityType
{
    /** Default constructor */
    public F43Trishul()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18827, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 18829, Talwar (Type 1135.6/Project 17) Class (FFG)
        setSpecific((byte)2); // uid 23165, F43 Trishul
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F43Trishul createInstance()
    {
            return new F43Trishul();
    }
}
