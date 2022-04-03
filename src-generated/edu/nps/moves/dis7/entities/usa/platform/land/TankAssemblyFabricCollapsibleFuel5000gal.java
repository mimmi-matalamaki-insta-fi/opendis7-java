// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TankAssemblyFabricCollapsibleFuel5000gal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TankAssemblyFabricCollapsibleFuel5000gal.createInstance()</code> or <code>new TankAssemblyFabricCollapsibleFuel5000gal()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Engineer Equipment = <code>18</code>; </li>
 *     <li> SubCategory: TankAssemblyFabricCollapsibleFuel5000gal  = <code>23</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 34949; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5aa62ee7. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see EngineerEquipment
 * @see SubCategory

 */
public final class TankAssemblyFabricCollapsibleFuel5000gal extends EntityType
{
    /** Default constructor */
    public TankAssemblyFabricCollapsibleFuel5000gal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)23); // uid 34949, Tank Assembly Fabric Collapsible, Fuel, 5000 gal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TankAssemblyFabricCollapsibleFuel5000gal createInstance()
    {
            return new TankAssemblyFabricCollapsibleFuel5000gal();
    }
}
