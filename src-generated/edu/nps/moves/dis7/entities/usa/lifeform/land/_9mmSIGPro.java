// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_9mmSIGPro</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_9mmSIGPro.createInstance()</code> or <code>new _9mmSIGPro()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: U.S. Army (USA) = <code>11</code>; </li>
 *     <li> SubCategory: HandGuns  = <code>80</code>; </li>
 *     <li> Specific: _9mmSIGPro  = <code>38</code>; </li>
 *     <li> Entity type uid: 35025; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@41bd6a0f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see USArmyUSA
 * @see SubCategory

 */
public final class _9mmSIGPro extends EntityType
{
    /** Default constructor */
    public _9mmSIGPro()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32666, U.S. Army (USA)
        setSubCategory((byte)80); // uid 32700, Hand Guns
        setSpecific((byte)38); // uid 35025, 9mm SIG Pro
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _9mmSIGPro createInstance()
    {
            return new _9mmSIGPro();
    }
}
