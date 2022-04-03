// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.csk.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RamonaSoftBall</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RamonaSoftBall.createInstance()</code> or <code>new RamonaSoftBall()</code>. </p>
 * <ul>
 *     <li> Country: Czechoslovakia (CSK) = <code>56</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Passive (intercept and DF) = <code>3</code>; </li>
 *     <li> SubCategory: IdentificationClassificationRadar  = <code>16</code>; </li>
 *     <li> Specific: RamonaSoftBall  = <code>1</code>; </li>
 *     <li> Entity type uid: 22502; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37142579. </p>
 * @see Country#ACTION_REQUEST_RELIABLE
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFPassiveinterceptandDF
 * @see SubCategory

 */
public final class RamonaSoftBall extends EntityType
{
    /** Default constructor */
    public RamonaSoftBall()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 22500, RF Passive (intercept and DF)
        setSubCategory((byte)16); // uid 22501, Identification/Classification Radar
        setSpecific((byte)1); // uid 22502, Ramona (Soft Ball)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RamonaSoftBall createInstance()
    {
            return new RamonaSoftBall();
    }
}
