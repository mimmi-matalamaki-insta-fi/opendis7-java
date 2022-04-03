// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_82mmmodel0832DUHEfragmentationbomb</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_82mmmodel0832DUHEfragmentationbomb.createInstance()</code> or <code>new _82mmmodel0832DUHEfragmentationbomb()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _82mmmortar  = <code>10</code>; </li>
 *     <li> Specific: _82mmmodel0832DUHEfragmentationbomb  = <code>1</code>; </li>
 *     <li> Entity type uid: 20804; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1a7d0c9f. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _82mmmodel0832DUHEfragmentationbomb extends EntityType
{
    /** Default constructor */
    public _82mmmodel0832DUHEfragmentationbomb()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)10); // uid 20803, 82 mm (mortar)
        setSpecific((byte)1); // uid 20804, 82-mm model 0-832 DU HE fragmentation bomb
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _82mmmodel0832DUHEfragmentationbomb createInstance()
    {
            return new _82mmmodel0832DUHEfragmentationbomb();
    }
}
