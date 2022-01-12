// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Minivan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Minivan.createInstance()</code> or <code>new Minivan()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Car = <code>81</code>; </li>
 *     <li> SubCategory: Minivan  = <code>70</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25276; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2141a12. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Car
 * @see SubCategory

 */
public final class Minivan extends EntityType
{
    /** Default constructor */
    public Minivan()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24838, Car
        setSubCategory((byte)70); // uid 25276, Minivan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Minivan createInstance()
    {
            return new Minivan();
    }
}
