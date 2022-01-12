// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_37x252SRHVAPBR167P</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_37x252SRHVAPBR167P.createInstance()</code> or <code>new _37x252SRHVAPBR167P()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _37mm  = <code>12</code>; </li>
 *     <li> Specific: _37x252SRHVAPBR167P  = <code>4</code>; </li>
 *     <li> Entity type uid: 27410; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12365bd8. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _37x252SRHVAPBR167P extends EntityType
{
    /** Default constructor */
    public _37x252SRHVAPBR167P()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 20393, Ballistic
        setSubCategory((byte)12); // uid 20419, 37 mm
        setSpecific((byte)4); // uid 27410, 37x252SR HVAP BR-167P
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _37x252SRHVAPBR167P createInstance()
    {
            return new _37x252SRHVAPBR167P();
    }
}
