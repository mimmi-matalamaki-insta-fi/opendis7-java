// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DDG39Hobart</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DDG39Hobart.createInstance()</code> or <code>new DDG39Hobart()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer (DDG) = <code>4</code>; </li>
 *     <li> SubCategory: HobartClass  = <code>1</code>; </li>
 *     <li> Specific: DDG39Hobart  = <code>1</code>; </li>
 *     <li> Entity type uid: 29375; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b0375b3. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyerDDG
 * @see SubCategory

 */
public final class DDG39Hobart extends EntityType
{
    /** Default constructor */
    public DDG39Hobart()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 29373, Guided Missile Destroyer (DDG)
        setSubCategory((byte)1); // uid 29374, Hobart Class
        setSpecific((byte)1); // uid 29375, DDG 39 Hobart
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DDG39Hobart createInstance()
    {
            return new DDG39Hobart();
    }
}
