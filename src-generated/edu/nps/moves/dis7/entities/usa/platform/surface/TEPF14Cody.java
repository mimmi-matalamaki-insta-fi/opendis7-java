// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TEPF14Cody</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TEPF14Cody.createInstance()</code> or <code>new TEPF14Cody()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SpearheadClassFastTransport  = <code>26</code>; </li>
 *     <li> Specific: TEPF14Cody  = <code>14</code>; </li>
 *     <li> Entity type uid: 34592; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5bf4764d. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class TEPF14Cody extends EntityType
{
    /** Default constructor */
    public TEPF14Cody()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 11701, Auxiliary
        setSubCategory((byte)26); // uid 28852, Spearhead Class Fast Transport
        setSpecific((byte)14); // uid 34592, TEPF 14 Cody
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TEPF14Cody createInstance()
    {
            return new TEPF14Cody();
    }
}
