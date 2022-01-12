// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_511AlSiddiq</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_511AlSiddiq.createInstance()</code> or <code>new _511AlSiddiq()</code>. </p>
 * <ul>
 *     <li> Country: Saudi Arabia (SAU) = <code>189</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: AlSiddiqfastattackcraftmissile  = <code>4</code>; </li>
 *     <li> Specific: _511AlSiddiq  = <code>1</code>; </li>
 *     <li> Entity type uid: 17870; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7724704f. </p>
 * @see Country#SAUDI_ARABIA_SAU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _511AlSiddiq extends EntityType
{
    /** Default constructor */
    public _511AlSiddiq()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17862, Light/Patrol Craft
        setSubCategory((byte)4); // uid 17869, Al Siddiq (fast attack craft-missile)
        setSpecific((byte)1); // uid 17870, 511 Al Siddiq
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _511AlSiddiq createInstance()
    {
            return new _511AlSiddiq();
    }
}
