// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Sonobuoy</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Sonobuoy.createInstance()</code> or <code>new Sonobuoy()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, Active = <code>10</code>; </li>
 *     <li> SubCategory: Sonobuoy  = <code>77</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 26687; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1534bdc6. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AcousticActive
 * @see SubCategory

 */
public final class Sonobuoy extends EntityType
{
    /** Default constructor */
    public Sonobuoy()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 26686, Acoustic, Active
        setSubCategory((byte)77); // uid 26687, Sonobuoy
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Sonobuoy createInstance()
    {
            return new Sonobuoy();
    }
}
