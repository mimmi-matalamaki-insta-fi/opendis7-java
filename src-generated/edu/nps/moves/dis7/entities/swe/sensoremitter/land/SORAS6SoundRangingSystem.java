/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SORAS6SoundRangingSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SORAS6SoundRangingSystem.createInstance()</code> or <code>new SORAS6SoundRangingSystem()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, Passive = <code>11</code>; </li>
 *     <li> SubCategory: Firingpointlaunchpointlocation  = <code>8</code>; </li>
 *     <li> Specific: SORAS6SoundRangingSystem  = <code>1</code>; </li>
 *     <li> Entity type uid: 23708; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25f14e93. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AcousticPassive
 * @see SubCategory

 */
public final class SORAS6SoundRangingSystem extends EntityType
{
    /** Default constructor */
    public SORAS6SoundRangingSystem()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 23706, Acoustic, Passive
        setSubCategory((byte)8); // uid 23707, Firing point/launch point location
        setSpecific((byte)1); // uid 23708, SORAS-6 Sound Ranging System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SORAS6SoundRangingSystem createInstance()
    {
            return new SORAS6SoundRangingSystem();
    }
}
