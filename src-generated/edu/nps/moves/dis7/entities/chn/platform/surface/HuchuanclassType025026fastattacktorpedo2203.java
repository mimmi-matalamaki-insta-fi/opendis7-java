// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HuchuanclassType025026fastattacktorpedo2203</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HuchuanclassType025026fastattacktorpedo2203.createInstance()</code> or <code>new HuchuanclassType025026fastattacktorpedo2203()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Hydrofoil = <code>14</code>; </li>
 *     <li> SubCategory: HuchuanclassType025026fastattacktorpedo  = <code>1</code>; </li>
 *     <li> Specific: _2203  = <code>6</code>; </li>
 *     <li> Entity type uid: 17223; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@694abbdc. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Hydrofoil
 * @see SubCategory

 */
public final class HuchuanclassType025026fastattacktorpedo2203 extends EntityType
{
    /** Default constructor */
    public HuchuanclassType025026fastattacktorpedo2203()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 17216, Hydrofoil
        setSubCategory((byte)1); // uid 17217, Huchuan class Type 025/026 (fast attack-torpedo)
        setSpecific((byte)6); // uid 17223, 2203
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HuchuanclassType025026fastattacktorpedo2203 createInstance()
    {
            return new HuchuanclassType025026fastattacktorpedo2203();
    }
}
