/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fji.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Kiro</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Kiro.createInstance()</code> or <code>new Kiro()</code>. </p>
 * <ul>
 *     <li> Country: Fiji (FJI) = <code>69</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: PacificClassPatrolBoat  = <code>1</code>; </li>
 *     <li> Specific: Kiro  = <code>3</code>; </li>
 *     <li> Entity type uid: 26698; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@231f98ef. </p>
 * @see Country#FIJI_FJI
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class Kiro extends EntityType
{
    /** Default constructor */
    public Kiro()
    {
        setCountry(Country.FIJI_FJI);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26694, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26695, Pacific Class Patrol Boat
        setSpecific((byte)3); // uid 26698, Kiro
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Kiro createInstance()
    {
            return new Kiro();
    }
}
