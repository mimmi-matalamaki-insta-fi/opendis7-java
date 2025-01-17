/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.csk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AeroL29Delfin</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AeroL29Delfin.createInstance()</code> or <code>new AeroL29Delfin()</code>. </p>
 * <ul>
 *     <li> Country: Czechoslovakia (CSK) = <code>56</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: AeroL29Delfin  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19130; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4803b726. </p>
 * @see Country#ACTION_REQUEST_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class AeroL29Delfin extends EntityType
{
    /** Default constructor */
    public AeroL29Delfin()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 19128, Trainer
        setSubCategory((byte)2); // uid 19130, Aero L-29 Delfin
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AeroL29Delfin createInstance()
    {
            return new AeroL29Delfin();
    }
}
