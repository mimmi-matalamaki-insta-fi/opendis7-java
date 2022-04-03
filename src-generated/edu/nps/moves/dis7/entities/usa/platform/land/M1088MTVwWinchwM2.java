// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1088MTVwWinchwM2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1088MTVwWinchwM2.createInstance()</code> or <code>new M1088MTVwWinchwM2()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: StewartampStevensonFamilyofMediumTacticalVehiclesFMTV  = <code>12</code>; </li>
 *     <li> Specific: M1088TruckTractor_MTVwEquipwWinch  = <code>16</code>; </li>
 *     <li> Entity type uid: 33240; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4f93bf0a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class M1088MTVwWinchwM2 extends EntityType
{
    /** Default constructor */
    public M1088MTVwWinchwM2()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)12); // uid 10481, Stewart &amp; Stevenson Family of Medium Tactical Vehicles (FMTV)
        setSpecific((byte)16); // uid 10497, M1088 Truck, Tractor; MTV, w/ Equip, w/ Winch
        setExtra((byte)1); // uid 33240, M1088 MTV w/ Winch w/ M2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1088MTVwWinchwM2 createInstance()
    {
            return new M1088MTVwWinchwM2();
    }
}
