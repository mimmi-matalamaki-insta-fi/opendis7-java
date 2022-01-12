// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BTMTMG2Shighspeedditchingmachine</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BTMTMG2Shighspeedditchingmachine.createInstance()</code> or <code>new BTMTMG2Shighspeedditchingmachine()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Tracked Utility Vehicle = <code>9</code>; </li>
 *     <li> SubCategory: BTMTMG2Shighspeedditchingmachine  = <code>11</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 12955; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@108bdbd8. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeTrackedUtilityVehicle
 * @see SubCategory

 */
public final class BTMTMG2Shighspeedditchingmachine extends EntityType
{
    /** Default constructor */
    public BTMTMG2Shighspeedditchingmachine()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 12944, Large Tracked Utility Vehicle
        setSubCategory((byte)11); // uid 12955, BTM-TMG2S high-speed ditching machine
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BTMTMG2Shighspeedditchingmachine createInstance()
    {
            return new BTMTMG2Shighspeedditchingmachine();
    }
}
