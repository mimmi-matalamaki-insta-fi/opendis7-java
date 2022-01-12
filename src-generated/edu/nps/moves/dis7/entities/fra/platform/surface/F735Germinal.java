// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F735Germinal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F735Germinal.createInstance()</code> or <code>new F735Germinal()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: Florealclasspatrolfrigates  = <code>2</code>; </li>
 *     <li> Specific: F735Germinal  = <code>6</code>; </li>
 *     <li> Entity type uid: 15961; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45385f75. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileFrigate
 * @see SubCategory

 */
public final class F735Germinal extends EntityType
{
    /** Default constructor */
    public F735Germinal()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 15950, Guided-missile Frigate
        setSubCategory((byte)2); // uid 15955, Floreal class (patrol frigates)
        setSpecific((byte)6); // uid 15961, F 735 Germinal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F735Germinal createInstance()
    {
            return new F735Germinal();
    }
}
