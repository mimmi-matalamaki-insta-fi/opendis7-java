// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_725mmRPG22Netto</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_725mmRPG22Netto.createInstance()</code> or <code>new _725mmRPG22Netto()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Army = <code>11</code>; </li>
 *     <li> SubCategory: AntiTankRockets  = <code>45</code>; </li>
 *     <li> Specific: _725mmRPG22Netto  = <code>102</code>; </li>
 *     <li> Entity type uid: 32147; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@603f4e3e. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Army
 * @see SubCategory

 */
public final class _725mmRPG22Netto extends EntityType
{
    /** Default constructor */
    public _725mmRPG22Netto()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)45); // uid 32145, Anti-Tank Rockets
        setSpecific((byte)102); // uid 32147, 72.5mm RPG-22 Netto
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _725mmRPG22Netto createInstance()
    {
            return new _725mmRPG22Netto();
    }
}
