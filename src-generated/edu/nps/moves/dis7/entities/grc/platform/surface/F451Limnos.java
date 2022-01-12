// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F451Limnos</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F451Limnos.createInstance()</code> or <code>new F451Limnos()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: ElliClassKortenaerClass  = <code>2</code>; </li>
 *     <li> Specific: F451Limnos  = <code>2</code>; </li>
 *     <li> Entity type uid: 23376; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@576f63f6. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F451Limnos extends EntityType
{
    /** Default constructor */
    public F451Limnos()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23348, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 23374, Elli Class (Kortenaer Class)
        setSpecific((byte)2); // uid 23376, F451 Limnos
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F451Limnos createInstance()
    {
            return new F451Limnos();
    }
}
