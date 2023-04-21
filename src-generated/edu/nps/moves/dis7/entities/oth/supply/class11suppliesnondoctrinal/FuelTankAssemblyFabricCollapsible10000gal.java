/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class11suppliesnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FuelTankAssemblyFabricCollapsible10000gal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FuelTankAssemblyFabricCollapsible10000gal.createInstance()</code> or <code>new FuelTankAssemblyFabricCollapsible10000gal()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_11_SUPPLIES_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Fuel Tanks, Drums and Bladders = <code>3</code>; </li>
 *     <li> SubCategory: FuelTankAssemblyFabricCollapsible10000gal  = <code>6</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30607; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@32caae19. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see FuelTanksDrumsandBladders
 * @see SubCategory

 */
public final class FuelTankAssemblyFabricCollapsible10000gal extends EntityType
{
    /** Default constructor */
    public FuelTankAssemblyFabricCollapsible10000gal()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_11_SUPPLIES_NON_DOCTRINAL));

        setCategory((byte)3); // uid 30601, Fuel Tanks, Drums and Bladders
        setSubCategory((byte)6); // uid 30607, Fuel Tank, Assembly Fabric Collapsible, 10000 gal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FuelTankAssemblyFabricCollapsible10000gal createInstance()
    {
            return new FuelTankAssemblyFabricCollapsible10000gal();
    }
}
