// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LPD14Trenton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LPD14Trenton.createInstance()</code> or <code>new LPD14Trenton()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Transport Dock = <code>56</code>; </li>
 *     <li> SubCategory: AustinClass  = <code>1</code>; </li>
 *     <li> Specific: LPD14Trenton  = <code>10</code>; </li>
 *     <li> Entity type uid: 12011; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d1bdd4a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousTransportDock
 * @see SubCategory

 */
public final class LPD14Trenton extends EntityType
{
    /** Default constructor */
    public LPD14Trenton()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 12000, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 12001, Austin Class
        setSpecific((byte)10); // uid 12011, LPD 14 Trenton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LPD14Trenton createInstance()
    {
            return new LPD14Trenton();
    }
}
