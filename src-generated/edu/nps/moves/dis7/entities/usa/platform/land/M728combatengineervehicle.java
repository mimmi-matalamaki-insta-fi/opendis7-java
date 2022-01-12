// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M728CombatEngineerVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M728CombatEngineerVehicle.createInstance()</code> or <code>new M728CombatEngineerVehicle()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: M728CombatEngineerVehicle  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 10246; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6f3f0ae. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class M728CombatEngineerVehicle extends EntityType
{
    /** Default constructor */
    public M728CombatEngineerVehicle()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 10233, Armored Utility Vehicle
        setSubCategory((byte)5); // uid 10246, M728 Combat Engineer Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M728CombatEngineerVehicle createInstance()
    {
            return new M728CombatEngineerVehicle();
    }
}
