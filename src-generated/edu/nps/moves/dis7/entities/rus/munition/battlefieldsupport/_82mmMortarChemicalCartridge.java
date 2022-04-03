// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_82mmMortarChemicalCartridge</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_82mmMortarChemicalCartridge.createInstance()</code> or <code>new _82mmMortarChemicalCartridge()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _82mmmortar  = <code>10</code>; </li>
 *     <li> Specific: _82mmMortarChemicalCartridge  = <code>2</code>; </li>
 *     <li> Entity type uid: 27411; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2b1a901d. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _82mmMortarChemicalCartridge extends EntityType
{
    /** Default constructor */
    public _82mmMortarChemicalCartridge()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)10); // uid 20803, 82 mm (mortar)
        setSpecific((byte)2); // uid 27411, 82mm Mortar Chemical Cartridge
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _82mmMortarChemicalCartridge createInstance()
    {
            return new _82mmMortarChemicalCartridge();
    }
}
