// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CartridgeRecoillessRifle106mmHEPTM346A1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CartridgeRecoillessRifle106mmHEPTM346A1.createInstance()</code> or <code>new CartridgeRecoillessRifle106mmHEPTM346A1()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _106mmRCL40M40  = <code>11</code>; </li>
 *     <li> Specific: CartridgeRecoillessRifle106mmHEPTM346A1  = <code>3</code>; </li>
 *     <li> Entity type uid: 23965; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@39acd1f1. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class CartridgeRecoillessRifle106mmHEPTM346A1 extends EntityType
{
    /** Default constructor */
    public CartridgeRecoillessRifle106mmHEPTM346A1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 19553, Ballistic
        setSubCategory((byte)11); // uid 19617, 106 mm RCL40 (M40)
        setSpecific((byte)3); // uid 23965, Cartridge, Recoilless Rifle, 106mm, HEP-T, M346A1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CartridgeRecoillessRifle106mmHEPTM346A1 createInstance()
    {
            return new CartridgeRecoillessRifle106mmHEPTM346A1();
    }
}
