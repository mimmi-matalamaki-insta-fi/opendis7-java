// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Tortoise</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Tortoise.createInstance()</code> or <code>new Tortoise()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Reptile = <code>201</code>; </li>
 *     <li> SubCategory: Tortoise  = <code>90</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32252; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@780ee3ad. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Reptile
 * @see SubCategory

 */
public final class Tortoise extends EntityType
{
    /** Default constructor */
    public Tortoise()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)201); // uid 32241, Reptile
        setSubCategory((byte)90); // uid 32252, Tortoise
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Tortoise createInstance()
    {
            return new Tortoise();
    }
}
