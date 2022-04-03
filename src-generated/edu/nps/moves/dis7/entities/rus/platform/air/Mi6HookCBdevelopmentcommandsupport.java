// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Mi6HookCBdevelopmentcommandsupport</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Mi6HookCBdevelopmentcommandsupport.createInstance()</code> or <code>new Mi6HookCBdevelopmentcommandsupport()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility helicopter = <code>21</code>; </li>
 *     <li> SubCategory: Mi6Hook  = <code>4</code>; </li>
 *     <li> Specific: Mi6HookCBdevelopmentcommandsupport  = <code>3</code>; </li>
 *     <li> Entity type uid: 13457; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37b57b54. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utilityhelicopter
 * @see SubCategory

 */
public final class Mi6HookCBdevelopmentcommandsupport extends EntityType
{
    /** Default constructor */
    public Mi6HookCBdevelopmentcommandsupport()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 13431, Utility helicopter
        setSubCategory((byte)4); // uid 13454, Mi-6 Hook
        setSpecific((byte)3); // uid 13457, Mi-6 Hook C ('B' development, command support)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Mi6HookCBdevelopmentcommandsupport createInstance()
    {
            return new Mi6HookCBdevelopmentcommandsupport();
    }
}
