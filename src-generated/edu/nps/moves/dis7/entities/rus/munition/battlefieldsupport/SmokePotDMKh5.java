// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SmokePotDMKh5</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SmokePotDMKh5.createInstance()</code> or <code>new SmokePotDMKh5()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Fixed = <code>3</code>; </li>
 *     <li> SubCategory: SmokePotsandBarrels  = <code>1</code>; </li>
 *     <li> Specific: SmokePotDMKh5  = <code>6</code>; </li>
 *     <li> Entity type uid: 25063; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e1add6f. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Fixed
 * @see SubCategory

 */
public final class SmokePotDMKh5 extends EntityType
{
    /** Default constructor */
    public SmokePotDMKh5()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)3); // uid 25056, Fixed
        setSubCategory((byte)1); // uid 25057, Smoke Pots and Barrels
        setSpecific((byte)6); // uid 25063, Smoke Pot, DMKh-5
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SmokePotDMKh5 createInstance()
    {
            return new SmokePotDMKh5();
    }
}
