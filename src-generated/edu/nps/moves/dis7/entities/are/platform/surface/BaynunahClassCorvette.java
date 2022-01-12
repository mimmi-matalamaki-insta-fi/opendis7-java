// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.are.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BaynunahClassCorvette</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BaynunahClassCorvette.createInstance()</code> or <code>new BaynunahClassCorvette()</code>. </p>
 * <ul>
 *     <li> Country: United Arab Emirates (ARE) = <code>223</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: BaynunahClassCorvette  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30355; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2db4ad1. </p>
 * @see Country#UNITED_ARAB_EMIRATES_ARE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class BaynunahClassCorvette extends EntityType
{
    /** Default constructor */
    public BaynunahClassCorvette()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 30354, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 30355, Baynunah Class (Corvette)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BaynunahClassCorvette createInstance()
    {
            return new BaynunahClassCorvette();
    }
}
