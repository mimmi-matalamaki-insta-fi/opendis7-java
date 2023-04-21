/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F946ElSuez</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F946ElSuez.createInstance()</code> or <code>new F946ElSuez()</code>. </p>
 * <ul>
 *     <li> Country: Egypt (EGY) = <code>62</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigates = <code>6</code>; </li>
 *     <li> SubCategory: DescubiertaClassFFG  = <code>1</code>; </li>
 *     <li> Specific: F946ElSuez  = <code>2</code>; </li>
 *     <li> Entity type uid: 23130; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d4d66d2. </p>
 * @see Country#COMMENT_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigates
 * @see SubCategory

 */
public final class F946ElSuez extends EntityType
{
    /** Default constructor */
    public F946ElSuez()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18799, Guided Missile Frigates
        setSubCategory((byte)1); // uid 18800, Descubierta Class (FFG)
        setSpecific((byte)2); // uid 23130, F946 El Suez
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F946ElSuez createInstance()
    {
            return new F946ElSuez();
    }
}
