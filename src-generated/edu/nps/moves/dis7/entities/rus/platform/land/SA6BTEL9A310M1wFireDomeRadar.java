// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA6BTEL9A310M1wFireDomeRadar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA6BTEL9A310M1wFireDomeRadar.createInstance()</code> or <code>new SA6BTEL9A310M1wFireDomeRadar()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SA6GainfulSAMSystem  = <code>6</code>; </li>
 *     <li> Specific: SA6TEL  = <code>2</code>; </li>
 *     <li> Entity type uid: 13072; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4441d567. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class SA6BTEL9A310M1wFireDomeRadar extends EntityType
{
    /** Default constructor */
    public SA6BTEL9A310M1wFireDomeRadar()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)6); // uid 13068, SA-6 Gainful SAM System
        setSpecific((byte)2); // uid 13070, SA-6 TEL
        setExtra((byte)2); // uid 13072, SA-6B TEL (9A310M1 w/Fire Dome Radar)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA6BTEL9A310M1wFireDomeRadar createInstance()
    {
            return new SA6BTEL9A310M1wFireDomeRadar();
    }
}
