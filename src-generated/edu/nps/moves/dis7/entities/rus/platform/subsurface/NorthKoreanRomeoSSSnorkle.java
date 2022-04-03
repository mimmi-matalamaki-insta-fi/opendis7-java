// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NorthKoreanRomeoSSSnorkle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NorthKoreanRomeoSSSnorkle.createInstance()</code> or <code>new NorthKoreanRomeoSSSnorkle()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: Romeoclass  = <code>4</code>; </li>
 *     <li> Specific: NorthKoreanRomeoSSSnorkle  = <code>1</code>; </li>
 *     <li> Entity type uid: 14804; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25673087. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class NorthKoreanRomeoSSSnorkle extends EntityType
{
    /** Default constructor */
    public NorthKoreanRomeoSSSnorkle()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 14799, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)4); // uid 14803, Romeo class
        setSpecific((byte)1); // uid 14804, (North Korean Romeo SS (Snorkle))
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NorthKoreanRomeoSSSnorkle createInstance()
    {
            return new NorthKoreanRomeoSSSnorkle();
    }
}
