// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Il76MDCandidB</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Il76MDCandidB.createInstance()</code> or <code>new Il76MDCandidB()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: Il76Candid  = <code>3</code>; </li>
 *     <li> Specific: Il76MDCandidB  = <code>5</code>; </li>
 *     <li> Entity type uid: 13360; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3db663d0. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class Il76MDCandidB extends EntityType
{
    /** Default constructor */
    public Il76MDCandidB()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 13350, Cargo/Tanker
        setSubCategory((byte)3); // uid 13355, Il-76 Candid
        setSpecific((byte)5); // uid 13360, Il-76MD Candid B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Il76MDCandidB createInstance()
    {
            return new Il76MDCandidB();
    }
}
