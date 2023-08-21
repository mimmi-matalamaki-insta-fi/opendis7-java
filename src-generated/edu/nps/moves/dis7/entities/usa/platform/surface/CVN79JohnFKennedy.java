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
 * <p> Entity class <b><code>CVN79JohnFKennedy</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CVN79JohnFKennedy.createInstance()</code> or <code>new CVN79JohnFKennedy()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Carrier = <code>1</code>; </li>
 *     <li> SubCategory: GeraldRFordClass  = <code>6</code>; </li>
 *     <li> Specific: CVN79JohnFKennedy  = <code>2</code>; </li>
 *     <li> Entity type uid: 33577; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5cfed0ba. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Carrier
 * @see SubCategory

 */
public final class CVN79JohnFKennedy extends EntityType
{
    /** Default constructor */
    public CVN79JohnFKennedy()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 11293, Carrier
        setSubCategory((byte)6); // uid 26434, Gerald R. Ford Class
        setSpecific((byte)2); // uid 33577, CVN 79 John F Kennedy
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CVN79JohnFKennedy createInstance()
    {
            return new CVN79JohnFKennedy();
    }
}
