// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HEFrag12</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HEFrag12.createInstance()</code> or <code>new HEFrag12()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: RocketASTROS  = <code>1</code>; </li>
 *     <li> Specific: _300mmSS60  = <code>3</code>; </li>
 *     <li> Entity type uid: 21790; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6ed18d80. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class HEFrag12 extends EntityType
{
    /** Default constructor */
    public HEFrag12()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21778, Ballistic
        setSubCategory((byte)1); // uid 21779, Rocket ASTROS
        setSpecific((byte)3); // uid 21789, 300 mm SS-60
        setExtra((byte)1); // uid 21790, HE Frag
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HEFrag12 createInstance()
    {
            return new HEFrag12();
    }
}
