// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TankAssemblyFabricCollapsibleFuelSimtech5000gal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TankAssemblyFabricCollapsibleFuelSimtech5000gal.createInstance()</code> or <code>new TankAssemblyFabricCollapsibleFuelSimtech5000gal()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Engineer Equipment = <code>18</code>; </li>
 *     <li> SubCategory: TankAssemblyFabricCollapsibleFuelSimtech  = <code>22</code>; </li>
 *     <li> Specific: TankAssemblyFabricCollapsibleFuelSimtech5000gal  = <code>2</code>; </li>
 *     <li> Entity type uid: 34947; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a8f6e6. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see EngineerEquipment
 * @see SubCategory

 */
public final class TankAssemblyFabricCollapsibleFuelSimtech5000gal extends EntityType
{
    /** Default constructor */
    public TankAssemblyFabricCollapsibleFuelSimtech5000gal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)22); // uid 34945, Tank Assembly Fabric Collapsible, Fuel, Simtech
        setSpecific((byte)2); // uid 34947, Tank Assembly Fabric Collapsible, Fuel, Simtech, 5000 gal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TankAssemblyFabricCollapsibleFuelSimtech5000gal createInstance()
    {
            return new TankAssemblyFabricCollapsibleFuelSimtech5000gal();
    }
}
