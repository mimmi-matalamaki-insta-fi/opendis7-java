// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F29SomudraAvijan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F29SomudraAvijan.createInstance()</code> or <code>new F29SomudraAvijan()</code>. </p>
 * <ul>
 *     <li> Country: Bangladesh (BGD) = <code>18</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: HamiltonClass  = <code>1</code>; </li>
 *     <li> Specific: F29SomudraAvijan  = <code>2</code>; </li>
 *     <li> Entity type uid: 32623; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6a4f787b. </p>
 * @see Country#BANGLADESH_BGD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class F29SomudraAvijan extends EntityType
{
    /** Default constructor */
    public F29SomudraAvijan()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 32620, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 32621, Hamilton Class
        setSpecific((byte)2); // uid 32623, F29 Somudra Avijan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F29SomudraAvijan createInstance()
    {
            return new F29SomudraAvijan();
    }
}
