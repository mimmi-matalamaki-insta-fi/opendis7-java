// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BO105A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BO105A.createInstance()</code> or <code>new BO105A()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg) = <code>90</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineConventionalTailRotor  = <code>12</code>; </li>
 *     <li> Specific: BO105  = <code>1</code>; </li>
 *     <li> Entity type uid: 26406; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@cd1d761. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterSmallupto7000lbs3175kg
 * @see SubCategory

 */
public final class BO105A extends EntityType
{
    /** Default constructor */
    public BO105A()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)90); // uid 24076, Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg)
        setSubCategory((byte)12); // uid 26404, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)1); // uid 26405, BO-105
        setExtra((byte)1); // uid 26406, BO-105A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BO105A createInstance()
    {
            return new BO105A();
    }
}
