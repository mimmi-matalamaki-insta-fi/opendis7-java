// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F455Salamis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F455Salamis.createInstance()</code> or <code>new F455Salamis()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: Hydraclass  = <code>1</code>; </li>
 *     <li> Specific: F455Salamis  = <code>4</code>; </li>
 *     <li> Entity type uid: 23353; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75390459. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F455Salamis extends EntityType
{
    /** Default constructor */
    public F455Salamis()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23348, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23349, Hydra class
        setSpecific((byte)4); // uid 23353, F455 Salamis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F455Salamis createInstance()
    {
            return new F455Salamis();
    }
}
