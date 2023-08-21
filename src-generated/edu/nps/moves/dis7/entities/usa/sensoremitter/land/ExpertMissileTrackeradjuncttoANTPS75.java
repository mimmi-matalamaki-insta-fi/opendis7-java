/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ExpertMissileTrackeradjuncttoANTPS75</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ExpertMissileTrackeradjuncttoANTPS75.createInstance()</code> or <code>new ExpertMissileTrackeradjuncttoANTPS75()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Passive = <code>3</code>; </li>
 *     <li> SubCategory: FiringPointLaunchPointDeterminationSensor  = <code>8</code>; </li>
 *     <li> Specific: ExpertMissileTrackeradjuncttoANTPS75  = <code>1</code>; </li>
 *     <li> Entity type uid: 22358; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d5cd210. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFPassive
 * @see SubCategory

 */
public final class ExpertMissileTrackeradjuncttoANTPS75 extends EntityType
{
    /** Default constructor */
    public ExpertMissileTrackeradjuncttoANTPS75()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 22356, RF Passive
        setSubCategory((byte)8); // uid 22357, Firing Point/Launch Point Determination Sensor
        setSpecific((byte)1); // uid 22358, Expert Missile Tracker (adjunct to AN/TPS-75)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ExpertMissileTrackeradjuncttoANTPS75 createInstance()
    {
            return new ExpertMissileTrackeradjuncttoANTPS75();
    }
}
