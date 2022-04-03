// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RocketLoiteringAttackMunition</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RocketLoiteringAttackMunition.createInstance()</code> or <code>new RocketLoiteringAttackMunition()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: RocketLoiteringAttackMunition  = <code>10</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19551; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1da53f4f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class RocketLoiteringAttackMunition extends EntityType
{
    /** Default constructor */
    public RocketLoiteringAttackMunition()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 19519, Guided
        setSubCategory((byte)10); // uid 19551, Rocket, Loitering Attack Munition
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RocketLoiteringAttackMunition createInstance()
    {
            return new RocketLoiteringAttackMunition();
    }
}
