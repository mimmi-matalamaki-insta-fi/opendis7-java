// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_122mmH462ChemicalHLFill</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_122mmH462ChemicalHLFill.createInstance()</code> or <code>new _122mmH462ChemicalHLFill()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _122mm  = <code>14</code>; </li>
 *     <li> Specific: _122mmH462ChemicalHLFill  = <code>13</code>; </li>
 *     <li> Entity type uid: 27447; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f9b8129. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _122mmH462ChemicalHLFill extends EntityType
{
    /** Default constructor */
    public _122mmH462ChemicalHLFill()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)14); // uid 20819, 122 mm
        setSpecific((byte)13); // uid 27447, 122mm H-462, Chemical, HL Fill
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _122mmH462ChemicalHLFill createInstance()
    {
            return new _122mmH462ChemicalHLFill();
    }
}
