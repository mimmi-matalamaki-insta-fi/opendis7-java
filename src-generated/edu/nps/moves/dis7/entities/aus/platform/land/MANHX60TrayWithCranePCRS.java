/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MANHX60TrayWithCranePCRS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MANHX60TrayWithCranePCRS.createInstance()</code> or <code>new MANHX60TrayWithCranePCRS()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MANHX604x4  = <code>1</code>; </li>
 *     <li> Specific: MANHX60TrayWithCrane  = <code>2</code>; </li>
 *     <li> Entity type uid: 29723; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@449b2d27. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MANHX60TrayWithCranePCRS extends EntityType
{
    /** Default constructor */
    public MANHX60TrayWithCranePCRS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 29716, MAN HX60 - 4x4
        setSpecific((byte)2); // uid 29722, MAN HX60 Tray, With Crane
        setExtra((byte)1); // uid 29723, MAN HX60 Tray, With Crane, PCRS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MANHX60TrayWithCranePCRS createInstance()
    {
            return new MANHX60TrayWithCranePCRS();
    }
}
