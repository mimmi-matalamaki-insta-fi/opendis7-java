// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PoliceCarChevySuburban</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PoliceCarChevySuburban.createInstance()</code> or <code>new PoliceCarChevySuburban()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility/Emergency Car = <code>93</code>; </li>
 *     <li> SubCategory: PoliceCar  = <code>2</code>; </li>
 *     <li> Specific: PoliceCarChevySuburban  = <code>3</code>; </li>
 *     <li> Entity type uid: 28328; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5bc63e20. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityEmergencyCar
 * @see SubCategory

 */
public final class PoliceCarChevySuburban extends EntityType
{
    /** Default constructor */
    public PoliceCarChevySuburban()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 24960, Utility/Emergency Car
        setSubCategory((byte)2); // uid 28324, Police Car
        setSpecific((byte)3); // uid 28328, Police Car, Chevy Suburban
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PoliceCarChevySuburban createInstance()
    {
            return new PoliceCarChevySuburban();
    }
}
