// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.yem.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_142Ramadan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_142Ramadan.createInstance()</code> or <code>new _142Ramadan()</code>. </p>
 * <ul>
 *     <li> Country: Yemen (YEM) = <code>237</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: BroadswordClasscoastalpatrolcraft  = <code>1</code>; </li>
 *     <li> Specific: _142Ramadan  = <code>2</code>; </li>
 *     <li> Entity type uid: 18741; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3babcaed. </p>
 * @see Country#YEMEN_YEM
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _142Ramadan extends EntityType
{
    /** Default constructor */
    public _142Ramadan()
    {
        setCountry(Country.YEMEN_YEM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18738, Light/Patrol Craft
        setSubCategory((byte)1); // uid 18739, Broadsword Class (coastal patrol craft)
        setSpecific((byte)2); // uid 18741, 142 Ramadan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _142Ramadan createInstance()
    {
            return new _142Ramadan();
    }
}
