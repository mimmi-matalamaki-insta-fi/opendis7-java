// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aut.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SK105Kurassier</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SK105Kurassier.createInstance()</code> or <code>new SK105Kurassier()</code>. </p>
 * <ul>
 *     <li> Country: Austria (AUT) = <code>14</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: SK105Kurassier  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31907; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@51081592. </p>
 * @see Country#AUSTRIA_AUT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class SK105Kurassier extends EntityType
{
    /** Default constructor */
    public SK105Kurassier()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 31906, Tank
        setSubCategory((byte)1); // uid 31907, SK-105 Kurassier
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SK105Kurassier createInstance()
    {
            return new SK105Kurassier();
    }
}
