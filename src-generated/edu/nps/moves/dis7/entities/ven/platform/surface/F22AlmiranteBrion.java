/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ven.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F22AlmiranteBrion</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F22AlmiranteBrion.createInstance()</code> or <code>new F22AlmiranteBrion()</code>. </p>
 * <ul>
 *     <li> Country: Venezuela (Bolivarian Republic of) (VEN) = <code>229</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: LupoClass  = <code>1</code>; </li>
 *     <li> Specific: F22AlmiranteBrion  = <code>2</code>; </li>
 *     <li> Entity type uid: 27763; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3855d9b2. </p>
 * @see Country#VENEZUELA_BOLIVARIAN_REPUBLIC_OF_VEN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F22AlmiranteBrion extends EntityType
{
    /** Default constructor */
    public F22AlmiranteBrion()
    {
        setCountry(Country.VENEZUELA_BOLIVARIAN_REPUBLIC_OF_VEN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27760, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27761, Lupo Class
        setSpecific((byte)2); // uid 27763, F-22 Almirante Brion
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F22AlmiranteBrion createInstance()
    {
            return new F22AlmiranteBrion();
    }
}
