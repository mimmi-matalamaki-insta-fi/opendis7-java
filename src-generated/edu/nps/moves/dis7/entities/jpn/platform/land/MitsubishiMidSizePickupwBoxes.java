// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MitsubishiMidSizePickupwBoxes</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MitsubishiMidSizePickupwBoxes.createInstance()</code> or <code>new MitsubishiMidSizePickupwBoxes()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Cargo Truck = <code>83</code>; </li>
 *     <li> SubCategory: PickupTruckMidSize  = <code>2</code>; </li>
 *     <li> Specific: MitsubishiMidSizePickup  = <code>1</code>; </li>
 *     <li> Entity type uid: 24892; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@50b8ae8d. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitCargoTruck
 * @see SubCategory

 */
public final class MitsubishiMidSizePickupwBoxes extends EntityType
{
    /** Default constructor */
    public MitsubishiMidSizePickupwBoxes()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24879, Single Unit Cargo Truck
        setSubCategory((byte)2); // uid 24889, Pickup Truck, Mid-Size
        setSpecific((byte)1); // uid 24890, Mitsubishi Mid-Size Pickup
        setExtra((byte)2); // uid 24892, Mitsubishi Mid-Size Pickup w/ Boxes
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MitsubishiMidSizePickupwBoxes createInstance()
    {
            return new MitsubishiMidSizePickupwBoxes();
    }
}
