// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ItalianMEADSSurveillanceRadarSR</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ItalianMEADSSurveillanceRadarSR.createInstance()</code> or <code>new ItalianMEADSSurveillanceRadarSR()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: ItalianMediumExtendedAirDefenseSystemMEADS  = <code>2</code>; </li>
 *     <li> Specific: ItalianMEADSSurveillanceRadarSR  = <code>2</code>; </li>
 *     <li> Entity type uid: 34507; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b0a7baf. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class ItalianMEADSSurveillanceRadarSR extends EntityType
{
    /** Default constructor */
    public ItalianMEADSSurveillanceRadarSR()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 18296, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)2); // uid 34503, Italian Medium Extended Air Defense System (MEADS)
        setSpecific((byte)2); // uid 34507, Italian MEADS Surveillance Radar (SR)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ItalianMEADSSurveillanceRadarSR createInstance()
    {
            return new ItalianMEADSSurveillanceRadarSR();
    }
}
