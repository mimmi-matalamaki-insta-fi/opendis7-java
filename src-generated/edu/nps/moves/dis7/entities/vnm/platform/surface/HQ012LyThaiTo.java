/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HQ012LyThaiTo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HQ012LyThaiTo.createInstance()</code> or <code>new HQ012LyThaiTo()</code>. </p>
 * <ul>
 *     <li> Country: Viet Nam (VNM) = <code>230</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: Gepard39Class  = <code>1</code>; </li>
 *     <li> Specific: HQ012LyThaiTo  = <code>2</code>; </li>
 *     <li> Entity type uid: 28605; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59d5a6fd. </p>
 * @see Country#VIET_NAM_VNM
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class HQ012LyThaiTo extends EntityType
{
    /** Default constructor */
    public HQ012LyThaiTo()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28602, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 28603, Gepard 3.9 Class
        setSpecific((byte)2); // uid 28605, HQ-012 Ly Thai To
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HQ012LyThaiTo createInstance()
    {
            return new HQ012LyThaiTo();
    }
}
