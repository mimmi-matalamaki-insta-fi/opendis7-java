// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TAGOS3Vindicator</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TAGOS3Vindicator.createInstance()</code> or <code>new TAGOS3Vindicator()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance Towed Array Sonar System (SURTASS) = <code>59</code>; </li>
 *     <li> SubCategory: StalwartClassOceanSurveillance  = <code>8</code>; </li>
 *     <li> Specific: TAGOS3Vindicator  = <code>3</code>; </li>
 *     <li> Entity type uid: 12065; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f1fa1d0. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceTowedArraySonarSystemSURTASS
 * @see SubCategory

 */
public final class TAGOS3Vindicator extends EntityType
{
    /** Default constructor */
    public TAGOS3Vindicator()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)59); // uid 12049, Surveillance Towed Array Sonar System (SURTASS)
        setSubCategory((byte)8); // uid 12062, Stalwart Class (Ocean Surveillance)
        setSpecific((byte)3); // uid 12065, TAGOS 3 Vindicator
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TAGOS3Vindicator createInstance()
    {
            return new TAGOS3Vindicator();
    }
}
