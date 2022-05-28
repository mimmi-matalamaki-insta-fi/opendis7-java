// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MeerkatHuskyMKIIVehicleMountedMineDetectorVMMD</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MeerkatHuskyMKIIVehicleMountedMineDetectorVMMD.createInstance()</code> or <code>new MeerkatHuskyMKIIVehicleMountedMineDetectorVMMD()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine roller = <code>13</code>; </li>
 *     <li> SubCategory: MeerkatHuskyMKIIVehicleMountedMineDetectorVMMD  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 33392; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@db99785. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Mineroller
 * @see SubCategory

 */
public final class MeerkatHuskyMKIIVehicleMountedMineDetectorVMMD extends EntityType
{
    /** Default constructor */
    public MeerkatHuskyMKIIVehicleMountedMineDetectorVMMD()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)13); // uid 10615, Mine roller
        setSubCategory((byte)2); // uid 33392, Meerkat Husky MK II Vehicle Mounted Mine Detector (VMMD)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MeerkatHuskyMKIIVehicleMountedMineDetectorVMMD createInstance()
    {
            return new MeerkatHuskyMKIIVehicleMountedMineDetectorVMMD();
    }
}