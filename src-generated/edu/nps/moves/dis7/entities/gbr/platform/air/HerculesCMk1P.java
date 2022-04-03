// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HerculesCMk1P</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HerculesCMk1P.createInstance()</code> or <code>new HerculesCMk1P()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: HerculesC130  = <code>2</code>; </li>
 *     <li> Specific: HerculesCMk1P  = <code>2</code>; </li>
 *     <li> Entity type uid: 15023; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7c20cdd0. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class HerculesCMk1P extends EntityType
{
    /** Default constructor */
    public HerculesCMk1P()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 15019, Cargo/Tanker
        setSubCategory((byte)2); // uid 15021, Hercules C130
        setSpecific((byte)2); // uid 15023, Hercules C. Mk 1P
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HerculesCMk1P createInstance()
    {
            return new HerculesCMk1P();
    }
}
