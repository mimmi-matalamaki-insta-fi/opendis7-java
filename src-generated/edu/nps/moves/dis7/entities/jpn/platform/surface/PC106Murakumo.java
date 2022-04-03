// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PC106Murakumo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PC106Murakumo.createInstance()</code> or <code>new PC106Murakumo()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Cutters = <code>62</code>; </li>
 *     <li> SubCategory: HayagumoClassWPC  = <code>5</code>; </li>
 *     <li> Specific: PC106Murakumo  = <code>2</code>; </li>
 *     <li> Entity type uid: 33723; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1af05b03. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardCutters
 * @see SubCategory

 */
public final class PC106Murakumo extends EntityType
{
    /** Default constructor */
    public PC106Murakumo()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 33679, Coast Guard Cutters
        setSubCategory((byte)5); // uid 33721, Hayagumo Class (WPC)
        setSpecific((byte)2); // uid 33723, PC 106 Murakumo
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PC106Murakumo createInstance()
    {
            return new PC106Murakumo();
    }
}
