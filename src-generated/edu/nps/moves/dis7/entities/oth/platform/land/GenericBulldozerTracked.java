// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericBulldozerTracked</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericBulldozerTracked.createInstance()</code> or <code>new GenericBulldozerTracked()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Construction Specialty Vehicle = <code>87</code>; </li>
 *     <li> SubCategory: GenericBulldozerTracked  = <code>21</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25902; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ff2b8d2. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ConstructionSpecialtyVehicle
 * @see SubCategory

 */
public final class GenericBulldozerTracked extends EntityType
{
    /** Default constructor */
    public GenericBulldozerTracked()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 25881, Construction Specialty Vehicle
        setSubCategory((byte)21); // uid 25902, Generic Bulldozer, Tracked
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericBulldozerTracked createInstance()
    {
            return new GenericBulldozerTracked();
    }
}
