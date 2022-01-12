// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Han402</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Han402.createInstance()</code> or <code>new Han402()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSN (Nuclear Attack - Torpedo) = <code>3</code>; </li>
 *     <li> SubCategory: HanClassType091  = <code>1</code>; </li>
 *     <li> Specific: Han402  = <code>2</code>; </li>
 *     <li> Entity type uid: 17447; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@8297b3a. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSNNuclearAttackTorpedo
 * @see SubCategory

 */
public final class Han402 extends EntityType
{
    /** Default constructor */
    public Han402()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 17444, SSN (Nuclear Attack - Torpedo)
        setSubCategory((byte)1); // uid 17445, Han Class (Type 091)
        setSpecific((byte)2); // uid 17447, Han 402
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Han402 createInstance()
    {
            return new Han402();
    }
}
