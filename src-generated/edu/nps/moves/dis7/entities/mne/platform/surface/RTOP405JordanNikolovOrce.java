/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mne.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RTOP405JordanNikolovOrce</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RTOP405JordanNikolovOrce.createInstance()</code> or <code>new RTOP405JordanNikolovOrce()</code>. </p>
 * <ul>
 *     <li> Country: Montenegro (MNE) = <code>259</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Attack Craft = <code>64</code>; </li>
 *     <li> SubCategory: KoncarClass  = <code>1</code>; </li>
 *     <li> Specific: RTOP405JordanNikolovOrce  = <code>1</code>; </li>
 *     <li> Entity type uid: 30136; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@265c5d69. </p>
 * @see Country#MONTENEGRO_MNE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastAttackCraft
 * @see SubCategory

 */
public final class RTOP405JordanNikolovOrce extends EntityType
{
    /** Default constructor */
    public RTOP405JordanNikolovOrce()
    {
        setCountry(Country.MONTENEGRO_MNE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 30134, Fast Attack Craft
        setSubCategory((byte)1); // uid 30135, Koncar Class
        setSpecific((byte)1); // uid 30136, RTOP-405 Jordan Nikolov Orce
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RTOP405JordanNikolovOrce createInstance()
    {
            return new RTOP405JordanNikolovOrce();
    }
}
