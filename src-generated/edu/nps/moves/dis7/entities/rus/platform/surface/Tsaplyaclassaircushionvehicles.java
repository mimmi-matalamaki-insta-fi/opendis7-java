/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Tsaplyaclassaircushionvehicles</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Tsaplyaclassaircushionvehicles.createInstance()</code> or <code>new Tsaplyaclassaircushionvehicles()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air cushion/Surface effect = <code>15</code>; </li>
 *     <li> SubCategory: Tsaplyaclassaircushionvehicles  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 13799; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@53830483. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AircushionSurfaceeffect
 * @see SubCategory

 */
public final class Tsaplyaclassaircushionvehicles extends EntityType
{
    /** Default constructor */
    public Tsaplyaclassaircushionvehicles()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 13796, Air cushion/Surface effect
        setSubCategory((byte)3); // uid 13799, Tsaplya class (air-cushion vehicles)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Tsaplyaclassaircushionvehicles createInstance()
    {
            return new Tsaplyaclassaircushionvehicles();
    }
}
