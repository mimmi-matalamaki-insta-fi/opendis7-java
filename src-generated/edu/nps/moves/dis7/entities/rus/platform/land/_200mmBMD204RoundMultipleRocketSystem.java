// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_200mmBMD204RoundMultipleRocketSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_200mmBMD204RoundMultipleRocketSystem.createInstance()</code> or <code>new _200mmBMD204RoundMultipleRocketSystem()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: _200mmBMD204RoundMultipleRocketSystem  = <code>31</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 12784; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3ac04654. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class _200mmBMD204RoundMultipleRocketSystem extends EntityType
{
    /** Default constructor */
    public _200mmBMD204RoundMultipleRocketSystem()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 12745, Self-Propelled Artillery
        setSubCategory((byte)31); // uid 12784, 200-mm BMD-20 4-Round Multiple Rocket System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _200mmBMD204RoundMultipleRocketSystem createInstance()
    {
            return new _200mmBMD204RoundMultipleRocketSystem();
    }
}
