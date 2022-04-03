// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.png.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_33LakekamuexL128Labuan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_33LakekamuexL128Labuan.createInstance()</code> or <code>new _33LakekamuexL128Labuan()</code>. </p>
 * <ul>
 *     <li> Country: Papua New Guinea (PNG) = <code>169</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: BalikpapanClass  = <code>1</code>; </li>
 *     <li> Specific: _33LakekamuexL128Labuan  = <code>3</code>; </li>
 *     <li> Entity type uid: 31148; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6136998b. </p>
 * @see Country#PAPUA_NEW_GUINEA_PNG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class _33LakekamuexL128Labuan extends EntityType
{
    /** Default constructor */
    public _33LakekamuexL128Labuan()
    {
        setCountry(Country.PAPUA_NEW_GUINEA_PNG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 31144, Landing Craft
        setSubCategory((byte)1); // uid 31145, Balikpapan Class
        setSpecific((byte)3); // uid 31148, 33 Lakekamu (ex L 128 Labuan)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _33LakekamuexL128Labuan createInstance()
    {
            return new _33LakekamuexL128Labuan();
    }
}
