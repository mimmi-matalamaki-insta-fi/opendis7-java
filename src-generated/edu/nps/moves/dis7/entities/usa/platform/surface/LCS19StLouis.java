// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LCS19StLouis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LCS19StLouis.createInstance()</code> or <code>new LCS19StLouis()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Littoral Combat Ships (LCS) = <code>20</code>; </li>
 *     <li> SubCategory: LCSFreedomClass  = <code>1</code>; </li>
 *     <li> Specific: LCS19StLouis  = <code>10</code>; </li>
 *     <li> Entity type uid: 34078; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1a88c4f5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LittoralCombatShipsLCS
 * @see SubCategory

 */
public final class LCS19StLouis extends EntityType
{
    /** Default constructor */
    public LCS19StLouis()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)20); // uid 26921, Littoral Combat Ships (LCS)
        setSubCategory((byte)1); // uid 26922, LCS Freedom Class
        setSpecific((byte)10); // uid 34078, LCS 19 St. Louis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LCS19StLouis createInstance()
    {
            return new LCS19StLouis();
    }
}
