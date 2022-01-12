// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CombatVehicleCV90TankCV90120</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CombatVehicleCV90TankCV90120.createInstance()</code> or <code>new CombatVehicleCV90TankCV90120()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: CombatVehicleCV90TankCV90120  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27662; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@30ca0779. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class CombatVehicleCV90TankCV90120 extends EntityType
{
    /** Default constructor */
    public CombatVehicleCV90TankCV90120()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 17469, Tank
        setSubCategory((byte)2); // uid 27662, Combat Vehicle CV90 Tank (CV90120)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CombatVehicleCV90TankCV90120 createInstance()
    {
            return new CombatVehicleCV90TankCV90120();
    }
}
