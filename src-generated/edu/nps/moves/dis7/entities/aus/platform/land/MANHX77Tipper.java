// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MANHX77Tipper</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MANHX77Tipper.createInstance()</code> or <code>new MANHX77Tipper()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MANHX778x8  = <code>3</code>; </li>
 *     <li> Specific: MANHX77Tipper  = <code>2</code>; </li>
 *     <li> Entity type uid: 29742; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24273305. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MANHX77Tipper extends EntityType
{
    /** Default constructor */
    public MANHX77Tipper()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)3); // uid 29730, MAN HX77 - 8x8
        setSpecific((byte)2); // uid 29742, MAN HX77 Tipper
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MANHX77Tipper createInstance()
    {
            return new MANHX77Tipper();
    }
}
