// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L10Fearless</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L10Fearless.createInstance()</code> or <code>new L10Fearless()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious transport dock = <code>56</code>; </li>
 *     <li> SubCategory: AssaultshipsLPD  = <code>1</code>; </li>
 *     <li> Specific: L10Fearless  = <code>1</code>; </li>
 *     <li> Entity type uid: 15578; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2ceee4b6. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Amphibioustransportdock
 * @see SubCategory

 */
public final class L10Fearless extends EntityType
{
    /** Default constructor */
    public L10Fearless()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 15576, Amphibious transport dock
        setSubCategory((byte)1); // uid 15577, Assault ships (LPD)
        setSpecific((byte)1); // uid 15578, L 10 Fearless
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L10Fearless createInstance()
    {
            return new L10Fearless();
    }
}
