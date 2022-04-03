// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.png.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_32BunaexL132Buna</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_32BunaexL132Buna.createInstance()</code> or <code>new _32BunaexL132Buna()</code>. </p>
 * <ul>
 *     <li> Country: Papua New Guinea (PNG) = <code>169</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: BalikpapanClass  = <code>1</code>; </li>
 *     <li> Specific: _32BunaexL132Buna  = <code>2</code>; </li>
 *     <li> Entity type uid: 31147; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6edcd0d8. </p>
 * @see Country#PAPUA_NEW_GUINEA_PNG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class _32BunaexL132Buna extends EntityType
{
    /** Default constructor */
    public _32BunaexL132Buna()
    {
        setCountry(Country.PAPUA_NEW_GUINEA_PNG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 31144, Landing Craft
        setSubCategory((byte)1); // uid 31145, Balikpapan Class
        setSpecific((byte)2); // uid 31147, 32 Buna (ex L 132 Buna)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _32BunaexL132Buna createInstance()
    {
            return new _32BunaexL132Buna();
    }
}
