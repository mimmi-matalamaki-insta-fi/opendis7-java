// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WarriorNMC40wM250calHeavyMachineGun</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WarriorNMC40wM250calHeavyMachineGun.createInstance()</code> or <code>new WarriorNMC40wM250calHeavyMachineGun()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: WarriorNMC40LongrangeFastAttackVehicleFAV  = <code>2</code>; </li>
 *     <li> Specific: WarriorNMC40wM250calHeavyMachineGun  = <code>1</code>; </li>
 *     <li> Entity type uid: 33401; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@577536e0. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class WarriorNMC40wM250calHeavyMachineGun extends EntityType
{
    /** Default constructor */
    public WarriorNMC40wM250calHeavyMachineGun()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 10374, Warrior NMC-40 Long-range Fast Attack Vehicle (FAV)
        setSpecific((byte)1); // uid 33401, Warrior NMC-40 w/M2 .50 cal Heavy Machine Gun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WarriorNMC40wM250calHeavyMachineGun createInstance()
    {
            return new WarriorNMC40wM250calHeavyMachineGun();
    }
}
