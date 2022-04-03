// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bmu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CornerBrook</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CornerBrook.createInstance()</code> or <code>new CornerBrook()</code>. </p>
 * <ul>
 *     <li> Country: Bermuda (BMU) = <code>24</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dry Cargo Ship (Group 2 Merchant) = <code>81</code>; </li>
 *     <li> SubCategory: ContainerShip  = <code>3</code>; </li>
 *     <li> Specific: CornerBrook  = <code>1</code>; </li>
 *     <li> Entity type uid: 24500; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@402a079c. </p>
 * @see Country#BERMUDA_BMU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DryCargoShipGroup2Merchant
 * @see SubCategory

 */
public final class CornerBrook extends EntityType
{
    /** Default constructor */
    public CornerBrook()
    {
        setCountry(Country.BERMUDA_BMU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24498, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24499, Container Ship
        setSpecific((byte)1); // uid 24500, Corner Brook
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CornerBrook createInstance()
    {
            return new CornerBrook();
    }
}
