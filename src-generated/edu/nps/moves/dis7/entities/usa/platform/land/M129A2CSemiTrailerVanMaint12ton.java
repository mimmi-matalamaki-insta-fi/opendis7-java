// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M129A2CSemiTrailerVanMaint12ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M129A2CSemiTrailerVanMaint12ton.createInstance()</code> or <code>new M129A2CSemiTrailerVanMaint12ton()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Maintenance equipment trailer = <code>20</code>; </li>
 *     <li> SubCategory: ToolsPartsTrailer  = <code>3</code>; </li>
 *     <li> Specific: M129A2CSemiTrailerVanMaint12ton  = <code>1</code>; </li>
 *     <li> Entity type uid: 10650; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59fc6d05. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Maintenanceequipmenttrailer
 * @see SubCategory

 */
public final class M129A2CSemiTrailerVanMaint12ton extends EntityType
{
    /** Default constructor */
    public M129A2CSemiTrailerVanMaint12ton()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)20); // uid 10646, Maintenance equipment trailer
        setSubCategory((byte)3); // uid 10649, Tools/Parts Trailer
        setSpecific((byte)1); // uid 10650, M129A2C Semi-Trailer, Van, Maint, 12-ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M129A2CSemiTrailerVanMaint12ton createInstance()
    {
            return new M129A2CSemiTrailerVanMaint12ton();
    }
}
