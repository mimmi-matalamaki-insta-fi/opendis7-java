// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AntiSubmarineWarfarePatrolHelicopter</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AntiSubmarineWarfarePatrolHelicopter.createInstance()</code> or <code>new AntiSubmarineWarfarePatrolHelicopter()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/Patrol Helicopter = <code>22</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28197; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3b0ca5e1. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarePatrolHelicopter

 */
public final class AntiSubmarineWarfarePatrolHelicopter extends EntityType
{
    /** Default constructor */
    public AntiSubmarineWarfarePatrolHelicopter()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 28197, Anti-Submarine Warfare/Patrol Helicopter
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AntiSubmarineWarfarePatrolHelicopter createInstance()
    {
            return new AntiSubmarineWarfarePatrolHelicopter();
    }
}
