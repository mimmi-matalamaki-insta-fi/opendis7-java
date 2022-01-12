// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AdvancedConceptTechnologyDemonstratorACTD43ft</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AdvancedConceptTechnologyDemonstratorACTD43ft.createInstance()</code> or <code>new AdvancedConceptTechnologyDemonstratorACTD43ft()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other Vessels = <code>87</code>; </li>
 *     <li> SubCategory: GoFastBoat  = <code>1</code>; </li>
 *     <li> Specific: USCustomsandBorderPatrolCBPInterceptorClass  = <code>1</code>; </li>
 *     <li> Entity type uid: 28473; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@22a4ca4a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see OtherVessels
 * @see SubCategory

 */
public final class AdvancedConceptTechnologyDemonstratorACTD43ft extends EntityType
{
    /** Default constructor */
    public AdvancedConceptTechnologyDemonstratorACTD43ft()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)87); // uid 28469, Other Vessels
        setSubCategory((byte)1); // uid 28470, Go-Fast Boat
        setSpecific((byte)1); // uid 28471, U.S. Customs and Border Patrol (CBP) Interceptor Class
        setExtra((byte)2); // uid 28473, Advanced Concept Technology Demonstrator (ACTD) 43ft
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AdvancedConceptTechnologyDemonstratorACTD43ft createInstance()
    {
            return new AdvancedConceptTechnologyDemonstratorACTD43ft();
    }
}
