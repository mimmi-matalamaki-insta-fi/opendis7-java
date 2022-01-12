// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Dolphin</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Dolphin.createInstance()</code> or <code>new Dolphin()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Mammal = <code>201</code>; </li>
 *     <li> SubCategory: Dolphin  = <code>50</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32273; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@97b5e6a. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Mammal
 * @see SubCategory

 */
public final class Dolphin extends EntityType
{
    /** Default constructor */
    public Dolphin()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)201); // uid 32270, Mammal
        setSubCategory((byte)50); // uid 32273, Dolphin
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Dolphin createInstance()
    {
            return new Dolphin();
    }
}
