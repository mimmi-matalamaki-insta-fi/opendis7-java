/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SingleLaneConcretePierBridgeSpan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SingleLaneConcretePierBridgeSpan.createInstance()</code> or <code>new SingleLaneConcretePierBridgeSpan()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Bridge Span = <code>19</code>; </li>
 *     <li> SubCategory: SingleLaneEachWay  = <code>1</code>; </li>
 *     <li> Specific: SingleLaneConcretePierBridgeSpan  = <code>2</code>; </li>
 *     <li> Entity type uid: 22077; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@fd69983. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see BridgeSpan
 * @see SubCategory

 */
public final class SingleLaneConcretePierBridgeSpan extends EntityType
{
    /** Default constructor */
    public SingleLaneConcretePierBridgeSpan()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 22073, Bridge Span
        setSubCategory((byte)1); // uid 22075, Single Lane Each Way
        setSpecific((byte)2); // uid 22077, Single Lane Concrete Pier Bridge Span
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SingleLaneConcretePierBridgeSpan createInstance()
    {
            return new SingleLaneConcretePierBridgeSpan();
    }
}
