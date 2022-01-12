// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SH2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SH2.createInstance()</code> or <code>new SH2()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/patrol helicopter = <code>22</code>; </li>
 *     <li> SubCategory: KamanSeaspriteandSuperSeasprite  = <code>1</code>; </li>
 *     <li> Specific: SH2  = <code>1</code>; </li>
 *     <li> Entity type uid: 11135; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@46320c9a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarepatrolhelicopter
 * @see SubCategory

 */
public final class SH2 extends EntityType
{
    /** Default constructor */
    public SH2()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 11133, Anti-Submarine Warfare/patrol helicopter
        setSubCategory((byte)1); // uid 11134, Kaman Seasprite and Super Seasprite
        setSpecific((byte)1); // uid 11135, SH-2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SH2 createInstance()
    {
            return new SH2();
    }
}
