// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DD967Elliott</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DD967Elliott.createInstance()</code> or <code>new DD967Elliott()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer = <code>5</code>; </li>
 *     <li> SubCategory: SpruanceClass  = <code>1</code>; </li>
 *     <li> Specific: DD967Elliott  = <code>5</code>; </li>
 *     <li> Entity type uid: 11462; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@404ced67. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Destroyer
 * @see SubCategory

 */
public final class DD967Elliott extends EntityType
{
    /** Default constructor */
    public DD967Elliott()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 11456, Destroyer
        setSubCategory((byte)1); // uid 11457, Spruance Class
        setSpecific((byte)5); // uid 11462, DD 967 Elliott
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DD967Elliott createInstance()
    {
            return new DD967Elliott();
    }
}
