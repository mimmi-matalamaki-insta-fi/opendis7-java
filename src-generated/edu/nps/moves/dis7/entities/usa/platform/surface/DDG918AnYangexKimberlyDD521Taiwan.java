// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DDG918AnYangexKimberlyDD521Taiwan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DDG918AnYangexKimberlyDD521Taiwan.createInstance()</code> or <code>new DDG918AnYangexKimberlyDD521Taiwan()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: FletcherandAllenMSummerClass  = <code>6</code>; </li>
 *     <li> Specific: DDG918AnYangexKimberlyDD521Taiwan  = <code>6</code>; </li>
 *     <li> Entity type uid: 11449; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@28a6e171. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyer
 * @see SubCategory

 */
public final class DDG918AnYangexKimberlyDD521Taiwan extends EntityType
{
    /** Default constructor */
    public DDG918AnYangexKimberlyDD521Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 11372, Guided Missile Destroyer
        setSubCategory((byte)6); // uid 11443, Fletcher and Allen M Summer Class
        setSpecific((byte)6); // uid 11449, DDG 918 An Yang (ex. Kimberly DD 521) (Taiwan)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DDG918AnYangexKimberlyDD521Taiwan createInstance()
    {
            return new DDG918AnYangexKimberlyDD521Taiwan();
    }
}
