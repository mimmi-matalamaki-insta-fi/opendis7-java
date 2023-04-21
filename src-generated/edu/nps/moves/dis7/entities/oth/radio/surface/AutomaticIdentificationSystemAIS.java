/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.radio.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AutomaticIdentificationSystemAIS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AutomaticIdentificationSystemAIS.createInstance()</code> or <code>new AutomaticIdentificationSystemAIS()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Automatic Identification System (AIS) = <code>37</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31910; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@574218f. </p>
 * @see Country#OTHER
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AutomaticIdentificationSystemAIS

 */
public final class AutomaticIdentificationSystemAIS extends EntityType
{
    /** Default constructor */
    public AutomaticIdentificationSystemAIS()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)37); // uid 31910, Automatic Identification System (AIS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AutomaticIdentificationSystemAIS createInstance()
    {
            return new AutomaticIdentificationSystemAIS();
    }
}
