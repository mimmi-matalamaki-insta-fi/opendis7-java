/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YamahaFJR1300K</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YamahaFJR1300K.createInstance()</code> or <code>new YamahaFJR1300K()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Motorcycle = <code>80</code>; </li>
 *     <li> SubCategory: SportStreetMidSize  = <code>2</code>; </li>
 *     <li> Specific: YamahaFJR1300K  = <code>2</code>; </li>
 *     <li> Entity type uid: 27927; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5af9926a. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Motorcycle
 * @see SubCategory

 */
public final class YamahaFJR1300K extends EntityType
{
    /** Default constructor */
    public YamahaFJR1300K()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)80); // uid 24860, Motorcycle
        setSubCategory((byte)2); // uid 24861, Sport/Street (Mid-Size)
        setSpecific((byte)2); // uid 27927, Yamaha FJR1300K
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YamahaFJR1300K createInstance()
    {
            return new YamahaFJR1300K();
    }
}
