// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MTVRAMK30A1ArmoredDump</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MTVRAMK30A1ArmoredDump.createInstance()</code> or <code>new MTVRAMK30A1ArmoredDump()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MediumTacticalVehicleReplacementMTVR7Ton  = <code>39</code>; </li>
 *     <li> Specific: MTVRMK30Dump  = <code>6</code>; </li>
 *     <li> Entity type uid: 33446; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@31acfd4e. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MTVRAMK30A1ArmoredDump extends EntityType
{
    /** Default constructor */
    public MTVRAMK30A1ArmoredDump()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)39); // uid 25306, Medium Tactical Vehicle Replacement (MTVR) 7-Ton
        setSpecific((byte)6); // uid 25312, MTVR MK30 Dump
        setExtra((byte)3); // uid 33446, MTVR AMK30A1 Armored Dump
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MTVRAMK30A1ArmoredDump createInstance()
    {
            return new MTVRAMK30A1ArmoredDump();
    }
}
