// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SABOT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SABOT.createInstance()</code> or <code>new SABOT()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _120mm  = <code>5</code>; </li>
 *     <li> Specific: SABOT  = <code>4</code>; </li>
 *     <li> Entity type uid: 21266; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5773d271. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class SABOT extends EntityType
{
    /** Default constructor */
    public SABOT()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21257, Ballistic
        setSubCategory((byte)5); // uid 21262, 120 mm
        setSpecific((byte)4); // uid 21266, SABOT
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SABOT createInstance()
    {
            return new SABOT();
    }
}
