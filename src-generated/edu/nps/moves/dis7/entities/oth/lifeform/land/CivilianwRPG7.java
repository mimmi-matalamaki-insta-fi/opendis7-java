/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CivilianwRPG7</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CivilianwRPG7.createInstance()</code> or <code>new CivilianwRPG7()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Civilian = <code>130</code>; </li>
 *     <li> SubCategory: AntiTankRockets  = <code>45</code>; </li>
 *     <li> Specific: CivilianwRPG7  = <code>110</code>; </li>
 *     <li> Entity type uid: 32736; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71d99732. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Civilian
 * @see SubCategory

 */
public final class CivilianwRPG7 extends EntityType
{
    /** Default constructor */
    public CivilianwRPG7()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32731, Civilian
        setSubCategory((byte)45); // uid 32735, Anti-Tank Rockets
        setSpecific((byte)110); // uid 32736, Civilian w/ RPG-7
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CivilianwRPG7 createInstance()
    {
            return new CivilianwRPG7();
    }
}
