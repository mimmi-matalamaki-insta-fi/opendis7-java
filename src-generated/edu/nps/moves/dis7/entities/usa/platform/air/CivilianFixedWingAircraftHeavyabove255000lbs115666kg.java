// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CivilianFixedWingAircraftHeavyabove255000lbs115666kg</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CivilianFixedWingAircraftHeavyabove255000lbs115666kg.createInstance()</code> or <code>new CivilianFixedWingAircraftHeavyabove255000lbs115666kg()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Heavy (above 255,000 lbs / 115,666 kg) = <code>88</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23813; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@24876a7e. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftHeavyabove255000lbs115666kg

 */
public final class CivilianFixedWingAircraftHeavyabove255000lbs115666kg extends EntityType
{
    /** Default constructor */
    public CivilianFixedWingAircraftHeavyabove255000lbs115666kg()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)88); // uid 23813, Civilian Fixed Wing Aircraft, Heavy (above 255,000 lbs / 115,666 kg)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CivilianFixedWingAircraftHeavyabove255000lbs115666kg createInstance()
    {
            return new CivilianFixedWingAircraftHeavyabove255000lbs115666kg();
    }
}
