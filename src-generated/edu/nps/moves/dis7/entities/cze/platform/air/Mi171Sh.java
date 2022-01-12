// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.cze.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Mi171Sh</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Mi171Sh.createInstance()</code> or <code>new Mi171Sh()</code>. </p>
 * <ul>
 *     <li> Country: Czech Republic (CZE) = <code>267</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility Helicopter = <code>21</code>; </li>
 *     <li> SubCategory: Mi171Sh  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30095; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@58ea606c. </p>
 * @see Country#CZECH_REPUBLIC_CZE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityHelicopter
 * @see SubCategory

 */
public final class Mi171Sh extends EntityType
{
    /** Default constructor */
    public Mi171Sh()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 30094, Utility Helicopter
        setSubCategory((byte)1); // uid 30095, Mi-171Sh
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Mi171Sh createInstance()
    {
            return new Mi171Sh();
    }
}
