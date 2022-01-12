// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PrisonSecuritySearchlight</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PrisonSecuritySearchlight.createInstance()</code> or <code>new PrisonSecuritySearchlight()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Searchlight = <code>21</code>; </li>
 *     <li> SubCategory: PrisonSecuritySearchlight  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 26473; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1a336906. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Searchlight
 * @see SubCategory

 */
public final class PrisonSecuritySearchlight extends EntityType
{
    /** Default constructor */
    public PrisonSecuritySearchlight()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)21); // uid 26471, Searchlight
        setSubCategory((byte)2); // uid 26473, Prison/Security Searchlight
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PrisonSecuritySearchlight createInstance()
    {
            return new PrisonSecuritySearchlight();
    }
}
