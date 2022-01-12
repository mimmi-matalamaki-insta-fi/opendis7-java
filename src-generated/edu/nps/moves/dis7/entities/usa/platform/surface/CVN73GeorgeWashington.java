// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CVN73GeorgeWashington</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CVN73GeorgeWashington.createInstance()</code> or <code>new CVN73GeorgeWashington()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Carrier = <code>1</code>; </li>
 *     <li> SubCategory: NimitzClass  = <code>1</code>; </li>
 *     <li> Specific: CVN73GeorgeWashington  = <code>6</code>; </li>
 *     <li> Entity type uid: 11300; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17222c11. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Carrier
 * @see SubCategory

 */
public final class CVN73GeorgeWashington extends EntityType
{
    /** Default constructor */
    public CVN73GeorgeWashington()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 11293, Carrier
        setSubCategory((byte)1); // uid 11294, Nimitz Class
        setSpecific((byte)6); // uid 11300, CVN 73 George Washington
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CVN73GeorgeWashington createInstance()
    {
            return new CVN73GeorgeWashington();
    }
}
