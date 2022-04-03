// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_473KalaatBeniRached</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_473KalaatBeniRached.createInstance()</code> or <code>new _473KalaatBeniRached()</code>. </p>
 * <ul>
 *     <li> Country: Algeria (DZA) = <code>3</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank Landing Ship = <code>10</code>; </li>
 *     <li> SubCategory: KalaatBeniHammedClass  = <code>1</code>; </li>
 *     <li> Specific: _473KalaatBeniRached  = <code>2</code>; </li>
 *     <li> Entity type uid: 27056; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@cac736f. </p>
 * @see Country#ALGERIA_DZA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankLandingShip
 * @see SubCategory

 */
public final class _473KalaatBeniRached extends EntityType
{
    /** Default constructor */
    public _473KalaatBeniRached()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 27053, Tank Landing Ship
        setSubCategory((byte)1); // uid 27054, Kalaat Beni Hammed Class
        setSpecific((byte)2); // uid 27056, 473 Kalaat Beni Rached
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _473KalaatBeniRached createInstance()
    {
            return new _473KalaatBeniRached();
    }
}
