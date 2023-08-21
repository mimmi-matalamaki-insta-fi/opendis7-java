/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Shelonclasstorpedooperatingpatrolamptargetcraft</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Shelonclasstorpedooperatingpatrolamptargetcraft.createInstance()</code> or <code>new Shelonclasstorpedooperatingpatrolamptargetcraft()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: Shelonclasstorpedooperatingpatrolamptargetcraft  = <code>17</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 13693; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@14229fa7. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolcraft
 * @see SubCategory

 */
public final class Shelonclasstorpedooperatingpatrolamptargetcraft extends EntityType
{
    /** Default constructor */
    public Shelonclasstorpedooperatingpatrolamptargetcraft()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 13670, Light/Patrol craft
        setSubCategory((byte)17); // uid 13693, Shelon class (torpedo operating/patrol &amp; target craft)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Shelonclasstorpedooperatingpatrolamptargetcraft createInstance()
    {
            return new Shelonclasstorpedooperatingpatrolamptargetcraft();
    }
}
