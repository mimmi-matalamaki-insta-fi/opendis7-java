// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FA18ESuperHornet</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FA18ESuperHornet.createInstance()</code> or <code>new FA18ESuperHornet()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: McDonnellDouglasFA18Hornet  = <code>9</code>; </li>
 *     <li> Specific: FA18ESuperHornet  = <code>10</code>; </li>
 *     <li> Entity type uid: 10808; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b24ea2a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class FA18ESuperHornet extends EntityType
{
    /** Default constructor */
    public FA18ESuperHornet()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 10755, Fighter/Air Defense
        setSubCategory((byte)9); // uid 10798, McDonnell-Douglas F/A-18 Hornet
        setSpecific((byte)10); // uid 10808, F/A-18E Super Hornet
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FA18ESuperHornet createInstance()
    {
            return new FA18ESuperHornet();
    }
}
