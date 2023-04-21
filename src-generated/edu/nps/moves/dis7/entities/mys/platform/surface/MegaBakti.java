/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mys.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MegaBakti</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MegaBakti.createInstance()</code> or <code>new MegaBakti()</code>. </p>
 * <ul>
 *     <li> Country: Malaysia (MYS) = <code>132</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SubmarineRescueShip  = <code>2</code>; </li>
 *     <li> Specific: MegaBakti  = <code>1</code>; </li>
 *     <li> Entity type uid: 30534; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7fcff1b9. </p>
 * @see Country#MALAYSIA_MYS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class MegaBakti extends EntityType
{
    /** Default constructor */
    public MegaBakti()
    {
        setCountry(Country.MALAYSIA_MYS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27403, Auxiliary
        setSubCategory((byte)2); // uid 30533, Submarine Rescue Ship
        setSpecific((byte)1); // uid 30534, Mega Bakti
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MegaBakti createInstance()
    {
            return new MegaBakti();
    }
}
