// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Atlantis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Atlantis.createInstance()</code> or <code>new Atlantis()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Manned = <code>1</code>; </li>
 *     <li> SubCategory: SpaceShuttleOrbiter  = <code>1</code>; </li>
 *     <li> Specific: Atlantis  = <code>1</code>; </li>
 *     <li> Entity type uid: 12424; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@22da200e. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Manned
 * @see SubCategory

 */
public final class Atlantis extends EntityType
{
    /** Default constructor */
    public Atlantis()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 12422, Manned
        setSubCategory((byte)1); // uid 12423, Space Shuttle Orbiter
        setSpecific((byte)1); // uid 12424, Atlantis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Atlantis createInstance()
    {
            return new Atlantis();
    }
}
