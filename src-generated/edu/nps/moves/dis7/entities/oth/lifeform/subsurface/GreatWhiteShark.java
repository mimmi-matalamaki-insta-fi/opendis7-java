// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GreatWhiteShark</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GreatWhiteShark.createInstance()</code> or <code>new GreatWhiteShark()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Fish = <code>200</code>; </li>
 *     <li> SubCategory: GreatWhiteShark  = <code>151</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32268; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1530d0f2. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Fish
 * @see SubCategory

 */
public final class GreatWhiteShark extends EntityType
{
    /** Default constructor */
    public GreatWhiteShark()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)200); // uid 32263, Fish
        setSubCategory((byte)151); // uid 32268, Great White Shark
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GreatWhiteShark createInstance()
    {
            return new GreatWhiteShark();
    }
}
