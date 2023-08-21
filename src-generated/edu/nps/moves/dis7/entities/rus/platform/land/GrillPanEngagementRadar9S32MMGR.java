/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GrillPanEngagementRadar9S32MMGR</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GrillPanEngagementRadar9S32MMGR.createInstance()</code> or <code>new GrillPanEngagementRadar9S32MMGR()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SA23GladiatorGiantSAMSystemS300VMAntey2500  = <code>26</code>; </li>
 *     <li> Specific: SA23MultichannelMissileGuidanceStationMMGS  = <code>2</code>; </li>
 *     <li> Entity type uid: 29861; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2a32fb6. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class GrillPanEngagementRadar9S32MMGR extends EntityType
{
    /** Default constructor */
    public GrillPanEngagementRadar9S32MMGR()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)26); // uid 29855, SA-23 Gladiator/Giant SAM System (S-300VM/Antey-2500)
        setSpecific((byte)2); // uid 29860, SA-23 Multichannel Missile Guidance Station (MMGS)
        setExtra((byte)1); // uid 29861, Grill Pan Engagement Radar (9S32 MMGR)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GrillPanEngagementRadar9S32MMGR createInstance()
    {
            return new GrillPanEngagementRadar9S32MMGR();
    }
}
