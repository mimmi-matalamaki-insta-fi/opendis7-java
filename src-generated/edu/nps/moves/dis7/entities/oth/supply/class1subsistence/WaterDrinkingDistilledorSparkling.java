/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class1subsistence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WaterDrinkingDistilledorSparkling</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WaterDrinkingDistilledorSparkling.createInstance()</code> or <code>new WaterDrinkingDistilledorSparkling()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_1_SUBSISTENCE</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: W - Water = <code>6</code>; </li>
 *     <li> SubCategory: WaterDrinkingDistilledorSparkling  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30657; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@539ee811. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see WWater
 * @see SubCategory

 */
public final class WaterDrinkingDistilledorSparkling extends EntityType
{
    /** Default constructor */
    public WaterDrinkingDistilledorSparkling()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_1_SUBSISTENCE));

        setCategory((byte)6); // uid 30655, W - Water
        setSubCategory((byte)2); // uid 30657, Water, Drinking, Distilled or Sparkling
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WaterDrinkingDistilledorSparkling createInstance()
    {
            return new WaterDrinkingDistilledorSparkling();
    }
}
