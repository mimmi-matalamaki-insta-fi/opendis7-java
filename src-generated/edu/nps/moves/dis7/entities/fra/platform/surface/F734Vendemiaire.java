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
 * <p> Entity class <b><code>F734Vendemiaire</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F734Vendemiaire.createInstance()</code> or <code>new F734Vendemiaire()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: Florealclasspatrolfrigates  = <code>2</code>; </li>
 *     <li> Specific: F734Vendemiaire  = <code>5</code>; </li>
 *     <li> Entity type uid: 15960; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2049a9c1. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileFrigate
 * @see SubCategory

 */
public final class F734Vendemiaire extends EntityType
{
    /** Default constructor */
    public F734Vendemiaire()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 15950, Guided-missile Frigate
        setSubCategory((byte)2); // uid 15955, Floreal class (patrol frigates)
        setSpecific((byte)5); // uid 15960, F 734 Vendemiaire
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F734Vendemiaire createInstance()
    {
            return new F734Vendemiaire();
    }
}
