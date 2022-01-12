// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BenettiBC002MotorYacht35m</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BenettiBC002MotorYacht35m.createInstance()</code> or <code>new BenettiBC002MotorYacht35m()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Private Motorboat = <code>84</code>; </li>
 *     <li> SubCategory: VeryLargeMotorboatgreaterthan65ft198m  = <code>4</code>; </li>
 *     <li> Specific: BenettiBC002MotorYacht35m  = <code>1</code>; </li>
 *     <li> Entity type uid: 26944; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1cb3ec38. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PrivateMotorboat
 * @see SubCategory

 */
public final class BenettiBC002MotorYacht35m extends EntityType
{
    /** Default constructor */
    public BenettiBC002MotorYacht35m()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 26942, Private Motorboat
        setSubCategory((byte)4); // uid 26943, Very Large Motorboat (greater than 65ft/19.8m)
        setSpecific((byte)1); // uid 26944, Benetti BC 002 Motor Yacht (35m)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BenettiBC002MotorYacht35m createInstance()
    {
            return new BenettiBC002MotorYacht35m();
    }
}
