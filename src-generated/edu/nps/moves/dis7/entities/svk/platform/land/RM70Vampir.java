/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.svk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RM70Vampir</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RM70Vampir.createInstance()</code> or <code>new RM70Vampir()</code>. </p>
 * <ul>
 *     <li> Country: Slovakia (SVK) = <code>268</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: RM70  = <code>1</code>; </li>
 *     <li> Specific: RM70Vampir  = <code>4</code>; </li>
 *     <li> Entity type uid: 30126; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@600f5704. </p>
 * @see Country#SLOVAKIA_SVK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class RM70Vampir extends EntityType
{
    /** Default constructor */
    public RM70Vampir()
    {
        setCountry(Country.SLOVAKIA_SVK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 30121, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 30122, RM-70
        setSpecific((byte)4); // uid 30126, RM-70 Vampir
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RM70Vampir createInstance()
    {
            return new RM70Vampir();
    }
}
