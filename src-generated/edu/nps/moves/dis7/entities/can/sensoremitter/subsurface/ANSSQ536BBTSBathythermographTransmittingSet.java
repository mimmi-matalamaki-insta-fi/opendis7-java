/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANSSQ536BBTSBathythermographTransmittingSet</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANSSQ536BBTSBathythermographTransmittingSet.createInstance()</code> or <code>new ANSSQ536BBTSBathythermographTransmittingSet()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Thermal (temperature sensing) = <code>9</code>; </li>
 *     <li> SubCategory: BathythermalSensor  = <code>78</code>; </li>
 *     <li> Specific: ANSSQ536BBTSBathythermographTransmittingSet  = <code>1</code>; </li>
 *     <li> Entity type uid: 22598; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@54f25b42. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Thermaltemperaturesensing
 * @see SubCategory

 */
public final class ANSSQ536BBTSBathythermographTransmittingSet extends EntityType
{
    /** Default constructor */
    public ANSSQ536BBTSBathythermographTransmittingSet()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)9); // uid 22596, Thermal (temperature sensing)
        setSubCategory((byte)78); // uid 22597, Bathythermal Sensor
        setSpecific((byte)1); // uid 22598, AN/SSQ-536B BTS (Bathythermograph Transmitting Set)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANSSQ536BBTSBathythermographTransmittingSet createInstance()
    {
            return new ANSSQ536BBTSBathythermographTransmittingSet();
    }
}
