// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PatriotECSEngagementControlStationANMSQ104</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PatriotECSEngagementControlStationANMSQ104.createInstance()</code> or <code>new PatriotECSEngagementControlStationANMSQ104()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: MIM104RaytheonPatriotHightoMediumAltitudeAirDefenseHIMAD  = <code>4</code>; </li>
 *     <li> Specific: PatriotBattery  = <code>2</code>; </li>
 *     <li> Entity type uid: 28101; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@503ecb24. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class PatriotECSEngagementControlStationANMSQ104 extends EntityType
{
    /** Default constructor */
    public PatriotECSEngagementControlStationANMSQ104()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)4); // uid 28096, MIM-104 Raytheon Patriot High-to-Medium Altitude Air Defense (HIMAD)
        setSpecific((byte)2); // uid 28100, Patriot Battery
        setExtra((byte)1); // uid 28101, Patriot ECS (Engagement Control Station) AN/MSQ-104
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PatriotECSEngagementControlStationANMSQ104 createInstance()
    {
            return new PatriotECSEngagementControlStationANMSQ104();
    }
}
