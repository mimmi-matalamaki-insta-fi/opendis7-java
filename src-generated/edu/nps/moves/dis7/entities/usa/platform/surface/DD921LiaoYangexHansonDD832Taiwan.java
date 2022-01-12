// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DD921LiaoYangexHansonDD832Taiwan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DD921LiaoYangexHansonDD832Taiwan.createInstance()</code> or <code>new DD921LiaoYangexHansonDD832Taiwan()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer = <code>5</code>; </li>
 *     <li> SubCategory: GearingWuChinIIIConversionFRAMIClass  = <code>3</code>; </li>
 *     <li> Specific: DD921LiaoYangexHansonDD832Taiwan  = <code>2</code>; </li>
 *     <li> Entity type uid: 11492; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4702e7a5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Destroyer
 * @see SubCategory

 */
public final class DD921LiaoYangexHansonDD832Taiwan extends EntityType
{
    /** Default constructor */
    public DD921LiaoYangexHansonDD832Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 11456, Destroyer
        setSubCategory((byte)3); // uid 11490, Gearing (Wu Chin III Conversion) (FRAM I) Class
        setSpecific((byte)2); // uid 11492, DD 921 Liao Yang (ex. Hanson DD 832) (Taiwan)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DD921LiaoYangexHansonDD832Taiwan createInstance()
    {
            return new DD921LiaoYangexHansonDD832Taiwan();
    }
}
