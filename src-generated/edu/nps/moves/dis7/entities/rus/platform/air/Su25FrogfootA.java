// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Su25FrogfootA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Su25FrogfootA.createInstance()</code> or <code>new Su25FrogfootA()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: Su25Frogfoot  = <code>8</code>; </li>
 *     <li> Specific: Su25FrogfootA  = <code>1</code>; </li>
 *     <li> Entity type uid: 13295; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3fd2322d. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class Su25FrogfootA extends EntityType
{
    /** Default constructor */
    public Su25FrogfootA()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 13259, Attack/Strike
        setSubCategory((byte)8); // uid 13294, Su-25 Frogfoot
        setSpecific((byte)1); // uid 13295, Su-25 Frogfoot A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Su25FrogfootA createInstance()
    {
            return new Su25FrogfootA();
    }
}
