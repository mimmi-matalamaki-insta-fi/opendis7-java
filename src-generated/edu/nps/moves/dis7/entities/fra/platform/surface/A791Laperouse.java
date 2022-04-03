// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A791Laperouse</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A791Laperouse.createInstance()</code> or <code>new A791Laperouse()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: BH2classBatimentsHydrographiquesDe2Eclassoceanographicampsurvey  = <code>1</code>; </li>
 *     <li> Specific: A791Laperouse  = <code>1</code>; </li>
 *     <li> Entity type uid: 16042; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7393222f. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A791Laperouse extends EntityType
{
    /** Default constructor */
    public A791Laperouse()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 16040, Auxiliary
        setSubCategory((byte)1); // uid 16041, BH2 class (Batiments Hydrographiques De 2E class) (oceanographic &amp; survey)
        setSpecific((byte)1); // uid 16042, A 791 Laperouse
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A791Laperouse createInstance()
    {
            return new A791Laperouse();
    }
}
