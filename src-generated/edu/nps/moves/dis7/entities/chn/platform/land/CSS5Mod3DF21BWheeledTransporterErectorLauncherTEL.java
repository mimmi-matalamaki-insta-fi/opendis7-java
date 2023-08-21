/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CSS5Mod3DF21BWheeledTransporterErectorLauncherTEL</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CSS5Mod3DF21BWheeledTransporterErectorLauncherTEL.createInstance()</code> or <code>new CSS5Mod3DF21BWheeledTransporterErectorLauncherTEL()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: CSS5Mod1DF21WheeledTransporterErectorLauncherTEL  = <code>33</code>; </li>
 *     <li> Specific: CSS5Mod3DF21BWheeledTransporterErectorLauncherTEL  = <code>2</code>; </li>
 *     <li> Entity type uid: 31973; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2890c451. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class CSS5Mod3DF21BWheeledTransporterErectorLauncherTEL extends EntityType
{
    /** Default constructor */
    public CSS5Mod3DF21BWheeledTransporterErectorLauncherTEL()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)33); // uid 31971, CSS-5 Mod 1 (DF-21) Wheeled Transporter Erector Launcher (TEL)
        setSpecific((byte)2); // uid 31973, CSS-5 Mod 3 (DF-21B) Wheeled Transporter Erector Launcher (TEL)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CSS5Mod3DF21BWheeledTransporterErectorLauncherTEL createInstance()
    {
            return new CSS5Mod3DF21BWheeledTransporterErectorLauncherTEL();
    }
}
