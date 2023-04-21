/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Trailerwater1200literACMATALM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Trailerwater1200literACMATALM.createInstance()</code> or <code>new Trailerwater1200literACMATALM()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Water trailer = <code>17</code>; </li>
 *     <li> SubCategory: _11000gallons  = <code>1</code>; </li>
 *     <li> Specific: Trailerwater1200literACMATALM  = <code>1</code>; </li>
 *     <li> Entity type uid: 13007; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6145b81e. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Watertrailer
 * @see SubCategory

 */
public final class Trailerwater1200literACMATALM extends EntityType
{
    /** Default constructor */
    public Trailerwater1200literACMATALM()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 13005, Water trailer
        setSubCategory((byte)1); // uid 13006, 1-1000 gallons
        setSpecific((byte)1); // uid 13007, Trailer, water, 1200 liter, ACMAT-ALM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Trailerwater1200literACMATALM createInstance()
    {
            return new Trailerwater1200literACMATALM();
    }
}
