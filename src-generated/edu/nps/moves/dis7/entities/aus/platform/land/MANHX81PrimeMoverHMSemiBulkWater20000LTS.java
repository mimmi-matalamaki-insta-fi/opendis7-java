// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MANHX81PrimeMoverHMSemiBulkWater20000LTS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MANHX81PrimeMoverHMSemiBulkWater20000LTS.createInstance()</code> or <code>new MANHX81PrimeMoverHMSemiBulkWater20000LTS()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MANHX81PrimeMover  = <code>4</code>; </li>
 *     <li> Specific: MANHX81PrimeMoverHMSemiBulkWater20000LTS  = <code>3</code>; </li>
 *     <li> Entity type uid: 29750; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@52d455b8. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MANHX81PrimeMoverHMSemiBulkWater20000LTS extends EntityType
{
    /** Default constructor */
    public MANHX81PrimeMoverHMSemiBulkWater20000LTS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)4); // uid 29747, MAN HX81 - Prime Mover
        setSpecific((byte)3); // uid 29750, MAN HX81 Prime Mover, HM Semi, Bulk Water 20000LTS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MANHX81PrimeMoverHMSemiBulkWater20000LTS createInstance()
    {
            return new MANHX81PrimeMoverHMSemiBulkWater20000LTS();
    }
}
