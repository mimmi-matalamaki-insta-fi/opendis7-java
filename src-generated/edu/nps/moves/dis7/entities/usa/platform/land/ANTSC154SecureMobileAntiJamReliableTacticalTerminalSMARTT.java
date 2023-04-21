/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANTSC154SecureMobileAntiJamReliableTacticalTerminalSMARTT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANTSC154SecureMobileAntiJamReliableTacticalTerminalSMARTT.createInstance()</code> or <code>new ANTSC154SecureMobileAntiJamReliableTacticalTerminalSMARTT()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: C4I Facility = <code>35</code>; </li>
 *     <li> SubCategory: ANTSC154SecureMobileAntiJamReliableTacticalTerminalSMARTT  = <code>7</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27265; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7f3fc42f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see C4IFacility
 * @see SubCategory

 */
public final class ANTSC154SecureMobileAntiJamReliableTacticalTerminalSMARTT extends EntityType
{
    /** Default constructor */
    public ANTSC154SecureMobileAntiJamReliableTacticalTerminalSMARTT()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)35); // uid 10748, C4I Facility
        setSubCategory((byte)7); // uid 27265, AN/TSC-154 Secure Mobile Anti-Jam Reliable Tactical Terminal (SMART-T)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANTSC154SecureMobileAntiJamReliableTacticalTerminalSMARTT createInstance()
    {
            return new ANTSC154SecureMobileAntiJamReliableTacticalTerminalSMARTT();
    }
}
