// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.are.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>VeryLargeMotorboatgreaterthan65ft198m</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VeryLargeMotorboatgreaterthan65ft198m.createInstance()</code> or <code>new VeryLargeMotorboatgreaterthan65ft198m()</code>. </p>
 * <ul>
 *     <li> Country: United Arab Emirates (ARE) = <code>223</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Private Motorboat = <code>84</code>; </li>
 *     <li> SubCategory: VeryLargeMotorboatgreaterthan65ft198m  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28236; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6abdec0e. </p>
 * @see Country#UNITED_ARAB_EMIRATES_ARE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PrivateMotorboat
 * @see SubCategory

 */
public final class VeryLargeMotorboatgreaterthan65ft198m extends EntityType
{
    /** Default constructor */
    public VeryLargeMotorboatgreaterthan65ft198m()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 28235, Private Motorboat
        setSubCategory((byte)4); // uid 28236, Very Large Motorboat (greater than 65ft/19.8m)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VeryLargeMotorboatgreaterthan65ft198m createInstance()
    {
            return new VeryLargeMotorboatgreaterthan65ft198m();
    }
}
