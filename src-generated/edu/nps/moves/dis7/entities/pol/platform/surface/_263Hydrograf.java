// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_263Hydrograf</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_263Hydrograf.createInstance()</code> or <code>new _263Hydrograf()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance Ship = <code>21</code>; </li>
 *     <li> SubCategory: NawigatorClassModifiedMomaProject863  = <code>1</code>; </li>
 *     <li> Specific: _263Hydrograf  = <code>2</code>; </li>
 *     <li> Entity type uid: 32570; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@44f3fe83. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceShip
 * @see SubCategory

 */
public final class _263Hydrograf extends EntityType
{
    /** Default constructor */
    public _263Hydrograf()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)21); // uid 32567, Surveillance Ship
        setSubCategory((byte)1); // uid 32568, Nawigator Class (Modified Moma Project 863)
        setSpecific((byte)2); // uid 32570, 263 Hydrograf
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _263Hydrograf createInstance()
    {
            return new _263Hydrograf();
    }
}
