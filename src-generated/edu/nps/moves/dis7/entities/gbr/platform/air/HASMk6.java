// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HASMk6</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HASMk6.createInstance()</code> or <code>new HASMk6()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare / Patrol Helicopter = <code>22</code>; </li>
 *     <li> SubCategory: WestlandSeaKing  = <code>1</code>; </li>
 *     <li> Specific: HASMk6  = <code>4</code>; </li>
 *     <li> Entity type uid: 15134; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4baed682. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarePatrolHelicopter
 * @see SubCategory

 */
public final class HASMk6 extends EntityType
{
    /** Default constructor */
    public HASMk6()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 15129, Anti-Submarine Warfare / Patrol Helicopter
        setSubCategory((byte)1); // uid 15130, Westland Sea King
        setSpecific((byte)4); // uid 15134, HAS. Mk 6
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HASMk6 createInstance()
    {
            return new HASMk6();
    }
}
