// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CategoryIMRAPRG33USSOCOM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CategoryIMRAPRG33USSOCOM.createInstance()</code> or <code>new CategoryIMRAPRG33USSOCOM()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: CategoryIMRAP  = <code>26</code>; </li>
 *     <li> Specific: CategoryIMRAPRG33  = <code>6</code>; </li>
 *     <li> Entity type uid: 26340; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1e3df614. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class CategoryIMRAPRG33USSOCOM extends EntityType
{
    /** Default constructor */
    public CategoryIMRAPRG33USSOCOM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 10233, Armored Utility Vehicle
        setSubCategory((byte)26); // uid 23418, Category I MRAP
        setSpecific((byte)6); // uid 24122, Category I MRAP RG-33
        setExtra((byte)1); // uid 26340, Category I MRAP RG-33 USSOCOM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CategoryIMRAPRG33USSOCOM createInstance()
    {
            return new CategoryIMRAPRG33USSOCOM();
    }
}
