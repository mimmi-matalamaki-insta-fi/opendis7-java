// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DDG103Truxtun</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DDG103Truxtun.createInstance()</code> or <code>new DDG103Truxtun()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: ArleighBurkeClass  = <code>1</code>; </li>
 *     <li> Specific: DDG103Truxtun  = <code>53</code>; </li>
 *     <li> Entity type uid: 11426; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5fdd97c1. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyer
 * @see SubCategory

 */
public final class DDG103Truxtun extends EntityType
{
    /** Default constructor */
    public DDG103Truxtun()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 11372, Guided Missile Destroyer
        setSubCategory((byte)1); // uid 11373, Arleigh Burke Class
        setSpecific((byte)53); // uid 11426, DDG 103 Truxtun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DDG103Truxtun createInstance()
    {
            return new DDG103Truxtun();
    }
}
