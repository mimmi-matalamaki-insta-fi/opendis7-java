/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.yem.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_142Ramadan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_142Ramadan.createInstance()</code> or <code>new _142Ramadan()</code>. </p>
 * <ul>
 *     <li> Country: Yemen (YEM) = <code>237</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: BroadswordClasscoastalpatrolcraft  = <code>1</code>; </li>
 *     <li> Specific: _142Ramadan  = <code>2</code>; </li>
 *     <li> Entity type uid: 18741; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9281d19. </p>
 * @see Country#YEMEN_YEM
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _142Ramadan extends EntityType
{
    /** Default constructor */
    public _142Ramadan()
    {
        setCountry(Country.YEMEN_YEM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18738, Light/Patrol Craft
        setSubCategory((byte)1); // uid 18739, Broadsword Class (coastal patrol craft)
        setSpecific((byte)2); // uid 18741, 142 Ramadan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _142Ramadan createInstance()
    {
            return new _142Ramadan();
    }
}
