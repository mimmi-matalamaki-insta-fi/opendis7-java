/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TomSawyer</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TomSawyer.createInstance()</code> or <code>new TomSawyer()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Passenger Vessel (Group 1 Merchant) = <code>80</code>; </li>
 *     <li> SubCategory: Ferry  = <code>4</code>; </li>
 *     <li> Specific: TomSawyer  = <code>5</code>; </li>
 *     <li> Entity type uid: 32991; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@710b18a6. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PassengerVesselGroup1Merchant
 * @see SubCategory

 */
public final class TomSawyer extends EntityType
{
    /** Default constructor */
    public TomSawyer()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)80); // uid 27589, Passenger Vessel (Group 1 Merchant)
        setSubCategory((byte)4); // uid 32986, Ferry
        setSpecific((byte)5); // uid 32991, Tom Sawyer
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TomSawyer createInstance()
    {
            return new TomSawyer();
    }
}
