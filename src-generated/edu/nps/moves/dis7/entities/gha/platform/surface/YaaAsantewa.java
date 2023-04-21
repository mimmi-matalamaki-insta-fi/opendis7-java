/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gha.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YaaAsantewa</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YaaAsantewa.createInstance()</code> or <code>new YaaAsantewa()</code>. </p>
 * <ul>
 *     <li> Country: Ghana (GHA) = <code>79</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: AlbatrosClassType143143B  = <code>1</code>; </li>
 *     <li> Specific: YaaAsantewa  = <code>2</code>; </li>
 *     <li> Entity type uid: 27504; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a85c92. </p>
 * @see Country#GHANA_GHA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class YaaAsantewa extends EntityType
{
    /** Default constructor */
    public YaaAsantewa()
    {
        setCountry(Country.GHANA_GHA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27501, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27502, Albatros Class (Type 143/143B)
        setSpecific((byte)2); // uid 27504, Yaa Asantewa
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YaaAsantewa createInstance()
    {
            return new YaaAsantewa();
    }
}
