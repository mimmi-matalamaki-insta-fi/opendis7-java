/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fin.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SISUE13TPE15TPMilitaryTerrainLorry</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SISUE13TPE15TPMilitaryTerrainLorry.createInstance()</code> or <code>new SISUE13TPE15TPMilitaryTerrainLorry()</code>. </p>
 * <ul>
 *     <li> Country: Finland (FIN) = <code>70</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: SISUE13TPE15TPMilitaryTerrainLorry  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29945; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6be968ce. </p>
 * @see Country#FINLAND_FIN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class SISUE13TPE15TPMilitaryTerrainLorry extends EntityType
{
    /** Default constructor */
    public SISUE13TPE15TPMilitaryTerrainLorry()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 27629, Armored Utility Vehicle
        setSubCategory((byte)3); // uid 29945, SISU E13TP/E15TP Military Terrain Lorry
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SISUE13TPE15TPMilitaryTerrainLorry createInstance()
    {
            return new SISUE13TPE15TPMilitaryTerrainLorry();
    }
}
