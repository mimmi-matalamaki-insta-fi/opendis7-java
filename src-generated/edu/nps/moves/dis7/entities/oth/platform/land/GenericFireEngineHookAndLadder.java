// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericFireEngineHookAndLadder</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericFireEngineHookAndLadder.createInstance()</code> or <code>new GenericFireEngineHookAndLadder()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Multiple Unit Utility/Emergency Truck = <code>86</code>; </li>
 *     <li> SubCategory: GenericFireEngineHookAndLadder  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25880; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3c5a54b7. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MultipleUnitUtilityEmergencyTruck
 * @see SubCategory

 */
public final class GenericFireEngineHookAndLadder extends EntityType
{
    /** Default constructor */
    public GenericFireEngineHookAndLadder()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)86); // uid 25879, Multiple Unit Utility/Emergency Truck
        setSubCategory((byte)1); // uid 25880, Generic Fire Engine, Hook And Ladder
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericFireEngineHookAndLadder createInstance()
    {
            return new GenericFireEngineHookAndLadder();
    }
}
