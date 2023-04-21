/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ArmedReconnaissanceHelicopterARH</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ArmedReconnaissanceHelicopterARH.createInstance()</code> or <code>new ArmedReconnaissanceHelicopterARH()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Observation helicopter = <code>24</code>; </li>
 *     <li> SubCategory: BellModel407  = <code>4</code>; </li>
 *     <li> Specific: ArmedReconnaissanceHelicopterARH  = <code>1</code>; </li>
 *     <li> Entity type uid: 24049; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@527a8665. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Observationhelicopter
 * @see SubCategory

 */
public final class ArmedReconnaissanceHelicopterARH extends EntityType
{
    /** Default constructor */
    public ArmedReconnaissanceHelicopterARH()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)24); // uid 11174, Observation helicopter
        setSubCategory((byte)4); // uid 24048, Bell Model 407
        setSpecific((byte)1); // uid 24049, Armed Reconnaissance Helicopter (ARH)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ArmedReconnaissanceHelicopterARH createInstance()
    {
            return new ArmedReconnaissanceHelicopterARH();
    }
}
