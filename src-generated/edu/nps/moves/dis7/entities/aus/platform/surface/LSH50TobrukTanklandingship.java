/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LSH50TobrukTanklandingship</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LSH50TobrukTanklandingship.createInstance()</code> or <code>new LSH50TobrukTanklandingship()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>10</code>; </li>
 *     <li> SubCategory: ModifiedSirBedivereClass  = <code>1</code>; </li>
 *     <li> Specific: LSH50TobrukTanklandingship  = <code>1</code>; </li>
 *     <li> Entity type uid: 17584; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3dd3bcd. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class LSH50TobrukTanklandingship extends EntityType
{
    /** Default constructor */
    public LSH50TobrukTanklandingship()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 17582, Landing Craft
        setSubCategory((byte)1); // uid 17583, Modified Sir Bedivere Class
        setSpecific((byte)1); // uid 17584, LSH 50 Tobruk Tank landing ship
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LSH50TobrukTanklandingship createInstance()
    {
            return new LSH50TobrukTanklandingship();
    }
}
