// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1165A1IntegratedArmorProtectionIAP</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1165A1IntegratedArmorProtectionIAP.createInstance()</code> or <code>new M1165A1IntegratedArmorProtectionIAP()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: HighMobilityMultipurposeWheeledVehicleHMMWVHumvee  = <code>1</code>; </li>
 *     <li> Specific: M1165UpArmoredHMMWV  = <code>34</code>; </li>
 *     <li> Entity type uid: 25643; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1c240cf2. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class M1165A1IntegratedArmorProtectionIAP extends EntityType
{
    /** Default constructor */
    public M1165A1IntegratedArmorProtectionIAP()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 10349, High Mobility Multipurpose Wheeled Vehicle (HMMWV) Humvee
        setSpecific((byte)34); // uid 25642, M1165 Up-Armored HMMWV
        setExtra((byte)1); // uid 25643, M1165A1 Integrated Armor Protection (IAP)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1165A1IntegratedArmorProtectionIAP createInstance()
    {
            return new M1165A1IntegratedArmorProtectionIAP();
    }
}
