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
 * <p> Entity class <b><code>LSD51OakHill</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LSD51OakHill.createInstance()</code> or <code>new LSD51OakHill()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dock Landing Ship = <code>9</code>; </li>
 *     <li> SubCategory: WhidbeyIslandClass  = <code>1</code>; </li>
 *     <li> Specific: LSD51OakHill  = <code>11</code>; </li>
 *     <li> Entity type uid: 11652; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@231df705. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DockLandingShip
 * @see SubCategory

 */
public final class LSD51OakHill extends EntityType
{
    /** Default constructor */
    public LSD51OakHill()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 11640, Dock Landing Ship
        setSubCategory((byte)1); // uid 11641, Whidbey Island Class
        setSpecific((byte)11); // uid 11652, LSD 51 Oak Hill
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LSD51OakHill createInstance()
    {
            return new LSD51OakHill();
    }
}
