// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MHC524AlFarouk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MHC524AlFarouk.createInstance()</code> or <code>new MHC524AlFarouk()</code>. </p>
 * <ul>
 *     <li> Country: Egypt (EGY) = <code>62</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: CoastalMinehunterClass  = <code>1</code>; </li>
 *     <li> Specific: MHC524AlFarouk  = <code>2</code>; </li>
 *     <li> Entity type uid: 26764; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@28dcca0c. </p>
 * @see Country#COMMENT_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class MHC524AlFarouk extends EntityType
{
    /** Default constructor */
    public MHC524AlFarouk()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 26761, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 26762, Coastal Minehunter Class
        setSpecific((byte)2); // uid 26764, MHC 524 Al Farouk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MHC524AlFarouk createInstance()
    {
            return new MHC524AlFarouk();
    }
}
