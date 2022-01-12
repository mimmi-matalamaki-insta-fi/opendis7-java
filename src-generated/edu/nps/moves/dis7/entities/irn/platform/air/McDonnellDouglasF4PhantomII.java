// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>McDonnellDouglasF4PhantomII</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>McDonnellDouglasF4PhantomII.createInstance()</code> or <code>new McDonnellDouglasF4PhantomII()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: McDonnellDouglasF4PhantomII  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31133; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5bd82fed. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class McDonnellDouglasF4PhantomII extends EntityType
{
    /** Default constructor */
    public McDonnellDouglasF4PhantomII()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 30039, Attack/Strike
        setSubCategory((byte)3); // uid 31133, McDonnell-Douglas F-4 Phantom II
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static McDonnellDouglasF4PhantomII createInstance()
    {
            return new McDonnellDouglasF4PhantomII();
    }
}
