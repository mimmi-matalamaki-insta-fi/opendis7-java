// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_83Unity</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_83Unity.createInstance()</code> or <code>new _83Unity()</code>. </p>
 * <ul>
 *     <li> Country: Singapore (SGP) = <code>193</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: FearlessClass  = <code>1</code>; </li>
 *     <li> Specific: _83Unity  = <code>2</code>; </li>
 *     <li> Entity type uid: 32104; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65d8dff8. </p>
 * @see Country#SINGAPORE_SGP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _83Unity extends EntityType
{
    /** Default constructor */
    public _83Unity()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 32101, Light/Patrol Craft
        setSubCategory((byte)1); // uid 32102, Fearless Class
        setSpecific((byte)2); // uid 32104, 83 Unity
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _83Unity createInstance()
    {
            return new _83Unity();
    }
}
