// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.arg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Q21ARAAustral</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Q21ARAAustral.createInstance()</code> or <code>new Q21ARAAustral()</code>. </p>
 * <ul>
 *     <li> Country: Argentina (ARG) = <code>10</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SurveyShip  = <code>2</code>; </li>
 *     <li> Specific: Q21ARAAustral  = <code>2</code>; </li>
 *     <li> Entity type uid: 33215; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c8da962. </p>
 * @see Country#ARGENTINA_ARG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class Q21ARAAustral extends EntityType
{
    /** Default constructor */
    public Q21ARAAustral()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18757, Auxiliary
        setSubCategory((byte)2); // uid 18759, Survey Ship
        setSpecific((byte)2); // uid 33215, Q 21 ARA Austral
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Q21ARAAustral createInstance()
    {
            return new Q21ARAAustral();
    }
}
