// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BTMhighspeedditchingmachine</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BTMhighspeedditchingmachine.createInstance()</code> or <code>new BTMhighspeedditchingmachine()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Tracked Utility Vehicle = <code>9</code>; </li>
 *     <li> SubCategory: BTMhighspeedditchingmachine  = <code>8</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 12952; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@67e28be3. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeTrackedUtilityVehicle
 * @see SubCategory

 */
public final class BTMhighspeedditchingmachine extends EntityType
{
    /** Default constructor */
    public BTMhighspeedditchingmachine()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 12944, Large Tracked Utility Vehicle
        setSubCategory((byte)8); // uid 12952, BTM high-speed ditching machine
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BTMhighspeedditchingmachine createInstance()
    {
            return new BTMhighspeedditchingmachine();
    }
}
