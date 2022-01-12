// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ven.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F23GeneralUrdaneta</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F23GeneralUrdaneta.createInstance()</code> or <code>new F23GeneralUrdaneta()</code>. </p>
 * <ul>
 *     <li> Country: Venezuela (Bolivarian Republic of) (VEN) = <code>229</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: LupoClass  = <code>1</code>; </li>
 *     <li> Specific: F23GeneralUrdaneta  = <code>3</code>; </li>
 *     <li> Entity type uid: 27764; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@26c7b1c6. </p>
 * @see Country#VENEZUELA_BOLIVARIAN_REPUBLIC_OF_VEN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F23GeneralUrdaneta extends EntityType
{
    /** Default constructor */
    public F23GeneralUrdaneta()
    {
        setCountry(Country.VENEZUELA_BOLIVARIAN_REPUBLIC_OF_VEN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27760, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27761, Lupo Class
        setSpecific((byte)3); // uid 27764, F-23 General Urdaneta
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F23GeneralUrdaneta createInstance()
    {
            return new F23GeneralUrdaneta();
    }
}
