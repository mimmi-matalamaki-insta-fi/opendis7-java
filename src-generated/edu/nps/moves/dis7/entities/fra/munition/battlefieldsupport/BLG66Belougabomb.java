// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BLG66Belougabomb</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BLG66Belougabomb.createInstance()</code> or <code>new BLG66Belougabomb()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: BLG66Belougabomb  = <code>51</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 21176; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1883871b. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class BLG66Belougabomb extends EntityType
{
    /** Default constructor */
    public BLG66Belougabomb()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21159, Ballistic
        setSubCategory((byte)51); // uid 21176, BLG 66 Belouga bomb
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BLG66Belougabomb createInstance()
    {
            return new BLG66Belougabomb();
    }
}
