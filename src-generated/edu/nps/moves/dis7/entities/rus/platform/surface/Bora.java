// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Bora</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Bora.createInstance()</code> or <code>new Bora()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Frigate (includes Corvette) = <code>6</code>; </li>
 *     <li> SubCategory: NanuchkaIclassCorvette  = <code>7</code>; </li>
 *     <li> Specific: Bora  = <code>13</code>; </li>
 *     <li> Entity type uid: 13649; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68217d41. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileFrigateincludesCorvette
 * @see SubCategory

 */
public final class Bora extends EntityType
{
    /** Default constructor */
    public Bora()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 13593, Guided-missile Frigate (includes Corvette)
        setSubCategory((byte)7); // uid 13636, Nanuchka I class (Corvette)
        setSpecific((byte)13); // uid 13649, Bora
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Bora createInstance()
    {
            return new Bora();
    }
}
