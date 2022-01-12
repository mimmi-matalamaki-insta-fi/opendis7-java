// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CargoTruck25TonwOpenCargoBayand81mmMortar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CargoTruck25TonwOpenCargoBayand81mmMortar.createInstance()</code> or <code>new CargoTruck25TonwOpenCargoBayand81mmMortar()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Cargo Truck = <code>83</code>; </li>
 *     <li> SubCategory: CargoTruckupto25Ton  = <code>11</code>; </li>
 *     <li> Specific: CargoTruck25TonwOpenCargoBay  = <code>1</code>; </li>
 *     <li> Entity type uid: 24944; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4e22368c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitCargoTruck
 * @see SubCategory

 */
public final class CargoTruck25TonwOpenCargoBayand81mmMortar extends EntityType
{
    /** Default constructor */
    public CargoTruck25TonwOpenCargoBayand81mmMortar()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24926, Single Unit Cargo Truck
        setSubCategory((byte)11); // uid 24942, Cargo Truck, up to 2.5 Ton
        setSpecific((byte)1); // uid 24943, Cargo Truck, 2.5 Ton w/ Open Cargo Bay
        setExtra((byte)1); // uid 24944, Cargo Truck, 2.5 Ton w/ Open Cargo Bay and 81mm Mortar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CargoTruck25TonwOpenCargoBayand81mmMortar createInstance()
    {
            return new CargoTruck25TonwOpenCargoBayand81mmMortar();
    }
}
