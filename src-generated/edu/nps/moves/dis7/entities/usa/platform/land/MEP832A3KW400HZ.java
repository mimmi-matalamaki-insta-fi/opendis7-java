// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MEP832A3KW400HZ</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MEP832A3KW400HZ.createInstance()</code> or <code>new MEP832A3KW400HZ()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Generator trailer = <code>16</code>; </li>
 *     <li> SubCategory: _0100kW  = <code>1</code>; </li>
 *     <li> Specific: MEP832A3KW400HZ  = <code>38</code>; </li>
 *     <li> Entity type uid: 34923; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58dad04a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Generatortrailer
 * @see SubCategory

 */
public final class MEP832A3KW400HZ extends EntityType
{
    /** Default constructor */
    public MEP832A3KW400HZ()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)16); // uid 10630, Generator trailer
        setSubCategory((byte)1); // uid 10631, 0 - 100 kW
        setSpecific((byte)38); // uid 34923, MEP 832A, 3KW, 400HZ
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MEP832A3KW400HZ createInstance()
    {
            return new MEP832A3KW400HZ();
    }
}
