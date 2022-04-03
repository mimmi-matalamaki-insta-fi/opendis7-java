// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MSC691Shishijima</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MSC691Shishijima.createInstance()</code> or <code>new MSC691Shishijima()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: SugashimaClassMinesweeperCoastal  = <code>6</code>; </li>
 *     <li> Specific: MSC691Shishijima  = <code>11</code>; </li>
 *     <li> Entity type uid: 33663; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@10567255. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class MSC691Shishijima extends EntityType
{
    /** Default constructor */
    public MSC691Shishijima()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 18899, Mine Countermeasure Ship/Craft
        setSubCategory((byte)6); // uid 33652, Sugashima Class (Minesweeper, Coastal)
        setSpecific((byte)11); // uid 33663, MSC-691 Shishijima
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MSC691Shishijima createInstance()
    {
            return new MSC691Shishijima();
    }
}
