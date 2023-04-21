/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tha.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CVH911ChakriNaruebet</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CVH911ChakriNaruebet.createInstance()</code> or <code>new CVH911ChakriNaruebet()</code>. </p>
 * <ul>
 *     <li> Country: Thailand (THA) = <code>210</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cruiser/Helicopter Carrier = <code>13</code>; </li>
 *     <li> SubCategory: ChakriNaruebetClassCVH  = <code>1</code>; </li>
 *     <li> Specific: CVH911ChakriNaruebet  = <code>1</code>; </li>
 *     <li> Entity type uid: 33791; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75e27856. </p>
 * @see Country#THAILAND_THA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CruiserHelicopterCarrier
 * @see SubCategory

 */
public final class CVH911ChakriNaruebet extends EntityType
{
    /** Default constructor */
    public CVH911ChakriNaruebet()
    {
        setCountry(Country.THAILAND_THA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)13); // uid 33789, Cruiser/Helicopter Carrier
        setSubCategory((byte)1); // uid 33790, Chakri Naruebet Class (CVH)
        setSpecific((byte)1); // uid 33791, CVH-911 Chakri Naruebet
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CVH911ChakriNaruebet createInstance()
    {
            return new CVH911ChakriNaruebet();
    }
}
