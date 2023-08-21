/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TornadoIDSASSTA3GT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TornadoIDSASSTA3GT.createInstance()</code> or <code>new TornadoIDSASSTA3GT()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: PanaviaTornadoInterdictionStrikeIDS  = <code>2</code>; </li>
 *     <li> Specific: TornadoIDSASSTA3GT  = <code>7</code>; </li>
 *     <li> Entity type uid: 28088; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f1de2d6. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class TornadoIDSASSTA3GT extends EntityType
{
    /** Default constructor */
    public TornadoIDSASSTA3GT()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 16333, Attack/Strike
        setSubCategory((byte)2); // uid 16340, Panavia Tornado Interdiction/Strike (IDS)
        setSpecific((byte)7); // uid 28088, Tornado IDS ASST A3 GT
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TornadoIDSASSTA3GT createInstance()
    {
            return new TornadoIDSASSTA3GT();
    }
}
