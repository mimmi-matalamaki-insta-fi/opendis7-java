// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PatriotCommandCenter</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PatriotCommandCenter.createInstance()</code> or <code>new PatriotCommandCenter()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: MIM104RaytheonPatriotHightoMediumAltitudeAirDefenseHIMAD  = <code>4</code>; </li>
 *     <li> Specific: PatriotCommandCenter  = <code>1</code>; </li>
 *     <li> Entity type uid: 28097; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@403f0a22. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class PatriotCommandCenter extends EntityType
{
    /** Default constructor */
    public PatriotCommandCenter()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)4); // uid 28096, MIM-104 Raytheon Patriot High-to-Medium Altitude Air Defense (HIMAD)
        setSpecific((byte)1); // uid 28097, Patriot Command Center
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PatriotCommandCenter createInstance()
    {
            return new PatriotCommandCenter();
    }
}
