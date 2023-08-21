/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D611DuguayTrouin</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D611DuguayTrouin.createInstance()</code> or <code>new D611DuguayTrouin()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer (Fregates or Escorteurs D'escadres) = <code>4</code>; </li>
 *     <li> SubCategory: TourvilleclassTypeF67  = <code>4</code>; </li>
 *     <li> Specific: D611DuguayTrouin  = <code>2</code>; </li>
 *     <li> Entity type uid: 15946; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@125290e5. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyerFregatesorEscorteursDescadres
 * @see SubCategory

 */
public final class D611DuguayTrouin extends EntityType
{
    /** Default constructor */
    public D611DuguayTrouin()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 15929, Guided Missile Destroyer (Fregates or Escorteurs D'escadres)
        setSubCategory((byte)4); // uid 15944, Tourville class (Type F 67)
        setSpecific((byte)2); // uid 15946, D 611 Duguay-Trouin
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D611DuguayTrouin createInstance()
    {
            return new D611DuguayTrouin();
    }
}
