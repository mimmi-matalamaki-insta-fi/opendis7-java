// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.sensoremitter.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TowedCMBAT1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TowedCMBAT1.createInstance()</code> or <code>new TowedCMBAT1()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic active = <code>10</code>; </li>
 *     <li> SubCategory: TowedCounterMeasure  = <code>79</code>; </li>
 *     <li> Specific: TowedCMBAT1  = <code>1</code>; </li>
 *     <li> Entity type uid: 22456; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1ab268bd. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Acousticactive
 * @see SubCategory

 */
public final class TowedCMBAT1 extends EntityType
{
    /** Default constructor */
    public TowedCMBAT1()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 22453, Acoustic active
        setSubCategory((byte)79); // uid 22455, Towed Counter Measure
        setSpecific((byte)1); // uid 22456, Towed CM BAT-1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TowedCMBAT1 createInstance()
    {
            return new TowedCMBAT1();
    }
}
