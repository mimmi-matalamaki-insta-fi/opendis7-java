/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mmr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F21MaharBandoola</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F21MaharBandoola.createInstance()</code> or <code>new F21MaharBandoola()</code>. </p>
 * <ul>
 *     <li> Country: Myanmar (MMR) = <code>35</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: JianghuIIClassType053H1  = <code>1</code>; </li>
 *     <li> Specific: F21MaharBandoola  = <code>1</code>; </li>
 *     <li> Entity type uid: 26768; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f4919b0. </p>
 * @see Country#MYANMAR_MMR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F21MaharBandoola extends EntityType
{
    /** Default constructor */
    public F21MaharBandoola()
    {
        setCountry(Country.MYANMAR_MMR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 26766, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 26767, Jianghu-II Class (Type 053H1)
        setSpecific((byte)1); // uid 26768, F21 Mahar Bandoola
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F21MaharBandoola createInstance()
    {
            return new F21MaharBandoola();
    }
}
