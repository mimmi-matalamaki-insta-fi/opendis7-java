// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L1020AnwarElSadat</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L1020AnwarElSadat.createInstance()</code> or <code>new L1020AnwarElSadat()</code>. </p>
 * <ul>
 *     <li> Country: Egypt (EGY) = <code>62</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Assault Ship = <code>54</code>; </li>
 *     <li> SubCategory: MistralClass  = <code>1</code>; </li>
 *     <li> Specific: L1020AnwarElSadat  = <code>2</code>; </li>
 *     <li> Entity type uid: 33576; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c80cf32. </p>
 * @see Country#COMMENT_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousAssaultShip
 * @see SubCategory

 */
public final class L1020AnwarElSadat extends EntityType
{
    /** Default constructor */
    public L1020AnwarElSadat()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 33573, Amphibious Assault Ship
        setSubCategory((byte)1); // uid 33574, Mistral Class
        setSpecific((byte)2); // uid 33576, L 1020 Anwar El-Sadat
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L1020AnwarElSadat createInstance()
    {
            return new L1020AnwarElSadat();
    }
}
