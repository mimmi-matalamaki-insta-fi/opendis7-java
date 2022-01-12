// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MHV904Lyoe</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MHV904Lyoe.createInstance()</code> or <code>new MHV904Lyoe()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Boats = <code>63</code>; </li>
 *     <li> SubCategory: MHV900Class  = <code>1</code>; </li>
 *     <li> Specific: MHV904Lyoe  = <code>4</code>; </li>
 *     <li> Entity type uid: 25477; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@776b83cc. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardBoats
 * @see SubCategory

 */
public final class MHV904Lyoe extends EntityType
{
    /** Default constructor */
    public MHV904Lyoe()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 25472, Coast Guard Boats
        setSubCategory((byte)1); // uid 25473, MHV 900 Class
        setSpecific((byte)4); // uid 25477, MHV-904 Lyoe
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MHV904Lyoe createInstance()
    {
            return new MHV904Lyoe();
    }
}
