// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EODMK2MOD1UGV</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EODMK2MOD1UGV.createInstance()</code> or <code>new EODMK2MOD1UGV()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: SmallUnmannedGroundVehicleSUGV  = <code>2</code>; </li>
 *     <li> Specific: EODMK2MOD1UGV  = <code>6</code>; </li>
 *     <li> Entity type uid: 33521; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f6b53ed. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class EODMK2MOD1UGV extends EntityType
{
    /** Default constructor */
    public EODMK2MOD1UGV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 25582, Unmanned
        setSubCategory((byte)2); // uid 30487, Small Unmanned Ground Vehicle (SUGV)
        setSpecific((byte)6); // uid 33521, EOD MK 2 MOD 1 UGV
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EODMK2MOD1UGV createInstance()
    {
            return new EODMK2MOD1UGV();
    }
}