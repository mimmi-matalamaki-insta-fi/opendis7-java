// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CaterpillarModel120M</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CaterpillarModel120M.createInstance()</code> or <code>new CaterpillarModel120M()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Construction Specialty Vehicle = <code>87</code>; </li>
 *     <li> SubCategory: Grader  = <code>7</code>; </li>
 *     <li> Specific: CaterpillarModel120M  = <code>1</code>; </li>
 *     <li> Entity type uid: 26015; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@149274cb. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ConstructionSpecialtyVehicle
 * @see SubCategory

 */
public final class CaterpillarModel120M extends EntityType
{
    /** Default constructor */
    public CaterpillarModel120M()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 26009, Construction Specialty Vehicle
        setSubCategory((byte)7); // uid 26014, Grader
        setSpecific((byte)1); // uid 26015, Caterpillar Model 120M
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CaterpillarModel120M createInstance()
    {
            return new CaterpillarModel120M();
    }
}
