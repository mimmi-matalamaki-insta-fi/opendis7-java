/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WDU4AAFlechetteWarheadSubmunition20grainflechette</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WDU4AAFlechetteWarheadSubmunition20grainflechette.createInstance()</code> or <code>new WDU4AAFlechetteWarheadSubmunition20grainflechette()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: Hydra70RocketSystem70mm275in  = <code>21</code>; </li>
 *     <li> Specific: Hydra70wWDU4AAFlechetteWarhead  = <code>7</code>; </li>
 *     <li> Entity type uid: 24974; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@11cc9e1e. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class WDU4AAFlechetteWarheadSubmunition20grainflechette extends EntityType
{
    /** Default constructor */
    public WDU4AAFlechetteWarheadSubmunition20grainflechette()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)21); // uid 20150, Hydra 70 Rocket System (70 mm, 2.75 in)
        setSpecific((byte)7); // uid 24973, Hydra 70 w/ WDU-4A/A Flechette Warhead
        setExtra((byte)1); // uid 24974, WDU-4A/A Flechette Warhead Submunition (20-grain flechette)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WDU4AAFlechetteWarheadSubmunition20grainflechette createInstance()
    {
            return new WDU4AAFlechetteWarheadSubmunition20grainflechette();
    }
}
