// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA12AGladiatorTELAR9A831</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA12AGladiatorTELAR9A831.createInstance()</code> or <code>new SA12AGladiatorTELAR9A831()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SA12GladiatorGiantSAMSystemS300V  = <code>9</code>; </li>
 *     <li> Specific: Battery  = <code>2</code>; </li>
 *     <li> Entity type uid: 13093; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@14bf57b2. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class SA12AGladiatorTELAR9A831 extends EntityType
{
    /** Default constructor */
    public SA12AGladiatorTELAR9A831()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)9); // uid 13086, SA-12 Gladiator/Giant SAM System (S-300V)
        setSpecific((byte)2); // uid 13091, Battery
        setExtra((byte)2); // uid 13093, SA-12A Gladiator TELAR (9A83-1)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA12AGladiatorTELAR9A831 createInstance()
    {
            return new SA12AGladiatorTELAR9A831();
    }
}
