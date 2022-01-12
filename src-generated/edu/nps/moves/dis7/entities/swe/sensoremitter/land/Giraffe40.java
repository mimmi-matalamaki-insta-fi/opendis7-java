// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Giraffe40</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Giraffe40.createInstance()</code> or <code>new Giraffe40()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: TargetAcquisitionRadar  = <code>5</code>; </li>
 *     <li> Specific: Giraffe  = <code>1</code>; </li>
 *     <li> Entity type uid: 22550; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2bc59ab7. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class Giraffe40 extends EntityType
{
    /** Default constructor */
    public Giraffe40()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22547, RF Active
        setSubCategory((byte)5); // uid 22548, Target Acquisition Radar
        setSpecific((byte)1); // uid 22549, Giraffe
        setExtra((byte)1); // uid 22550, Giraffe-40
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Giraffe40 createInstance()
    {
            return new Giraffe40();
    }
}
