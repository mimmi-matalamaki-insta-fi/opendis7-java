/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SvitzerHermod</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SvitzerHermod.createInstance()</code> or <code>new SvitzerHermod()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Support Vessel = <code>83</code>; </li>
 *     <li> SubCategory: Tugboat  = <code>3</code>; </li>
 *     <li> Specific: SvitzerHermod  = <code>2</code>; </li>
 *     <li> Entity type uid: 32980; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3646a422. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SupportVessel
 * @see SubCategory

 */
public final class SvitzerHermod extends EntityType
{
    /** Default constructor */
    public SvitzerHermod()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)83); // uid 32582, Support Vessel
        setSubCategory((byte)3); // uid 32978, Tugboat
        setSpecific((byte)2); // uid 32980, Svitzer Hermod
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SvitzerHermod createInstance()
    {
            return new SvitzerHermod();
    }
}
