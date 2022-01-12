// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CartridgeAFV90mmHEATTEngequimica</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CartridgeAFV90mmHEATTEngequimica.createInstance()</code> or <code>new CartridgeAFV90mmHEATTEngequimica()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _90mm  = <code>1</code>; </li>
 *     <li> Specific: CartridgeAFV90mmHEATTEngequimica  = <code>3</code>; </li>
 *     <li> Entity type uid: 26956; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3dfd7eaa. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class CartridgeAFV90mmHEATTEngequimica extends EntityType
{
    /** Default constructor */
    public CartridgeAFV90mmHEATTEngequimica()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 26952, Ballistic
        setSubCategory((byte)1); // uid 26953, 90mm
        setSpecific((byte)3); // uid 26956, Cartridge, AFV, 90mm, HEAT-T, Engequimica
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CartridgeAFV90mmHEATTEngequimica createInstance()
    {
            return new CartridgeAFV90mmHEATTEngequimica();
    }
}
