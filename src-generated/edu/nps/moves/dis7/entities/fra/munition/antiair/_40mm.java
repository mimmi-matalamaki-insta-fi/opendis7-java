// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_40mm</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_40mm.createInstance()</code> or <code>new _40mm()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _40mm  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29544; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6d0114c0. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _40mm extends EntityType
{
    /** Default constructor */
    public _40mm()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21048, Ballistic
        setSubCategory((byte)5); // uid 29544, 40mm
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _40mm createInstance()
    {
            return new _40mm();
    }
}
