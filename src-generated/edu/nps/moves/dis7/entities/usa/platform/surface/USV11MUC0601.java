// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>USV11MUC0601</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>USV11MUC0601.createInstance()</code> or <code>new USV11MUC0601()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned Surface Vehicle (USV) = <code>19</code>; </li>
 *     <li> SubCategory: FleetClassUSV  = <code>1</code>; </li>
 *     <li> Specific: USV11MUC0601  = <code>1</code>; </li>
 *     <li> Entity type uid: 28691; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7af1d072. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UnmannedSurfaceVehicleUSV
 * @see SubCategory

 */
public final class USV11MUC0601 extends EntityType
{
    /** Default constructor */
    public USV11MUC0601()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)19); // uid 28689, Unmanned Surface Vehicle (USV)
        setSubCategory((byte)1); // uid 28690, Fleet Class USV
        setSpecific((byte)1); // uid 28691, USV 11MUC0601
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static USV11MUC0601 createInstance()
    {
            return new USV11MUC0601();
    }
}
