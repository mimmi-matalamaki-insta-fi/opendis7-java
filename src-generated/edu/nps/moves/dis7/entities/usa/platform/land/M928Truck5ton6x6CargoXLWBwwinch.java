// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M928Truck5ton6x6CargoXLWBwwinch</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M928Truck5ton6x6CargoXLWBwwinch.createInstance()</code> or <code>new M928Truck5ton6x6CargoXLWBwwinch()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: M9396X65toncargotruck  = <code>5</code>; </li>
 *     <li> Specific: M928Truck5ton6x6CargoXLWBwwinch  = <code>13</code>; </li>
 *     <li> Entity type uid: 10448; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4214ae8f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class M928Truck5ton6x6CargoXLWBwwinch extends EntityType
{
    /** Default constructor */
    public M928Truck5ton6x6CargoXLWBwwinch()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)5); // uid 10435, M939 6X6 5-ton cargo truck
        setSpecific((byte)13); // uid 10448, M928 - Truck, 5-ton, 6x6, Cargo, XLWB w/winch
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M928Truck5ton6x6CargoXLWBwwinch createInstance()
    {
            return new M928Truck5ton6x6CargoXLWBwwinch();
    }
}
