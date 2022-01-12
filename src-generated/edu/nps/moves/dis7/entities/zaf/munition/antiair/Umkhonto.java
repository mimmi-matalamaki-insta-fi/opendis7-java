// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.zaf.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Umkhonto</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Umkhonto.createInstance()</code> or <code>new Umkhonto()</code>. </p>
 * <ul>
 *     <li> Country: South Africa (ZAF) = <code>197</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Umkhonto  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29556; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@69f9b561. </p>
 * @see Country#SOUTH_AFRICA_ZAF
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Umkhonto extends EntityType
{
    /** Default constructor */
    public Umkhonto()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 28982, Guided
        setSubCategory((byte)2); // uid 29556, Umkhonto
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Umkhonto createInstance()
    {
            return new Umkhonto();
    }
}
