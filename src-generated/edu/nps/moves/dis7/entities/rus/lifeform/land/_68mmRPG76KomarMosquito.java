// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_68mmRPG76KomarMosquito</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_68mmRPG76KomarMosquito.createInstance()</code> or <code>new _68mmRPG76KomarMosquito()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Army = <code>11</code>; </li>
 *     <li> SubCategory: AntiTankRockets  = <code>45</code>; </li>
 *     <li> Specific: _68mmRPG76KomarMosquito  = <code>120</code>; </li>
 *     <li> Entity type uid: 32155; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d593b56. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Army
 * @see SubCategory

 */
public final class _68mmRPG76KomarMosquito extends EntityType
{
    /** Default constructor */
    public _68mmRPG76KomarMosquito()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)45); // uid 32145, Anti-Tank Rockets
        setSpecific((byte)120); // uid 32155, 68mm RPG-76 Komar (Mosquito)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _68mmRPG76KomarMosquito createInstance()
    {
            return new _68mmRPG76KomarMosquito();
    }
}
