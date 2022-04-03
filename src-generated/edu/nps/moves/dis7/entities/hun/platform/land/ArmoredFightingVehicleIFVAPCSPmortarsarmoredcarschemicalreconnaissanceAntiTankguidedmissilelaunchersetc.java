// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.hun.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc.createInstance()</code> or <code>new ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc()</code>. </p>
 * <ul>
 *     <li> Country: Hungary (HUN) = <code>97</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle - (IFV, APC, SP mortars, armored cars, chemical reconnaissance, Anti-Tank guided missile launchers, etc.) = <code>2</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23530; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6f8f9349. </p>
 * @see Country#HUNGARY_HUN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc

 */
public final class ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc extends EntityType
{
    /** Default constructor */
    public ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc()
    {
        setCountry(Country.HUNGARY_HUN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 23530, Armored Fighting Vehicle - (IFV, APC, SP mortars, armored cars, chemical reconnaissance, Anti-Tank guided missile launchers, etc.)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc createInstance()
    {
            return new ArmoredFightingVehicleIFVAPCSPmortarsarmoredcarschemicalreconnaissanceAntiTankguidedmissilelaunchersetc();
    }
}
