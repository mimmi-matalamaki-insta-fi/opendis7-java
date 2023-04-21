/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L9032DumontDurville</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L9032DumontDurville.createInstance()</code> or <code>new L9032DumontDurville()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: Batraltypelighttransportsandlandingships  = <code>2</code>; </li>
 *     <li> Specific: L9032DumontDurville  = <code>3</code>; </li>
 *     <li> Entity type uid: 16023; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45d2ade3. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class L9032DumontDurville extends EntityType
{
    /** Default constructor */
    public L9032DumontDurville()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 16017, Landing Craft
        setSubCategory((byte)2); // uid 16020, Batral type (light transports and landing ships)
        setSpecific((byte)3); // uid 16023, L 9032 Dumont D'urville
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L9032DumontDurville createInstance()
    {
            return new L9032DumontDurville();
    }
}
