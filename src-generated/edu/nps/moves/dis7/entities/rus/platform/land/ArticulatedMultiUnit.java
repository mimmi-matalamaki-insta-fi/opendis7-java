// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ArticulatedMultiUnit</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ArticulatedMultiUnit.createInstance()</code> or <code>new ArticulatedMultiUnit()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Bus = <code>82</code>; </li>
 *     <li> SubCategory: ArticulatedMultiUnit  = <code>18</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 34239; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2cc04358. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Bus
 * @see SubCategory

 */
public final class ArticulatedMultiUnit extends EntityType
{
    /** Default constructor */
    public ArticulatedMultiUnit()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)82); // uid 34233, Bus
        setSubCategory((byte)18); // uid 34239, Articulated (Multi-Unit)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ArticulatedMultiUnit createInstance()
    {
            return new ArticulatedMultiUnit();
    }
}
