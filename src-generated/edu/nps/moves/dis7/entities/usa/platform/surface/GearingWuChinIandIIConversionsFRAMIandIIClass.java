// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GearingWuChinIandIIConversionsFRAMIandIIClass</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GearingWuChinIandIIConversionsFRAMIandIIClass.createInstance()</code> or <code>new GearingWuChinIandIIConversionsFRAMIandIIClass()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: GearingWuChinIandIIConversionsFRAMIandIIClass  = <code>7</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 11451; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@696b52bc. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyer
 * @see SubCategory

 */
public final class GearingWuChinIandIIConversionsFRAMIandIIClass extends EntityType
{
    /** Default constructor */
    public GearingWuChinIandIIConversionsFRAMIandIIClass()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 11372, Guided Missile Destroyer
        setSubCategory((byte)7); // uid 11451, Gearing (Wu Chin I and II Conversions) (FRAM I and II) Class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GearingWuChinIandIIConversionsFRAMIandIIClass createInstance()
    {
            return new GearingWuChinIandIIConversionsFRAMIandIIClass();
    }
}
