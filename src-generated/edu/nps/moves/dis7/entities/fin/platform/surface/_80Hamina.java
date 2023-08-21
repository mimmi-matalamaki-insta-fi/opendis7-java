/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fin.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_80Hamina</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_80Hamina.createInstance()</code> or <code>new _80Hamina()</code>. </p>
 * <ul>
 *     <li> Country: Finland (FIN) = <code>70</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Attack Craft = <code>64</code>; </li>
 *     <li> SubCategory: HaminaClassMissileBoat  = <code>1</code>; </li>
 *     <li> Specific: _80Hamina  = <code>1</code>; </li>
 *     <li> Entity type uid: 29711; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@19932c16. </p>
 * @see Country#FINLAND_FIN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastAttackCraft
 * @see SubCategory

 */
public final class _80Hamina extends EntityType
{
    /** Default constructor */
    public _80Hamina()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29709, Fast Attack Craft
        setSubCategory((byte)1); // uid 29710, Hamina Class Missile Boat
        setSpecific((byte)1); // uid 29711, 80 Hamina
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _80Hamina createInstance()
    {
            return new _80Hamina();
    }
}
