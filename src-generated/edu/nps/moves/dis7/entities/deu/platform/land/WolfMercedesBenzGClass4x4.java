// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WolfMercedesBenzGClass4x4</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WolfMercedesBenzGClass4x4.createInstance()</code> or <code>new WolfMercedesBenzGClass4x4()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle (0 - 1.25 tons) = <code>6</code>; </li>
 *     <li> SubCategory: WolfMercedesBenzGClass4x4  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 16278; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6337c201. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle0125tons
 * @see SubCategory

 */
public final class WolfMercedesBenzGClass4x4 extends EntityType
{
    /** Default constructor */
    public WolfMercedesBenzGClass4x4()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 16277, Small Wheeled Utility Vehicle (0 - 1.25 tons)
        setSubCategory((byte)1); // uid 16278, Wolf (Mercedes Benz G-Class 4x4)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WolfMercedesBenzGClass4x4 createInstance()
    {
            return new WolfMercedesBenzGClass4x4();
    }
}
