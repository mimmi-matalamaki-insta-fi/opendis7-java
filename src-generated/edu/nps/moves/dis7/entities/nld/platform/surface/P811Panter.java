// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P811Panter</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P811Panter.createInstance()</code> or <code>new P811Panter()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Cutters = <code>62</code>; </li>
 *     <li> SubCategory: DAMENStanPatrol4100  = <code>1</code>; </li>
 *     <li> Specific: P811Panter  = <code>2</code>; </li>
 *     <li> Entity type uid: 28299; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f34a967. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardCutters
 * @see SubCategory

 */
public final class P811Panter extends EntityType
{
    /** Default constructor */
    public P811Panter()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 28296, Coast Guard Cutters
        setSubCategory((byte)1); // uid 28297, DAMEN Stan Patrol 4100
        setSpecific((byte)2); // uid 28299, P811 Panter
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P811Panter createInstance()
    {
            return new P811Panter();
    }
}
