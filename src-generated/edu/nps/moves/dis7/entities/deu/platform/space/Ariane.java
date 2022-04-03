// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Ariane</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Ariane.createInstance()</code> or <code>new Ariane()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Booster = <code>3</code>; </li>
 *     <li> SubCategory: Ariane  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 16853; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3b7ff809. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Booster
 * @see SubCategory

 */
public final class Ariane extends EntityType
{
    /** Default constructor */
    public Ariane()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)3); // uid 16852, Booster
        setSubCategory((byte)1); // uid 16853, Ariane
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Ariane createInstance()
    {
            return new Ariane();
    }
}
