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
 * <p> Entity class <b><code>ChevyS10wM60</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ChevyS10wM60.createInstance()</code> or <code>new ChevyS10wM60()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Cargo Truck = <code>83</code>; </li>
 *     <li> SubCategory: PickupTruckMini  = <code>1</code>; </li>
 *     <li> Specific: ChevyS10  = <code>1</code>; </li>
 *     <li> Entity type uid: 24935; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5e180aaf. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitCargoTruck
 * @see SubCategory

 */
public final class ChevyS10wM60 extends EntityType
{
    /** Default constructor */
    public ChevyS10wM60()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24926, Single Unit Cargo Truck
        setSubCategory((byte)1); // uid 24927, Pickup Truck, Mini
        setSpecific((byte)1); // uid 24928, Chevy S-10
        setExtra((byte)7); // uid 24935, Chevy S-10 w/ M60
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ChevyS10wM60 createInstance()
    {
            return new ChevyS10wM60();
    }
}
