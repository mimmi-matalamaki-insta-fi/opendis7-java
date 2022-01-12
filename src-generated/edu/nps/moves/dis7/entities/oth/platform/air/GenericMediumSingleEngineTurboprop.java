// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericMediumSingleEngineTurboprop</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericMediumSingleEngineTurboprop.createInstance()</code> or <code>new GenericMediumSingleEngineTurboprop()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg) = <code>86</code>; </li>
 *     <li> SubCategory: GenericMediumSingleEngineTurboprop  = <code>21</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24701; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@61533ae. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftMediumupto41000lbs18597kg
 * @see SubCategory

 */
public final class GenericMediumSingleEngineTurboprop extends EntityType
{
    /** Default constructor */
    public GenericMediumSingleEngineTurboprop()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)86); // uid 24699, Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg)
        setSubCategory((byte)21); // uid 24701, Generic Medium Single Engine Turboprop
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericMediumSingleEngineTurboprop createInstance()
    {
            return new GenericMediumSingleEngineTurboprop();
    }
}
