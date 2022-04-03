// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericSemirigidAirship</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericSemirigidAirship.createInstance()</code> or <code>new GenericSemirigidAirship()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Lighter than Air, Airship = <code>101</code>; </li>
 *     <li> SubCategory: GenericSemirigidAirship  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24740; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6124287a. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianLighterthanAirAirship
 * @see SubCategory

 */
public final class GenericSemirigidAirship extends EntityType
{
    /** Default constructor */
    public GenericSemirigidAirship()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)101); // uid 24738, Civilian Lighter than Air, Airship
        setSubCategory((byte)2); // uid 24740, Generic Semi-rigid Airship
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericSemirigidAirship createInstance()
    {
            return new GenericSemirigidAirship();
    }
}
