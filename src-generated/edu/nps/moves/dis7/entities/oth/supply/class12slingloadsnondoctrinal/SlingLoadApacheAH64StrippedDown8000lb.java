/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SlingLoadApacheAH64StrippedDown8000lb</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SlingLoadApacheAH64StrippedDown8000lb.createInstance()</code> or <code>new SlingLoadApacheAH64StrippedDown8000lb()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Helicopters = <code>10</code>; </li>
 *     <li> SubCategory: SlingLoadApacheAH64  = <code>1</code>; </li>
 *     <li> Specific: SlingLoadApacheAH64StrippedDown8000lb  = <code>1</code>; </li>
 *     <li> Entity type uid: 30860; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@651cedfb. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadHelicopters
 * @see SubCategory

 */
public final class SlingLoadApacheAH64StrippedDown8000lb extends EntityType
{
    /** Default constructor */
    public SlingLoadApacheAH64StrippedDown8000lb()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)10); // uid 30858, Sling Load, Helicopters
        setSubCategory((byte)1); // uid 30859, Sling Load, Apache AH-64
        setSpecific((byte)1); // uid 30860, Sling Load, Apache AH-64, Stripped Down, 8000 lb
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SlingLoadApacheAH64StrippedDown8000lb createInstance()
    {
            return new SlingLoadApacheAH64StrippedDown8000lb();
    }
}
