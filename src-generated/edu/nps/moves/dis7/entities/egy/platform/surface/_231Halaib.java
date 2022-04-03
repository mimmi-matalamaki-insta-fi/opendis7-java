// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_231Halaib</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_231Halaib.createInstance()</code> or <code>new _231Halaib()</code>. </p>
 * <ul>
 *     <li> Country: Egypt (EGY) = <code>62</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: WesterwaldClassType760AmmunitionTransports  = <code>2</code>; </li>
 *     <li> Specific: _231Halaib  = <code>1</code>; </li>
 *     <li> Entity type uid: 27499; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a59ca5e. </p>
 * @see Country#COMMENT_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class _231Halaib extends EntityType
{
    /** Default constructor */
    public _231Halaib()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27493, Auxiliary
        setSubCategory((byte)2); // uid 27498, Westerwald Class (Type 760, Ammunition, Transports)
        setSpecific((byte)1); // uid 27499, 231 Halaib
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _231Halaib createInstance()
    {
            return new _231Halaib();
    }
}
