// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SmokePotDM11</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SmokePotDM11.createInstance()</code> or <code>new SmokePotDM11()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Fixed = <code>3</code>; </li>
 *     <li> SubCategory: SmokePotsandBarrels  = <code>1</code>; </li>
 *     <li> Specific: SmokePotDM11  = <code>5</code>; </li>
 *     <li> Entity type uid: 25062; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@d76099a. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Fixed
 * @see SubCategory

 */
public final class SmokePotDM11 extends EntityType
{
    /** Default constructor */
    public SmokePotDM11()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)3); // uid 25056, Fixed
        setSubCategory((byte)1); // uid 25057, Smoke Pots and Barrels
        setSpecific((byte)5); // uid 25062, Smoke Pot, DM-11
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SmokePotDM11 createInstance()
    {
            return new SmokePotDM11();
    }
}
