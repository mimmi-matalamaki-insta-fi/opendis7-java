// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PipaGotClassinshoreminesweeper</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PipaGotClassinshoreminesweeper.createInstance()</code> or <code>new PipaGotClassinshoreminesweeper()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: PipaGotClassinshoreminesweeper  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17792; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1e11bc55. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class PipaGotClassinshoreminesweeper extends EntityType
{
    /** Default constructor */
    public PipaGotClassinshoreminesweeper()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17789, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 17792, Pipa-Got Class (inshore minesweeper)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PipaGotClassinshoreminesweeper createInstance()
    {
            return new PipaGotClassinshoreminesweeper();
    }
}
