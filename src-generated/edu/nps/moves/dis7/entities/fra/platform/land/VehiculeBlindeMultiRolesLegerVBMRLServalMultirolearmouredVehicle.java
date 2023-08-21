/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>VehiculeBlindeMultiRolesLegerVBMRLServalMultirolearmouredVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VehiculeBlindeMultiRolesLegerVBMRLServalMultirolearmouredVehicle.createInstance()</code> or <code>new VehiculeBlindeMultiRolesLegerVBMRLServalMultirolearmouredVehicle()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: VehiculeBlindeMultiRolesVBMRGriffonMultirolearmouredVehicle  = <code>18</code>; </li>
 *     <li> Specific: VehiculeBlindeMultiRolesLegerVBMRLServalMultirolearmouredVehicle  = <code>1</code>; </li>
 *     <li> Entity type uid: 34223; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c80cf32. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class VehiculeBlindeMultiRolesLegerVBMRLServalMultirolearmouredVehicle extends EntityType
{
    /** Default constructor */
    public VehiculeBlindeMultiRolesLegerVBMRLServalMultirolearmouredVehicle()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 15645, Armored Fighting Vehicle
        setSubCategory((byte)18); // uid 34222, Vehicule Blinde Multi-Roles (VBMR) - Griffon Multi-role armoured Vehicle
        setSpecific((byte)1); // uid 34223, Vehicule Blinde Multi-Roles Leger (VBMR-L) - Serval Multi-role armoured Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VehiculeBlindeMultiRolesLegerVBMRLServalMultirolearmouredVehicle createInstance()
    {
            return new VehiculeBlindeMultiRolesLegerVBMRLServalMultirolearmouredVehicle();
    }
}
