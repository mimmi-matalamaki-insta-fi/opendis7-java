/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>K26320mmSPADA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>K26320mmSPADA.createInstance()</code> or <code>new K26320mmSPADA()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: K26320mmSPADA  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23442; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@a68df9. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class K26320mmSPADA extends EntityType
{
    /** Default constructor */
    public K26320mmSPADA()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 17623, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 23442, K-263 20mm SP ADA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static K26320mmSPADA createInstance()
    {
            return new K26320mmSPADA();
    }
}
