// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA23AGladiatorTELAR9A83M</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA23AGladiatorTELAR9A83M.createInstance()</code> or <code>new SA23AGladiatorTELAR9A83M()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SA23GladiatorGiantSAMSystemS300VMAntey2500  = <code>26</code>; </li>
 *     <li> Specific: SA23MultichannelMissileGuidanceStationMMGS  = <code>2</code>; </li>
 *     <li> Entity type uid: 29862; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3ffb3598. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class SA23AGladiatorTELAR9A83M extends EntityType
{
    /** Default constructor */
    public SA23AGladiatorTELAR9A83M()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)26); // uid 29855, SA-23 Gladiator/Giant SAM System (S-300VM/Antey-2500)
        setSpecific((byte)2); // uid 29860, SA-23 Multichannel Missile Guidance Station (MMGS)
        setExtra((byte)2); // uid 29862, SA-23A Gladiator TELAR (9A83M)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA23AGladiatorTELAR9A83M createInstance()
    {
            return new SA23AGladiatorTELAR9A83M();
    }
}
