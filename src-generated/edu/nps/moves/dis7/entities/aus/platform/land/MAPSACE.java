// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MAPSACE</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MAPSACE.createInstance()</code> or <code>new MAPSACE()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: MissionAdaptablePlatformSystemUnmannedGroundVehicleMAPSUGV  = <code>1</code>; </li>
 *     <li> Specific: MAPSACE  = <code>3</code>; </li>
 *     <li> Entity type uid: 31304; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@326de728. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class MAPSACE extends EntityType
{
    /** Default constructor */
    public MAPSACE()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 31300, Unmanned
        setSubCategory((byte)1); // uid 31301, Mission Adaptable Platform System Unmanned Ground Vehicle (MAPS UGV)
        setSpecific((byte)3); // uid 31304, MAPS ACE
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MAPSACE createInstance()
    {
            return new MAPSACE();
    }
}
