// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Star266Maintenance</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Star266Maintenance.createInstance()</code> or <code>new Star266Maintenance()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: StarTruck  = <code>1</code>; </li>
 *     <li> Specific: Star266  = <code>2</code>; </li>
 *     <li> Entity type uid: 33273; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@67c277a0. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class Star266Maintenance extends EntityType
{
    /** Default constructor */
    public Star266Maintenance()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29481, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 29482, Star Truck
        setSpecific((byte)2); // uid 33265, Star 266
        setExtra((byte)8); // uid 33273, Star 266 Maintenance
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Star266Maintenance createInstance()
    {
            return new Star266Maintenance();
    }
}
