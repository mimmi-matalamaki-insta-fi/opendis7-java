/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TrailerFlatbed11tonM989HEMAT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TrailerFlatbed11tonM989HEMAT.createInstance()</code> or <code>new TrailerFlatbed11tonM989HEMAT()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: GreaterThan10tons  = <code>5</code>; </li>
 *     <li> Specific: TrailerFlatbed11tonM989HEMAT  = <code>5</code>; </li>
 *     <li> Entity type uid: 23469; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43245559. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class TrailerFlatbed11tonM989HEMAT extends EntityType
{
    /** Default constructor */
    public TrailerFlatbed11tonM989HEMAT()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 10616, Cargo Trailer
        setSubCategory((byte)5); // uid 10624, Greater Than 10 tons
        setSpecific((byte)5); // uid 23469, Trailer, Flatbed, 11-ton, M989 HEMAT
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TrailerFlatbed11tonM989HEMAT createInstance()
    {
            return new TrailerFlatbed11tonM989HEMAT();
    }
}
