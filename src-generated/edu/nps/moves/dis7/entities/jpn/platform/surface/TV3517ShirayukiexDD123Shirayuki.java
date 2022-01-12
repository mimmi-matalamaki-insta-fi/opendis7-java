// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TV3517ShirayukiexDD123Shirayuki</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TV3517ShirayukiexDD123Shirayuki.createInstance()</code> or <code>new TV3517ShirayukiexDD123Shirayuki()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer (DD) = <code>5</code>; </li>
 *     <li> SubCategory: HatsuyukiClassDD  = <code>4</code>; </li>
 *     <li> Specific: TV3517ShirayukiexDD123Shirayuki  = <code>2</code>; </li>
 *     <li> Entity type uid: 26255; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4efcf8a. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DestroyerDD
 * @see SubCategory

 */
public final class TV3517ShirayukiexDD123Shirayuki extends EntityType
{
    /** Default constructor */
    public TV3517ShirayukiexDD123Shirayuki()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)4); // uid 18894, Hatsuyuki Class (DD)
        setSpecific((byte)2); // uid 26255, TV-3517 Shirayuki (ex-DD-123 Shirayuki )
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TV3517ShirayukiexDD123Shirayuki createInstance()
    {
            return new TV3517ShirayukiexDD123Shirayuki();
    }
}
