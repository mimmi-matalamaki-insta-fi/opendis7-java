// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_45CalM1911</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_45CalM1911.createInstance()</code> or <code>new _45CalM1911()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: U.S. Army (USA) = <code>11</code>; </li>
 *     <li> SubCategory: HandGuns  = <code>80</code>; </li>
 *     <li> Specific: _45CalM1911  = <code>41</code>; </li>
 *     <li> Entity type uid: 35026; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1ae9d0e4. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see USArmyUSA
 * @see SubCategory

 */
public final class _45CalM1911 extends EntityType
{
    /** Default constructor */
    public _45CalM1911()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32666, U.S. Army (USA)
        setSubCategory((byte)80); // uid 32700, Hand Guns
        setSpecific((byte)41); // uid 35026, .45 Cal M1911
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _45CalM1911 createInstance()
    {
            return new _45CalM1911();
    }
}
