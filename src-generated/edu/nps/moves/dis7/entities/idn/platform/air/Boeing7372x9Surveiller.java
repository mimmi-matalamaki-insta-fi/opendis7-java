/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Boeing7372x9Surveiller</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Boeing7372x9Surveiller.createInstance()</code> or <code>new Boeing7372x9Surveiller()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: ASW/Patrol/Observation = <code>5</code>; </li>
 *     <li> SubCategory: Boeing7372x9Surveiller  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31436; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@160ac7fb. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ASWPatrolObservation
 * @see SubCategory

 */
public final class Boeing7372x9Surveiller extends EntityType
{
    /** Default constructor */
    public Boeing7372x9Surveiller()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 31435, ASW/Patrol/Observation
        setSubCategory((byte)1); // uid 31436, Boeing 737-2x9 Surveiller
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Boeing7372x9Surveiller createInstance()
    {
            return new Boeing7372x9Surveiller();
    }
}
