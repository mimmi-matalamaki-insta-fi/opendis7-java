// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FloatingTidalSteamPowerStation</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FloatingTidalSteamPowerStation.createInstance()</code> or <code>new FloatingTidalSteamPowerStation()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Electrical Power Installation = <code>7</code>; </li>
 *     <li> SubCategory: TidalPowerStation  = <code>2</code>; </li>
 *     <li> Specific: FloatingTidalSteamPowerStation  = <code>1</code>; </li>
 *     <li> Entity type uid: 29779; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13662609. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectricalPowerInstallation
 * @see SubCategory

 */
public final class FloatingTidalSteamPowerStation extends EntityType
{
    /** Default constructor */
    public FloatingTidalSteamPowerStation()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 29775, Electrical Power Installation
        setSubCategory((byte)2); // uid 29778, Tidal Power Station
        setSpecific((byte)1); // uid 29779, Floating Tidal Steam Power Station
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FloatingTidalSteamPowerStation createInstance()
    {
            return new FloatingTidalSteamPowerStation();
    }
}
