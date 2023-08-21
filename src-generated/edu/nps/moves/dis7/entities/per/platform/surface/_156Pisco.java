/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.per.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_156Pisco</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_156Pisco.createInstance()</code> or <code>new _156Pisco()</code>. </p>
 * <ul>
 *     <li> Country: Peru (PER) = <code>172</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Transport Dock = <code>56</code>; </li>
 *     <li> SubCategory: MakassarClassLandingPlatformDock  = <code>1</code>; </li>
 *     <li> Specific: _156Pisco  = <code>1</code>; </li>
 *     <li> Entity type uid: 31452; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b005a0b. </p>
 * @see Country#PERU_PER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousTransportDock
 * @see SubCategory

 */
public final class _156Pisco extends EntityType
{
    /** Default constructor */
    public _156Pisco()
    {
        setCountry(Country.PERU_PER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 31450, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 31451, Makassar Class Landing Platform Dock
        setSpecific((byte)1); // uid 31452, 156 Pisco
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _156Pisco createInstance()
    {
            return new _156Pisco();
    }
}
