/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BRAVE75T</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BRAVE75T.createInstance()</code> or <code>new BRAVE75T()</code>. </p>
 * <ul>
 *     <li> Country: Singapore (SGP) = <code>193</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: BRAVEFastLandingCraftforEquipmentandPersonnelFCEP  = <code>1</code>; </li>
 *     <li> Specific: BRAVE75T  = <code>4</code>; </li>
 *     <li> Entity type uid: 25560; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c83ae01. </p>
 * @see Country#SINGAPORE_SGP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class BRAVE75T extends EntityType
{
    /** Default constructor */
    public BRAVE75T()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 25555, Landing Craft
        setSubCategory((byte)1); // uid 25556, BRAVE Fast Landing Craft for Equipment and Personnel (FCEP)
        setSpecific((byte)4); // uid 25560, BRAVE -75T
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BRAVE75T createInstance()
    {
            return new BRAVE75T();
    }
}
