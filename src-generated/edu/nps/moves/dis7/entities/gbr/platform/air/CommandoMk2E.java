// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CommandoMk2E</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CommandoMk2E.createInstance()</code> or <code>new CommandoMk2E()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Helicopter = <code>23</code>; </li>
 *     <li> SubCategory: WestlandCommando  = <code>1</code>; </li>
 *     <li> Specific: CommandoMk2E  = <code>4</code>; </li>
 *     <li> Entity type uid: 15167; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6bcc3f27. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoHelicopter
 * @see SubCategory

 */
public final class CommandoMk2E extends EntityType
{
    /** Default constructor */
    public CommandoMk2E()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)23); // uid 15162, Cargo Helicopter
        setSubCategory((byte)1); // uid 15163, Westland Commando
        setSpecific((byte)4); // uid 15167, Commando Mk 2E
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CommandoMk2E createInstance()
    {
            return new CommandoMk2E();
    }
}
