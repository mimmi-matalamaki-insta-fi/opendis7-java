// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SingleRotorTurboshaftEngineShroudedTailRotor</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SingleRotorTurboshaftEngineShroudedTailRotor.createInstance()</code> or <code>new SingleRotorTurboshaftEngineShroudedTailRotor()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg) = <code>90</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineShroudedTailRotor  = <code>13</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24077; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2796aeae. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterSmallupto7000lbs3175kg
 * @see SubCategory

 */
public final class SingleRotorTurboshaftEngineShroudedTailRotor extends EntityType
{
    /** Default constructor */
    public SingleRotorTurboshaftEngineShroudedTailRotor()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)90); // uid 24076, Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg)
        setSubCategory((byte)13); // uid 24077, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SingleRotorTurboshaftEngineShroudedTailRotor createInstance()
    {
            return new SingleRotorTurboshaftEngineShroudedTailRotor();
    }
}
