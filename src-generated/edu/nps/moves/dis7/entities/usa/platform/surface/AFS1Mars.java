/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AFS1Mars</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AFS1Mars.createInstance()</code> or <code>new AFS1Mars()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Combat Stores Ship = <code>58</code>; </li>
 *     <li> SubCategory: MarsClass  = <code>2</code>; </li>
 *     <li> Specific: AFS1Mars  = <code>1</code>; </li>
 *     <li> Entity type uid: 12042; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5fe46d52. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CombatStoresShip
 * @see SubCategory

 */
public final class AFS1Mars extends EntityType
{
    /** Default constructor */
    public AFS1Mars()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)58); // uid 12039, Combat Stores Ship
        setSubCategory((byte)2); // uid 12041, Mars Class
        setSpecific((byte)1); // uid 12042, AFS 1 Mars
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AFS1Mars createInstance()
    {
            return new AFS1Mars();
    }
}
