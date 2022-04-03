// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SCOUTMBT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SCOUTMBT.createInstance()</code> or <code>new SCOUTMBT()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: SCOUTUnmannedGroundVehicleSCOUTUGV  = <code>2</code>; </li>
 *     <li> Specific: SCOUTMBT  = <code>1</code>; </li>
 *     <li> Entity type uid: 31307; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71f2a7d5. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class SCOUTMBT extends EntityType
{
    /** Default constructor */
    public SCOUTMBT()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 31300, Unmanned
        setSubCategory((byte)2); // uid 31306, SCOUT Unmanned Ground Vehicle (SCOUT UGV)
        setSpecific((byte)1); // uid 31307, SCOUT-MBT
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SCOUTMBT createInstance()
    {
            return new SCOUTMBT();
    }
}
