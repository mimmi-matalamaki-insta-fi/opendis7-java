/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TurnTwistR3813</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TurnTwistR3813.createInstance()</code> or <code>new TurnTwistR3813()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Passive (intercept and DF) = <code>3</code>; </li>
 *     <li> SubCategory: IdentificationClassificationincludingIFF  = <code>16</code>; </li>
 *     <li> Specific: TurnTwistR3813  = <code>3</code>; </li>
 *     <li> Entity type uid: 22837; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a63fa71. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFPassiveinterceptandDF
 * @see SubCategory

 */
public final class TurnTwistR3813 extends EntityType
{
    /** Default constructor */
    public TurnTwistR3813()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 22833, RF Passive (intercept and DF)
        setSubCategory((byte)16); // uid 22834, Identification/Classification (including IFF)
        setSpecific((byte)3); // uid 22837, Turn Twist R-381-3
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TurnTwistR3813 createInstance()
    {
            return new TurnTwistR3813();
    }
}
