// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A530504APM21TrM17</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A530504APM21TrM17.createInstance()</code> or <code>new A530504APM21TrM17()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _127mm  = <code>20</code>; </li>
 *     <li> Specific: A530504APM21TrM17  = <code>11</code>; </li>
 *     <li> Entity type uid: 20142; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ccfac29. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class A530504APM21TrM17 extends EntityType
{
    /** Default constructor */
    public A530504APM21TrM17()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)20); // uid 20131, 12.7 mm
        setSpecific((byte)11); // uid 20142, A530 .50 4 AP M2/1 Tr M17
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A530504APM21TrM17 createInstance()
    {
            return new A530504APM21TrM17();
    }
}
