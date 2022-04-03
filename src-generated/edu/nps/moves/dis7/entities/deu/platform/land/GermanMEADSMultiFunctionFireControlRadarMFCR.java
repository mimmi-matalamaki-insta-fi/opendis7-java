// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GermanMEADSMultiFunctionFireControlRadarMFCR</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GermanMEADSMultiFunctionFireControlRadarMFCR.createInstance()</code> or <code>new GermanMEADSMultiFunctionFireControlRadarMFCR()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: GermanMediumExtendedAirDefenseSystemMEADS  = <code>6</code>; </li>
 *     <li> Specific: GermanMEADSMultiFunctionFireControlRadarMFCR  = <code>3</code>; </li>
 *     <li> Entity type uid: 34498; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78383390. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class GermanMEADSMultiFunctionFireControlRadarMFCR extends EntityType
{
    /** Default constructor */
    public GermanMEADSMultiFunctionFireControlRadarMFCR()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)6); // uid 34493, German Medium Extended Air Defense System (MEADS)
        setSpecific((byte)3); // uid 34498, German MEADS Multi Function Fire Control Radar (MFCR)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GermanMEADSMultiFunctionFireControlRadarMFCR createInstance()
    {
            return new GermanMEADSMultiFunctionFireControlRadarMFCR();
    }
}
