// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PL61Hateruma</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PL61Hateruma.createInstance()</code> or <code>new PL61Hateruma()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Cutters = <code>62</code>; </li>
 *     <li> SubCategory: HaterumaClassWPS  = <code>1</code>; </li>
 *     <li> Specific: PL61Hateruma  = <code>1</code>; </li>
 *     <li> Entity type uid: 33681; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@159e366. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardCutters
 * @see SubCategory

 */
public final class PL61Hateruma extends EntityType
{
    /** Default constructor */
    public PL61Hateruma()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 33679, Coast Guard Cutters
        setSubCategory((byte)1); // uid 33680, Hateruma Class (WPS)
        setSpecific((byte)1); // uid 33681, PL 61 Hateruma
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PL61Hateruma createInstance()
    {
            return new PL61Hateruma();
    }
}
