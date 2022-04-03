// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericConversionVan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericConversionVan.createInstance()</code> or <code>new GenericConversionVan()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Recreational = <code>90</code>; </li>
 *     <li> SubCategory: GenericConversionVan  = <code>14</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25964; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@682bd3c4. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Recreational
 * @see SubCategory

 */
public final class GenericConversionVan extends EntityType
{
    /** Default constructor */
    public GenericConversionVan()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)90); // uid 24835, Recreational
        setSubCategory((byte)14); // uid 25964, Generic Conversion Van
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericConversionVan createInstance()
    {
            return new GenericConversionVan();
    }
}
