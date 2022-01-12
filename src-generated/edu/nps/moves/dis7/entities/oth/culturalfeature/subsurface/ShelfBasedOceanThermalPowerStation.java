// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ShelfBasedOceanThermalPowerStation</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ShelfBasedOceanThermalPowerStation.createInstance()</code> or <code>new ShelfBasedOceanThermalPowerStation()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Electrical Power Installation = <code>5</code>; </li>
 *     <li> SubCategory: OceanThermalPowerStation  = <code>2</code>; </li>
 *     <li> Specific: ShelfBasedOceanThermalPowerStation  = <code>1</code>; </li>
 *     <li> Entity type uid: 29786; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7be3abaa. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectricalPowerInstallation
 * @see SubCategory

 */
public final class ShelfBasedOceanThermalPowerStation extends EntityType
{
    /** Default constructor */
    public ShelfBasedOceanThermalPowerStation()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 29783, Electrical Power Installation
        setSubCategory((byte)2); // uid 29785, Ocean Thermal Power Station
        setSpecific((byte)1); // uid 29786, Shelf Based Ocean Thermal Power Station
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ShelfBasedOceanThermalPowerStation createInstance()
    {
            return new ShelfBasedOceanThermalPowerStation();
    }
}
