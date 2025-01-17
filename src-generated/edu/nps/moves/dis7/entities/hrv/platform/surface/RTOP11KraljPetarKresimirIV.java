/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.hrv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RTOP11KraljPetarKresimirIV</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RTOP11KraljPetarKresimirIV.createInstance()</code> or <code>new RTOP11KraljPetarKresimirIV()</code>. </p>
 * <ul>
 *     <li> Country: Croatia (HRV) = <code>249</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvettes) = <code>50</code>; </li>
 *     <li> SubCategory: KraljTypeR03ClassFSG  = <code>1</code>; </li>
 *     <li> Specific: RTOP11KraljPetarKresimirIV  = <code>1</code>; </li>
 *     <li> Entity type uid: 19337; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1da2cb77. </p>
 * @see Country#CROATIA_HRV
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvettes
 * @see SubCategory

 */
public final class RTOP11KraljPetarKresimirIV extends EntityType
{
    /** Default constructor */
    public RTOP11KraljPetarKresimirIV()
    {
        setCountry(Country.CROATIA_HRV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 19335, Frigate (including Corvettes)
        setSubCategory((byte)1); // uid 19336, Kralj (Type R-03) Class (FSG)
        setSpecific((byte)1); // uid 19337, RTOP 11 Kralj Petar Kresimir IV
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RTOP11KraljPetarKresimirIV createInstance()
    {
            return new RTOP11KraljPetarKresimirIV();
    }
}
