/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SingleRotorTurboshaftEngineConventionalTailRotor1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SingleRotorTurboshaftEngineConventionalTailRotor1.createInstance()</code> or <code>new SingleRotorTurboshaftEngineConventionalTailRotor1()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg) = <code>92</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineConventionalTailRotor  = <code>12</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28592; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@a307a8c. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterLargeabove20000lbs9072kg
 * @see SubCategory

 */
public final class SingleRotorTurboshaftEngineConventionalTailRotor1 extends EntityType
{
    /** Default constructor */
    public SingleRotorTurboshaftEngineConventionalTailRotor1()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)92); // uid 28591, Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg)
        setSubCategory((byte)12); // uid 28592, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SingleRotorTurboshaftEngineConventionalTailRotor1 createInstance()
    {
            return new SingleRotorTurboshaftEngineConventionalTailRotor1();
    }
}
