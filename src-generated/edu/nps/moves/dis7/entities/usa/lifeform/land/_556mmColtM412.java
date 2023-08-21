/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_556mmColtM412</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_556mmColtM412.createInstance()</code> or <code>new _556mmColtM412()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Rangers = <code>31</code>; </li>
 *     <li> SubCategory: AssaultRifles  = <code>5</code>; </li>
 *     <li> Specific: _556mmColtM4  = <code>42</code>; </li>
 *     <li> Entity type uid: 33283; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@29f8134. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Rangers
 * @see SubCategory

 */
public final class _556mmColtM412 extends EntityType
{
    /** Default constructor */
    public _556mmColtM412()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)31); // uid 32715, Rangers
        setSubCategory((byte)5); // uid 32716, Assault Rifles
        setSpecific((byte)42); // uid 33283, 5.56mm Colt M4
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _556mmColtM412 createInstance()
    {
            return new _556mmColtM412();
    }
}
