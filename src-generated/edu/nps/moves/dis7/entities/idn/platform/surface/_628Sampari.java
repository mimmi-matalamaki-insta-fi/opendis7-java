/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_628Sampari</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_628Sampari.createInstance()</code> or <code>new _628Sampari()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Attack Craft = <code>64</code>; </li>
 *     <li> SubCategory: KCR60MClassFastAttackMissileBoat  = <code>1</code>; </li>
 *     <li> Specific: _628Sampari  = <code>1</code>; </li>
 *     <li> Entity type uid: 29617; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@20b5f2ac. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastAttackCraft
 * @see SubCategory

 */
public final class _628Sampari extends EntityType
{
    /** Default constructor */
    public _628Sampari()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29615, Fast Attack Craft
        setSubCategory((byte)1); // uid 29616, KCR-60M Class (Fast Attack Missile Boat)
        setSpecific((byte)1); // uid 29617, 628 Sampari
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _628Sampari createInstance()
    {
            return new _628Sampari();
    }
}
