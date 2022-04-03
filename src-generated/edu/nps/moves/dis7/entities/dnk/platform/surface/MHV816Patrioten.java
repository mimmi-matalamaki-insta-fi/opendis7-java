// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MHV816Patrioten</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MHV816Patrioten.createInstance()</code> or <code>new MHV816Patrioten()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Boats = <code>63</code>; </li>
 *     <li> SubCategory: MHV800Class  = <code>2</code>; </li>
 *     <li> Specific: MHV816Patrioten  = <code>16</code>; </li>
 *     <li> Entity type uid: 25501; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4c60d6e9. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardBoats
 * @see SubCategory

 */
public final class MHV816Patrioten extends EntityType
{
    /** Default constructor */
    public MHV816Patrioten()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 25472, Coast Guard Boats
        setSubCategory((byte)2); // uid 25485, MHV 800 Class
        setSpecific((byte)16); // uid 25501, MHV-816 Patrioten
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MHV816Patrioten createInstance()
    {
            return new MHV816Patrioten();
    }
}
