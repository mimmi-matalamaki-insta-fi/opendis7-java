// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LargeHydroelectricPowerStation</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LargeHydroelectricPowerStation.createInstance()</code> or <code>new LargeHydroelectricPowerStation()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Electrical Power Installation = <code>29</code>; </li>
 *     <li> SubCategory: HydroelectricPowerStation  = <code>1</code>; </li>
 *     <li> Specific: LargeHydroelectricPowerStation  = <code>1</code>; </li>
 *     <li> Entity type uid: 29762; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3be46d9c. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectricalPowerInstallation
 * @see SubCategory

 */
public final class LargeHydroelectricPowerStation extends EntityType
{
    /** Default constructor */
    public LargeHydroelectricPowerStation()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)29); // uid 29760, Electrical Power Installation
        setSubCategory((byte)1); // uid 29761, Hydroelectric Power Station
        setSpecific((byte)1); // uid 29762, Large Hydroelectric Power Station
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LargeHydroelectricPowerStation createInstance()
    {
            return new LargeHydroelectricPowerStation();
    }
}
