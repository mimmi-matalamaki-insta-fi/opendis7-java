/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BisonMortarVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BisonMortarVehicle.createInstance()</code> or <code>new BisonMortarVehicle()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: Bison8x8Class  = <code>2</code>; </li>
 *     <li> Specific: BisonMortarVehicle  = <code>2</code>; </li>
 *     <li> Entity type uid: 31187; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@74650e52. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class BisonMortarVehicle extends EntityType
{
    /** Default constructor */
    public BisonMortarVehicle()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 30991, Armored Fighting Vehicle
        setSubCategory((byte)2); // uid 31185, Bison 8x8 Class
        setSpecific((byte)2); // uid 31187, Bison Mortar Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BisonMortarVehicle createInstance()
    {
            return new BisonMortarVehicle();
    }
}
