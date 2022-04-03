// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NationalLaunchSystemNLS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NationalLaunchSystemNLS.createInstance()</code> or <code>new NationalLaunchSystemNLS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other = <code>0</code>; </li>
 *     <li> SubCategory: NationalLaunchSystemNLS  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 12418; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6a7a1a0d. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Other
 * @see SubCategory

 */
public final class NationalLaunchSystemNLS extends EntityType
{
    /** Default constructor */
    public NationalLaunchSystemNLS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)0); // uid 12416, Other
        setSubCategory((byte)2); // uid 12418, National Launch System (NLS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NationalLaunchSystemNLS createInstance()
    {
            return new NationalLaunchSystemNLS();
    }
}
