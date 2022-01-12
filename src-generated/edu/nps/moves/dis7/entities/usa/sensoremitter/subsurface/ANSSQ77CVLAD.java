// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANSSQ77CVLAD</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANSSQ77CVLAD.createInstance()</code> or <code>new ANSSQ77CVLAD()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, Passive = <code>11</code>; </li>
 *     <li> SubCategory: Sonobuoy  = <code>77</code>; </li>
 *     <li> Specific: ANSSQ77VLADVerticalLineArrayDIFAR  = <code>3</code>; </li>
 *     <li> Entity type uid: 22405; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@76eadc5a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AcousticPassive
 * @see SubCategory

 */
public final class ANSSQ77CVLAD extends EntityType
{
    /** Default constructor */
    public ANSSQ77CVLAD()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 22395, Acoustic, Passive
        setSubCategory((byte)77); // uid 22396, Sonobuoy
        setSpecific((byte)3); // uid 22403, AN/SSQ-77 VLAD (Vertical Line Array DIFAR)
        setExtra((byte)2); // uid 22405, AN/SSQ-77C VLAD
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANSSQ77CVLAD createInstance()
    {
            return new ANSSQ77CVLAD();
    }
}
