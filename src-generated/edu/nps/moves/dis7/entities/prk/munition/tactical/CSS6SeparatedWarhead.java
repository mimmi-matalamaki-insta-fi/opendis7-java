/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CSS6SeparatedWarhead</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CSS6SeparatedWarhead.createInstance()</code> or <code>new CSS6SeparatedWarhead()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic People's Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: CSS6DF15  = <code>9</code>; </li>
 *     <li> Specific: CSS6SeparatedWarhead  = <code>2</code>; </li>
 *     <li> Entity type uid: 32503; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6e239337. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class CSS6SeparatedWarhead extends EntityType
{
    /** Default constructor */
    public CSS6SeparatedWarhead()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32499, Guided
        setSubCategory((byte)9); // uid 32501, CSS-6 (DF-15)
        setSpecific((byte)2); // uid 32503, CSS-6 Separated Warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CSS6SeparatedWarhead createInstance()
    {
            return new CSS6SeparatedWarhead();
    }
}
