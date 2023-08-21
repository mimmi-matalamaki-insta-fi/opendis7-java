/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A04MartinPosadillo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A04MartinPosadillo.createInstance()</code> or <code>new A04MartinPosadillo()</code>. </p>
 * <ul>
 *     <li> Country: Spain (ESP) = <code>198</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: TransportShipAP  = <code>2</code>; </li>
 *     <li> Specific: A04MartinPosadillo  = <code>1</code>; </li>
 *     <li> Entity type uid: 19030; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1386313f. </p>
 * @see Country#SPAIN_ESP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A04MartinPosadillo extends EntityType
{
    /** Default constructor */
    public A04MartinPosadillo()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19026, Auxiliary
        setSubCategory((byte)2); // uid 19029, Transport Ship (AP)
        setSpecific((byte)1); // uid 19030, A04 Martin Posadillo
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A04MartinPosadillo createInstance()
    {
            return new A04MartinPosadillo();
    }
}
