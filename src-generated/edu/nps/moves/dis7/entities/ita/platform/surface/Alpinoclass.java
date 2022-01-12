// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Alpinoclass</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Alpinoclass.createInstance()</code> or <code>new Alpinoclass()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: Alpinoclass  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18602; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3af17be2. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class Alpinoclass extends EntityType
{
    /** Default constructor */
    public Alpinoclass()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18601, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 18602, Alpino class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Alpinoclass createInstance()
    {
            return new Alpinoclass();
    }
}
