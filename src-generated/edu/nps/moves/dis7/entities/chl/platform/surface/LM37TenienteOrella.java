/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LM37TenienteOrella</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LM37TenienteOrella.createInstance()</code> or <code>new LM37TenienteOrella()</code>. </p>
 * <ul>
 *     <li> Country: Chile (CHL) = <code>44</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: TigerClassType148  = <code>1</code>; </li>
 *     <li> Specific: LM37TenienteOrella  = <code>2</code>; </li>
 *     <li> Entity type uid: 27515; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17baae6e. </p>
 * @see Country#CHILE_CHL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class LM37TenienteOrella extends EntityType
{
    /** Default constructor */
    public LM37TenienteOrella()
    {
        setCountry(Country.CHILE_CHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27512, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27513, Tiger Class (Type 148)
        setSpecific((byte)2); // uid 27515, LM-37 Teniente Orella
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LM37TenienteOrella createInstance()
    {
            return new LM37TenienteOrella();
    }
}
