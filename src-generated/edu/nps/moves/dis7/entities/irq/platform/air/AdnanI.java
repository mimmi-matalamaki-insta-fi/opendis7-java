/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irq.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AdnanI</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AdnanI.createInstance()</code> or <code>new AdnanI()</code>. </p>
 * <ul>
 *     <li> Country: Iraq (IRQ) = <code>102</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance/C2 (Airborne Early Warning) = <code>8</code>; </li>
 *     <li> SubCategory: IraqiAirForceAdnan1  = <code>1</code>; </li>
 *     <li> Specific: AdnanI  = <code>1</code>; </li>
 *     <li> Entity type uid: 18001; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6175619b. </p>
 * @see Country#IRAQ_IRQ
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceC2AirborneEarlyWarning
 * @see SubCategory

 */
public final class AdnanI extends EntityType
{
    /** Default constructor */
    public AdnanI()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 17999, Surveillance/C2 (Airborne Early Warning)
        setSubCategory((byte)1); // uid 18000, Iraqi Air Force Adnan 1
        setSpecific((byte)1); // uid 18001, Adnan I
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AdnanI createInstance()
    {
            return new AdnanI();
    }
}
