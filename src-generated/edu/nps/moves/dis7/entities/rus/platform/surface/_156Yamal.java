// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_156Yamal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_156Yamal.createInstance()</code> or <code>new _156Yamal()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank landing ship = <code>10</code>; </li>
 *     <li> SubCategory: RopuchaClassProject775  = <code>1</code>; </li>
 *     <li> Specific: _156Yamal  = <code>16</code>; </li>
 *     <li> Entity type uid: 27083; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3d278b4d. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tanklandingship
 * @see SubCategory

 */
public final class _156Yamal extends EntityType
{
    /** Default constructor */
    public _156Yamal()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 13758, Tank landing ship
        setSubCategory((byte)1); // uid 13759, Ropucha Class (Project 775)
        setSpecific((byte)16); // uid 27083, 156 Yamal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _156Yamal createInstance()
    {
            return new _156Yamal();
    }
}
