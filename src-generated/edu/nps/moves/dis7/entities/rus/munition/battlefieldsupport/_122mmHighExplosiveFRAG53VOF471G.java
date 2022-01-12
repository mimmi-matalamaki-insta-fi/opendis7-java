// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_122mmHighExplosiveFRAG53VOF471G</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_122mmHighExplosiveFRAG53VOF471G.createInstance()</code> or <code>new _122mmHighExplosiveFRAG53VOF471G()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _122mm  = <code>14</code>; </li>
 *     <li> Specific: _122mmHighExplosiveFRAG53VOF471G  = <code>2</code>; </li>
 *     <li> Entity type uid: 20821; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@205159dc. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _122mmHighExplosiveFRAG53VOF471G extends EntityType
{
    /** Default constructor */
    public _122mmHighExplosiveFRAG53VOF471G()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)14); // uid 20819, 122 mm
        setSpecific((byte)2); // uid 20821, 122mm, High Explosive - FRAG, 53-VOF-471G
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _122mmHighExplosiveFRAG53VOF471G createInstance()
    {
            return new _122mmHighExplosiveFRAG53VOF471G();
    }
}
