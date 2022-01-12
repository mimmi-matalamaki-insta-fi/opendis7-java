// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.blr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MZKT79308x8Astrolog</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MZKT79308x8Astrolog.createInstance()</code> or <code>new MZKT79308x8Astrolog()</code>. </p>
 * <ul>
 *     <li> Country: Belarus (BLR) = <code>246</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MZKT79308x8Astrolog  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30051; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@66a3ffec. </p>
 * @see Country#BELARUS_BLR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MZKT79308x8Astrolog extends EntityType
{
    /** Default constructor */
    public MZKT79308x8Astrolog()
    {
        setCountry(Country.BELARUS_BLR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 30050, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 30051, MZKT-7930 8x8 Astrolog
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MZKT79308x8Astrolog createInstance()
    {
            return new MZKT79308x8Astrolog();
    }
}
