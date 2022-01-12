// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANMLQ40Prophet</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANMLQ40Prophet.createInstance()</code> or <code>new ANMLQ40Prophet()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Intelligence Facility = <code>31</code>; </li>
 *     <li> SubCategory: ANMLQ40Prophet  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23510; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@691124ee. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see IntelligenceFacility
 * @see SubCategory

 */
public final class ANMLQ40Prophet extends EntityType
{
    /** Default constructor */
    public ANMLQ40Prophet()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)31); // uid 10741, Intelligence Facility
        setSubCategory((byte)3); // uid 23510, AN/MLQ-40 Prophet
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANMLQ40Prophet createInstance()
    {
            return new ANMLQ40Prophet();
    }
}
