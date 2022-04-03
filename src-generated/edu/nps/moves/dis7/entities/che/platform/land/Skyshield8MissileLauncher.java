// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Skyshield8MissileLauncher</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Skyshield8MissileLauncher.createInstance()</code> or <code>new Skyshield8MissileLauncher()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: OerlikonGDFSkyguardSkyshieldSystem  = <code>1</code>; </li>
 *     <li> Specific: Skyshield8MissileLauncher  = <code>3</code>; </li>
 *     <li> Entity type uid: 28901; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ddeaa5f. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class Skyshield8MissileLauncher extends EntityType
{
    /** Default constructor */
    public Skyshield8MissileLauncher()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 19039, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 19040, Oerlikon GDF Skyguard Skyshield System
        setSpecific((byte)3); // uid 28901, Skyshield 8 Missile Launcher
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Skyshield8MissileLauncher createInstance()
    {
            return new Skyshield8MissileLauncher();
    }
}
