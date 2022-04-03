// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OLIN12GaugeFlare</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OLIN12GaugeFlare.createInstance()</code> or <code>new OLIN12GaugeFlare()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Signal/Illumination Flare = <code>7</code>; </li>
 *     <li> SubCategory: SignalFlare  = <code>1</code>; </li>
 *     <li> Specific: OLIN12GaugeFlare  = <code>1</code>; </li>
 *     <li> Entity type uid: 24964; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59b3f754. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SignalIlluminationFlare
 * @see SubCategory

 */
public final class OLIN12GaugeFlare extends EntityType
{
    /** Default constructor */
    public OLIN12GaugeFlare()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 24824, Signal/Illumination Flare
        setSubCategory((byte)1); // uid 24963, Signal Flare
        setSpecific((byte)1); // uid 24964, OLIN 12 Gauge Flare
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OLIN12GaugeFlare createInstance()
    {
            return new OLIN12GaugeFlare();
    }
}
