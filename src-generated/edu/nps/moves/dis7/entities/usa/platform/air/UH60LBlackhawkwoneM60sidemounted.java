// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>UH60LBlackhawkwoneM60sidemounted</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>UH60LBlackhawkwoneM60sidemounted.createInstance()</code> or <code>new UH60LBlackhawkwoneM60sidemounted()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility helicopter = <code>21</code>; </li>
 *     <li> SubCategory: SikorskyS70A  = <code>2</code>; </li>
 *     <li> Specific: UH60LBlackhawk  = <code>2</code>; </li>
 *     <li> Entity type uid: 23562; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@c1e14f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utilityhelicopter
 * @see SubCategory

 */
public final class UH60LBlackhawkwoneM60sidemounted extends EntityType
{
    /** Default constructor */
    public UH60LBlackhawkwoneM60sidemounted()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 11088, Utility helicopter
        setSubCategory((byte)2); // uid 11100, Sikorsky S-70A
        setSpecific((byte)2); // uid 11102, UH-60L Blackhawk
        setExtra((byte)1); // uid 23562, UH-60L Blackhawk w/ one M60 side-mounted
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static UH60LBlackhawkwoneM60sidemounted createInstance()
    {
            return new UH60LBlackhawkwoneM60sidemounted();
    }
}
