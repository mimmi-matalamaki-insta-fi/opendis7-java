/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MK84SUSSignalUnderwaterSound</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MK84SUSSignalUnderwaterSound.createInstance()</code> or <code>new MK84SUSSignalUnderwaterSound()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, active = <code>10</code>; </li>
 *     <li> SubCategory: Sonobuoy  = <code>77</code>; </li>
 *     <li> Specific: MK84SUSSignalUnderwaterSound  = <code>3</code>; </li>
 *     <li> Entity type uid: 25005; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b7e4b20. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Acousticactive
 * @see SubCategory

 */
public final class MK84SUSSignalUnderwaterSound extends EntityType
{
    /** Default constructor */
    public MK84SUSSignalUnderwaterSound()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 22382, Acoustic, active
        setSubCategory((byte)77); // uid 22384, Sonobuoy
        setSpecific((byte)3); // uid 25005, MK 84 SUS (Signal Underwater Sound)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MK84SUSSignalUnderwaterSound createInstance()
    {
            return new MK84SUSSignalUnderwaterSound();
    }
}
