// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S90Torbay</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S90Torbay.createInstance()</code> or <code>new S90Torbay()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSN (Nuclear Attack-Torpedo) = <code>3</code>; </li>
 *     <li> SubCategory: TrafalgarClass  = <code>1</code>; </li>
 *     <li> Specific: S90Torbay  = <code>3</code>; </li>
 *     <li> Entity type uid: 15601; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a3ed300. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSNNuclearAttackTorpedo
 * @see SubCategory

 */
public final class S90Torbay extends EntityType
{
    /** Default constructor */
    public S90Torbay()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 15597, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)1); // uid 15598, Trafalgar Class
        setSpecific((byte)3); // uid 15601, S 90 Torbay
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S90Torbay createInstance()
    {
            return new S90Torbay();
    }
}
