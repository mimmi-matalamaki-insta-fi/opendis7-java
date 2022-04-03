// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericSmallHelicopterSingleRotorTurboshaftEngineShroudedTailRotor</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericSmallHelicopterSingleRotorTurboshaftEngineShroudedTailRotor.createInstance()</code> or <code>new GenericSmallHelicopterSingleRotorTurboshaftEngineShroudedTailRotor()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg) = <code>90</code>; </li>
 *     <li> SubCategory: GenericSmallHelicopterSingleRotorTurboshaftEngineShroudedTailRotor  = <code>13</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24719; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@16a9a4f1. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterSmallupto7000lbs3175kg
 * @see SubCategory

 */
public final class GenericSmallHelicopterSingleRotorTurboshaftEngineShroudedTailRotor extends EntityType
{
    /** Default constructor */
    public GenericSmallHelicopterSingleRotorTurboshaftEngineShroudedTailRotor()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)90); // uid 24716, Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg)
        setSubCategory((byte)13); // uid 24719, Generic Small Helicopter, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericSmallHelicopterSingleRotorTurboshaftEngineShroudedTailRotor createInstance()
    {
            return new GenericSmallHelicopterSingleRotorTurboshaftEngineShroudedTailRotor();
    }
}
