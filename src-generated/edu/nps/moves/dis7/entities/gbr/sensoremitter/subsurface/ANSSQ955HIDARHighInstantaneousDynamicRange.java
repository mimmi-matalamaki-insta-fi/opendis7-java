// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANSSQ955HIDARHighInstantaneousDynamicRange</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANSSQ955HIDARHighInstantaneousDynamicRange.createInstance()</code> or <code>new ANSSQ955HIDARHighInstantaneousDynamicRange()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, Passive = <code>11</code>; </li>
 *     <li> SubCategory: Sonobuoy  = <code>77</code>; </li>
 *     <li> Specific: ANSSQ955HIDARHighInstantaneousDynamicRange  = <code>1</code>; </li>
 *     <li> Entity type uid: 22474; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@74b7497b. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AcousticPassive
 * @see SubCategory

 */
public final class ANSSQ955HIDARHighInstantaneousDynamicRange extends EntityType
{
    /** Default constructor */
    public ANSSQ955HIDARHighInstantaneousDynamicRange()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 22472, Acoustic, Passive
        setSubCategory((byte)77); // uid 22473, Sonobuoy
        setSpecific((byte)1); // uid 22474, AN/SSQ-955 HIDAR (High Instantaneous Dynamic Range)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANSSQ955HIDARHighInstantaneousDynamicRange createInstance()
    {
            return new ANSSQ955HIDARHighInstantaneousDynamicRange();
    }
}
