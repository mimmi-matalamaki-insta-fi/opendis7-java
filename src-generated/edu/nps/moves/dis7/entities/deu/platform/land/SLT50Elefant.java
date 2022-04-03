// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SLT50Elefant</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SLT50Elefant.createInstance()</code> or <code>new SLT50Elefant()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle (greater than 1.25 tons) = <code>7</code>; </li>
 *     <li> SubCategory: SLTTractorUnit  = <code>7</code>; </li>
 *     <li> Specific: SLT50Elefant  = <code>1</code>; </li>
 *     <li> Entity type uid: 28076; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e1ef60. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehiclegreaterthan125tons
 * @see SubCategory

 */
public final class SLT50Elefant extends EntityType
{
    /** Default constructor */
    public SLT50Elefant()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 16279, Large Wheeled Utility Vehicle (greater than 1.25 tons)
        setSubCategory((byte)7); // uid 28075, SLT Tractor Unit
        setSpecific((byte)1); // uid 28076, SLT 50 Elefant
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SLT50Elefant createInstance()
    {
            return new SLT50Elefant();
    }
}
