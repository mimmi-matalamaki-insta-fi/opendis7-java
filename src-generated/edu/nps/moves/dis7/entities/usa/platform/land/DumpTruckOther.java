// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DumpTruckOther</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DumpTruckOther.createInstance()</code> or <code>new DumpTruckOther()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Construction Specialty Vehicle = <code>87</code>; </li>
 *     <li> SubCategory: DumpTruckOther  = <code>24</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28517; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@646427f7. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ConstructionSpecialtyVehicle
 * @see SubCategory

 */
public final class DumpTruckOther extends EntityType
{
    /** Default constructor */
    public DumpTruckOther()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 26009, Construction Specialty Vehicle
        setSubCategory((byte)24); // uid 28517, Dump Truck, Other
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DumpTruckOther createInstance()
    {
            return new DumpTruckOther();
    }
}
