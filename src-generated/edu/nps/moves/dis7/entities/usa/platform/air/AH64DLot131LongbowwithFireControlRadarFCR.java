/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AH64DLot131LongbowwithFireControlRadarFCR</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AH64DLot131LongbowwithFireControlRadarFCR.createInstance()</code> or <code>new AH64DLot131LongbowwithFireControlRadarFCR()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack helicopter = <code>20</code>; </li>
 *     <li> SubCategory: McDonnellDouglasAH64Apache  = <code>1</code>; </li>
 *     <li> Specific: AH64DLot131LongbowwithAirtoAirtoGroundAAG  = <code>9</code>; </li>
 *     <li> Entity type uid: 28994; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@586495f1. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Attackhelicopter
 * @see SubCategory

 */
public final class AH64DLot131LongbowwithFireControlRadarFCR extends EntityType
{
    /** Default constructor */
    public AH64DLot131LongbowwithFireControlRadarFCR()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 11056, Attack helicopter
        setSubCategory((byte)1); // uid 11057, McDonnell-Douglas AH-64 Apache
        setSpecific((byte)9); // uid 28993, AH-64D Lot 13.1 Longbow with Air-to-Air-to Ground (AAG)
        setExtra((byte)1); // uid 28994, AH-64D Lot 13.1 Longbow with Fire Control Radar (FCR)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AH64DLot131LongbowwithFireControlRadarFCR createInstance()
    {
            return new AH64DLot131LongbowwithFireControlRadarFCR();
    }
}
