// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DecoyMimic</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DecoyMimic.createInstance()</code> or <code>new DecoyMimic()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, active = <code>10</code>; </li>
 *     <li> SubCategory: DecoyMimic  = <code>28</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22459; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@642c5bb3. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Acousticactive
 * @see SubCategory

 */
public final class DecoyMimic extends EntityType
{
    /** Default constructor */
    public DecoyMimic()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 22458, Acoustic, active
        setSubCategory((byte)28); // uid 22459, Decoy/Mimic
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DecoyMimic createInstance()
    {
            return new DecoyMimic();
    }
}
