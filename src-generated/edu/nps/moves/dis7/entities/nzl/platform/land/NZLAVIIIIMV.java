// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nzl.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NZLAVIIIIMV</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NZLAVIIIIMV.createInstance()</code> or <code>new NZLAVIIIIMV()</code>. </p>
 * <ul>
 *     <li> Country: New Zealand (NZL) = <code>156</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: NZLightArmouredVehicleNZLAV  = <code>1</code>; </li>
 *     <li> Specific: NZLAVIIIIMV  = <code>3</code>; </li>
 *     <li> Entity type uid: 31937; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@415e0bcb. </p>
 * @see Country#NEW_ZEALAND_NZL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class NZLAVIIIIMV extends EntityType
{
    /** Default constructor */
    public NZLAVIIIIMV()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 31933, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 31934, NZ Light Armoured Vehicle (NZLAV)
        setSpecific((byte)3); // uid 31937, NZLAV III IMV
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NZLAVIIIIMV createInstance()
    {
            return new NZLAVIIIIMV();
    }
}
