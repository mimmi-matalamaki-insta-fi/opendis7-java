// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ClubKMissileContainerAntiShip</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ClubKMissileContainerAntiShip.createInstance()</code> or <code>new ClubKMissileContainerAntiShip()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Cargo Container = <code>16</code>; </li>
 *     <li> SubCategory: ClubKMissileContainer  = <code>2</code>; </li>
 *     <li> Specific: ClubKMissileContainerAntiShip  = <code>1</code>; </li>
 *     <li> Entity type uid: 30589; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6475e778. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoContainer
 * @see SubCategory

 */
public final class ClubKMissileContainerAntiShip extends EntityType
{
    /** Default constructor */
    public ClubKMissileContainerAntiShip()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)16); // uid 22062, Cargo Container
        setSubCategory((byte)2); // uid 30588, Club-K Missile Container
        setSpecific((byte)1); // uid 30589, Club-K Missile Container - Anti-Ship
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ClubKMissileContainerAntiShip createInstance()
    {
            return new ClubKMissileContainerAntiShip();
    }
}
