// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YamagumoClassDD</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YamagumoClassDD.createInstance()</code> or <code>new YamagumoClassDD()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer (DD) = <code>5</code>; </li>
 *     <li> SubCategory: YamagumoClassDD  = <code>7</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18897; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@28fa700e. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DestroyerDD
 * @see SubCategory

 */
public final class YamagumoClassDD extends EntityType
{
    /** Default constructor */
    public YamagumoClassDD()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)7); // uid 18897, Yamagumo Class (DD)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YamagumoClassDD createInstance()
    {
            return new YamagumoClassDD();
    }
}
