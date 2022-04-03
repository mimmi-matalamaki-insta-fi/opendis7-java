// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AAAAntiAircraftArtilleryFireControl</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AAAAntiAircraftArtilleryFireControl.createInstance()</code> or <code>new AAAAntiAircraftArtilleryFireControl()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Passive (intercept and DF) = <code>3</code>; </li>
 *     <li> SubCategory: AAAAntiAircraftArtilleryFireControl  = <code>17</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30385; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4544ab46. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFPassiveinterceptandDF
 * @see SubCategory

 */
public final class AAAAntiAircraftArtilleryFireControl extends EntityType
{
    /** Default constructor */
    public AAAAntiAircraftArtilleryFireControl()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 28849, RF Passive (intercept and DF)
        setSubCategory((byte)17); // uid 30385, AAA (Anti-Aircraft Artillery) Fire Control
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AAAAntiAircraftArtilleryFireControl createInstance()
    {
            return new AAAAntiAircraftArtilleryFireControl();
    }
}
