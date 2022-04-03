// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_72mm9K36Strela3SA14</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_72mm9K36Strela3SA14.createInstance()</code> or <code>new _72mm9K36Strela3SA14()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Army = <code>11</code>; </li>
 *     <li> SubCategory: ManPortableAirDefenseSystemMANPADS  = <code>85</code>; </li>
 *     <li> Specific: _72mm9K36Strela3SA14  = <code>21</code>; </li>
 *     <li> Entity type uid: 32171; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7976e536. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Army
 * @see SubCategory

 */
public final class _72mm9K36Strela3SA14 extends EntityType
{
    /** Default constructor */
    public _72mm9K36Strela3SA14()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)85); // uid 32169, Man-Portable Air Defense System (MANPADS)
        setSpecific((byte)21); // uid 32171, 72mm 9K36 Strela-3 (SA-14)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _72mm9K36Strela3SA14 createInstance()
    {
            return new _72mm9K36Strela3SA14();
    }
}
