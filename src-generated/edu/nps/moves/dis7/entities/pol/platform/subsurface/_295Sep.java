// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_295Sep</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_295Sep.createInstance()</code> or <code>new _295Sep()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: SokolClass  = <code>2</code>; </li>
 *     <li> Specific: _295Sep  = <code>2</code>; </li>
 *     <li> Entity type uid: 23042; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4f8b4bd0. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class _295Sep extends EntityType
{
    /** Default constructor */
    public _295Sep()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23037, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 23040, Sokol Class
        setSpecific((byte)2); // uid 23042, 295 Sep
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _295Sep createInstance()
    {
            return new _295Sep();
    }
}
