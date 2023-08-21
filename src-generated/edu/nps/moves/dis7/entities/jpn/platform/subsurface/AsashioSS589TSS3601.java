/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AsashioSS589TSS3601</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AsashioSS589TSS3601.createInstance()</code> or <code>new AsashioSS589TSS3601()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: HarushioClassSS  = <code>1</code>; </li>
 *     <li> Specific: AsashioSS589TSS3601  = <code>7</code>; </li>
 *     <li> Entity type uid: 26999; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a12c728. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class AsashioSS589TSS3601 extends EntityType
{
    /** Default constructor */
    public AsashioSS589TSS3601()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18910, SS (Conventional Attack-Torpedo Patrol)
        setSubCategory((byte)1); // uid 18911, Harushio Class (SS)
        setSpecific((byte)7); // uid 26999, Asashio SS-589/TSS-3601
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AsashioSS589TSS3601 createInstance()
    {
            return new AsashioSS589TSS3601();
    }
}
