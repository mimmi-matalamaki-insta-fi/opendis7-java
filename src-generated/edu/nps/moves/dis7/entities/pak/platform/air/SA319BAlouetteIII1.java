/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pak.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA319BAlouetteIII1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA319BAlouetteIII1.createInstance()</code> or <code>new SA319BAlouetteIII1()</code>. </p>
 * <ul>
 *     <li> Country: Pakistan (PAK) = <code>165</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/Patrol Helicopter = <code>22</code>; </li>
 *     <li> SubCategory: AerospatialeAlouetteIII  = <code>1</code>; </li>
 *     <li> Specific: SA319BAlouetteIII  = <code>1</code>; </li>
 *     <li> Entity type uid: 30458; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f303ecd. </p>
 * @see Country#PAKISTAN_PAK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarePatrolHelicopter
 * @see SubCategory

 */
public final class SA319BAlouetteIII1 extends EntityType
{
    /** Default constructor */
    public SA319BAlouetteIII1()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 30456, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 30457, Aerospatiale Alouette III
        setSpecific((byte)1); // uid 30458, SA 319B Alouette III
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA319BAlouetteIII1 createInstance()
    {
            return new SA319BAlouetteIII1();
    }
}
