// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Mi8HipDairbornecommunications</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Mi8HipDairbornecommunications.createInstance()</code> or <code>new Mi8HipDairbornecommunications()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility helicopter = <code>21</code>; </li>
 *     <li> SubCategory: Mi8917171Hip  = <code>1</code>; </li>
 *     <li> Specific: Mi8HipDairbornecommunications  = <code>2</code>; </li>
 *     <li> Entity type uid: 13434; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@153cd6bb. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utilityhelicopter
 * @see SubCategory

 */
public final class Mi8HipDairbornecommunications extends EntityType
{
    /** Default constructor */
    public Mi8HipDairbornecommunications()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 13431, Utility helicopter
        setSubCategory((byte)1); // uid 13432, Mi-8/9/17/171 Hip
        setSpecific((byte)2); // uid 13434, Mi-8 Hip D (airborne communications)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Mi8HipDairbornecommunications createInstance()
    {
            return new Mi8HipDairbornecommunications();
    }
}
