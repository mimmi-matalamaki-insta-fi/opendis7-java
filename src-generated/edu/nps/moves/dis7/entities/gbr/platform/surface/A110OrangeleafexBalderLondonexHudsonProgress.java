/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A110OrangeleafexBalderLondonexHudsonProgress</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A110OrangeleafexBalderLondonexHudsonProgress.createInstance()</code> or <code>new A110OrangeleafexBalderLondonexHudsonProgress()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: AppleleafclasssupporttankersAOT  = <code>8</code>; </li>
 *     <li> Specific: A110OrangeleafexBalderLondonexHudsonProgress  = <code>3</code>; </li>
 *     <li> Entity type uid: 15391; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6bedd4e4. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A110OrangeleafexBalderLondonexHudsonProgress extends EntityType
{
    /** Default constructor */
    public A110OrangeleafexBalderLondonexHudsonProgress()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 15370, Auxiliary
        setSubCategory((byte)8); // uid 15388, Appleleaf class (support tankers (AOT))
        setSpecific((byte)3); // uid 15391, A 110 Orangeleaf (ex-Balder London, ex-Hudson Progress)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A110OrangeleafexBalderLondonexHudsonProgress createInstance()
    {
            return new A110OrangeleafexBalderLondonexHudsonProgress();
    }
}
