// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ury.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_23Maldonado</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_23Maldonado.createInstance()</code> or <code>new _23Maldonado()</code>. </p>
 * <ul>
 *     <li> Country: Uruguay (URY) = <code>226</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: WangeroogeClassType722Type754  = <code>2</code>; </li>
 *     <li> Specific: _23Maldonado  = <code>1</code>; </li>
 *     <li> Entity type uid: 27532; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d4a05f7. </p>
 * @see Country#URUGUAY_URY
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class _23Maldonado extends EntityType
{
    /** Default constructor */
    public _23Maldonado()
    {
        setCountry(Country.URUGUAY_URY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27490, Auxiliary
        setSubCategory((byte)2); // uid 27531, Wangerooge Class (Type 722, Type 754)
        setSpecific((byte)1); // uid 27532, 23 Maldonado
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _23Maldonado createInstance()
    {
            return new _23Maldonado();
    }
}
