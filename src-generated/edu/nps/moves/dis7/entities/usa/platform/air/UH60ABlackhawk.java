// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>UH60ABlackhawk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>UH60ABlackhawk.createInstance()</code> or <code>new UH60ABlackhawk()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility helicopter = <code>21</code>; </li>
 *     <li> SubCategory: SikorskyS70A  = <code>2</code>; </li>
 *     <li> Specific: UH60ABlackhawk  = <code>1</code>; </li>
 *     <li> Entity type uid: 11101; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6bce313. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utilityhelicopter
 * @see SubCategory

 */
public final class UH60ABlackhawk extends EntityType
{
    /** Default constructor */
    public UH60ABlackhawk()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 11088, Utility helicopter
        setSubCategory((byte)2); // uid 11100, Sikorsky S-70A
        setSpecific((byte)1); // uid 11101, UH-60A Blackhawk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static UH60ABlackhawk createInstance()
    {
            return new UH60ABlackhawk();
    }
}
