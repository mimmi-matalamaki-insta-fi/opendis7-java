// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.hrv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LightPatrolCraft</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LightPatrolCraft.createInstance()</code> or <code>new LightPatrolCraft()</code>. </p>
 * <ul>
 *     <li> Country: Croatia (HRV) = <code>249</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19332; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4310d43. </p>
 * @see Country#CROATIA_HRV
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft

 */
public final class LightPatrolCraft extends EntityType
{
    /** Default constructor */
    public LightPatrolCraft()
    {
        setCountry(Country.CROATIA_HRV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19332, Light/Patrol Craft
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LightPatrolCraft createInstance()
    {
            return new LightPatrolCraft();
    }
}
