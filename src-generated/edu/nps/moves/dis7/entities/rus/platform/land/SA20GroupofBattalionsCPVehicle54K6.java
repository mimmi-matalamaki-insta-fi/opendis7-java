// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA20GroupofBattalionsCPVehicle54K6</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA20GroupofBattalionsCPVehicle54K6.createInstance()</code> or <code>new SA20GroupofBattalionsCPVehicle54K6()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SA20GargoyleSAMSystem  = <code>21</code>; </li>
 *     <li> Specific: SA20GroupofBattalionsCPVehicle54K6  = <code>1</code>; </li>
 *     <li> Entity type uid: 13146; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5cbd159f. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class SA20GroupofBattalionsCPVehicle54K6 extends EntityType
{
    /** Default constructor */
    public SA20GroupofBattalionsCPVehicle54K6()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)21); // uid 13145, SA-20 Gargoyle SAM System
        setSpecific((byte)1); // uid 13146, SA-20 Group of Battalions CP Vehicle (54K6)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA20GroupofBattalionsCPVehicle54K6 createInstance()
    {
            return new SA20GroupofBattalionsCPVehicle54K6();
    }
}
