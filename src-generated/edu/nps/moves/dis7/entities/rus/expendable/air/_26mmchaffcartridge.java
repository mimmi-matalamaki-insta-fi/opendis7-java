/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_26mmchaffcartridge</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_26mmchaffcartridge.createInstance()</code> or <code>new _26mmchaffcartridge()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Chaff = <code>1</code>; </li>
 *     <li> SubCategory: Bundle  = <code>1</code>; </li>
 *     <li> Specific: _26mmchaffcartridge  = <code>6</code>; </li>
 *     <li> Entity type uid: 22299; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a7ae340. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Chaff
 * @see SubCategory

 */
public final class _26mmchaffcartridge extends EntityType
{
    /** Default constructor */
    public _26mmchaffcartridge()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 22290, Chaff
        setSubCategory((byte)1); // uid 22291, Bundle
        setSpecific((byte)6); // uid 22299, 26mm chaff cartridge
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _26mmchaffcartridge createInstance()
    {
            return new _26mmchaffcartridge();
    }
}
