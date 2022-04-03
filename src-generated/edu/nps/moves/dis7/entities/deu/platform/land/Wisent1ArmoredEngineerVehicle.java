// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Wisent1ArmoredEngineerVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Wisent1ArmoredEngineerVehicle.createInstance()</code> or <code>new Wisent1ArmoredEngineerVehicle()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: Wisent1  = <code>16</code>; </li>
 *     <li> Specific: Wisent1ArmoredEngineerVehicle  = <code>1</code>; </li>
 *     <li> Entity type uid: 33345; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7e4204e2. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class Wisent1ArmoredEngineerVehicle extends EntityType
{
    /** Default constructor */
    public Wisent1ArmoredEngineerVehicle()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 16263, Armored Utility Vehicle
        setSubCategory((byte)16); // uid 33344, Wisent-1
        setSpecific((byte)1); // uid 33345, Wisent-1 Armored Engineer Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Wisent1ArmoredEngineerVehicle createInstance()
    {
            return new Wisent1ArmoredEngineerVehicle();
    }
}
