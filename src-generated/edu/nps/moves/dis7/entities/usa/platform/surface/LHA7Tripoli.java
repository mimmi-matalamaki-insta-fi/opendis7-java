// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LHA7Tripoli</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LHA7Tripoli.createInstance()</code> or <code>new LHA7Tripoli()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Assault Ship = <code>54</code>; </li>
 *     <li> SubCategory: AmericaClass  = <code>5</code>; </li>
 *     <li> Specific: LHA7Tripoli  = <code>2</code>; </li>
 *     <li> Entity type uid: 34040; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@687eb455. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousAssaultShip
 * @see SubCategory

 */
public final class LHA7Tripoli extends EntityType
{
    /** Default constructor */
    public LHA7Tripoli()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 11968, Amphibious Assault Ship
        setSubCategory((byte)5); // uid 26435, America Class
        setSpecific((byte)2); // uid 34040, LHA 7 Tripoli
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LHA7Tripoli createInstance()
    {
            return new LHA7Tripoli();
    }
}
