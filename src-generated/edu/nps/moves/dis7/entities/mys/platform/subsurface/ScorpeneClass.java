// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mys.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ScorpeneClass</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ScorpeneClass.createInstance()</code> or <code>new ScorpeneClass()</code>. </p>
 * <ul>
 *     <li> Country: Malaysia (MYS) = <code>132</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: ScorpeneClass  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 26251; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@667e34b1. </p>
 * @see Country#MALAYSIA_MYS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class ScorpeneClass extends EntityType
{
    /** Default constructor */
    public ScorpeneClass()
    {
        setCountry(Country.MALAYSIA_MYS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 26250, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 26251, Scorpene Class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ScorpeneClass createInstance()
    {
            return new ScorpeneClass();
    }
}
