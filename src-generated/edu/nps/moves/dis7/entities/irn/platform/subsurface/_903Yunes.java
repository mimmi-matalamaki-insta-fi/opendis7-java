// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_903Yunes</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_903Yunes.createInstance()</code> or <code>new _903Yunes()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional, Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: KiloClassProject877  = <code>1</code>; </li>
 *     <li> Specific: _903Yunes  = <code>3</code>; </li>
 *     <li> Entity type uid: 27823; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3fffff43. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class _903Yunes extends EntityType
{
    /** Default constructor */
    public _903Yunes()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18167, SS (Conventional, Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 18168, Kilo Class (Project 877)
        setSpecific((byte)3); // uid 27823, 903 Yunes
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _903Yunes createInstance()
    {
            return new _903Yunes();
    }
}
