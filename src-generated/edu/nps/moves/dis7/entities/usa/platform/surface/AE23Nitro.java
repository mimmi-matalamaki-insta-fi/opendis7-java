// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AE23Nitro</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AE23Nitro.createInstance()</code> or <code>new AE23Nitro()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Ammunition Ship = <code>57</code>; </li>
 *     <li> SubCategory: SuribachiClass  = <code>2</code>; </li>
 *     <li> Specific: AE23Nitro  = <code>3</code>; </li>
 *     <li> Entity type uid: 12032; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@611c3eae. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmmunitionShip
 * @see SubCategory

 */
public final class AE23Nitro extends EntityType
{
    /** Default constructor */
    public AE23Nitro()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)57); // uid 12019, Ammunition Ship
        setSubCategory((byte)2); // uid 12029, Suribachi Class
        setSpecific((byte)3); // uid 12032, AE 23 Nitro
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AE23Nitro createInstance()
    {
            return new AE23Nitro();
    }
}
