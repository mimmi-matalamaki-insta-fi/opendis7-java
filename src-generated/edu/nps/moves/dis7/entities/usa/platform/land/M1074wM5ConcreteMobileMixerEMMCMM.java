// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1074wM5ConcreteMobileMixerEMMCMM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1074wM5ConcreteMobileMixerEMMCMM.createInstance()</code> or <code>new M1074wM5ConcreteMobileMixerEMMCMM()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg  = <code>19</code>; </li>
 *     <li> Specific: M1074PalletizedLoadSystemPLS  = <code>10</code>; </li>
 *     <li> Entity type uid: 30289; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7fdd43cd. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class M1074wM5ConcreteMobileMixerEMMCMM extends EntityType
{
    /** Default constructor */
    public M1074wM5ConcreteMobileMixerEMMCMM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)19); // uid 10543, Oshkosh Heavy Expanded Mobility Tactical Truck (HEMTT) 8x8 9979-kg
        setSpecific((byte)10); // uid 10553, M1074 Palletized Load System (PLS)
        setExtra((byte)2); // uid 30289, M1074 w/ M5 Concrete Mobile Mixer (EMM-CMM)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1074wM5ConcreteMobileMixerEMMCMM createInstance()
    {
            return new M1074wM5ConcreteMobileMixerEMMCMM();
    }
}
