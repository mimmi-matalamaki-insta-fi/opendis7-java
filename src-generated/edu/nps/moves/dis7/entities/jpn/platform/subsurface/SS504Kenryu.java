/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SS504Kenryu</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SS504Kenryu.createInstance()</code> or <code>new SS504Kenryu()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSP (Attack Submarine - Diesel Air-Independent Propulsion) = <code>11</code>; </li>
 *     <li> SubCategory: SoryuClass  = <code>1</code>; </li>
 *     <li> Specific: SS504Kenryu  = <code>4</code>; </li>
 *     <li> Entity type uid: 31805; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a772895. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSPAttackSubmarineDieselAirIndependentPropulsion
 * @see SubCategory

 */
public final class SS504Kenryu extends EntityType
{
    /** Default constructor */
    public SS504Kenryu()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 31800, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
        setSubCategory((byte)1); // uid 31801, Soryu Class
        setSpecific((byte)4); // uid 31805, SS-504 Kenryu
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SS504Kenryu createInstance()
    {
            return new SS504Kenryu();
    }
}
