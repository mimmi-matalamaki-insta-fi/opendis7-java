// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PL71SyedNazrul</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PL71SyedNazrul.createInstance()</code> or <code>new PL71SyedNazrul()</code>. </p>
 * <ul>
 *     <li> Country: Bangladesh (BGD) = <code>18</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Boats = <code>63</code>; </li>
 *     <li> SubCategory: MinervaClass  = <code>1</code>; </li>
 *     <li> Specific: PL71SyedNazrul  = <code>1</code>; </li>
 *     <li> Entity type uid: 32626; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7cd62f43. </p>
 * @see Country#BANGLADESH_BGD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardBoats
 * @see SubCategory

 */
public final class PL71SyedNazrul extends EntityType
{
    /** Default constructor */
    public PL71SyedNazrul()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 32624, Coast Guard Boats
        setSubCategory((byte)1); // uid 32625, Minerva Class
        setSpecific((byte)1); // uid 32626, PL71 Syed Nazrul
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PL71SyedNazrul createInstance()
    {
            return new PL71SyedNazrul();
    }
}
