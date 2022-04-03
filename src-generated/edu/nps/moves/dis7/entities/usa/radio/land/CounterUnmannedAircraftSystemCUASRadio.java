// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CounterUnmannedAircraftSystemCUASRadio</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CounterUnmannedAircraftSystemCUASRadio.createInstance()</code> or <code>new CounterUnmannedAircraftSystemCUASRadio()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Counter Unmanned Aircraft System (C-UAS) Radio = <code>41</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31309; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@498b611e. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CounterUnmannedAircraftSystemCUASRadio

 */
public final class CounterUnmannedAircraftSystemCUASRadio extends EntityType
{
    /** Default constructor */
    public CounterUnmannedAircraftSystemCUASRadio()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)41); // uid 31309, Counter Unmanned Aircraft System (C-UAS) Radio
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CounterUnmannedAircraftSystemCUASRadio createInstance()
    {
            return new CounterUnmannedAircraftSystemCUASRadio();
    }
}
