// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Generic5DoorHatchbackFullPremiumLuxuryLarge</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Generic5DoorHatchbackFullPremiumLuxuryLarge.createInstance()</code> or <code>new Generic5DoorHatchbackFullPremiumLuxuryLarge()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Car = <code>81</code>; </li>
 *     <li> SubCategory: Generic5DoorHatchbackFullPremiumLuxuryLarge  = <code>54</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25778; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5649ec46. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Car
 * @see SubCategory

 */
public final class Generic5DoorHatchbackFullPremiumLuxuryLarge extends EntityType
{
    /** Default constructor */
    public Generic5DoorHatchbackFullPremiumLuxuryLarge()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 25754, Car
        setSubCategory((byte)54); // uid 25778, Generic 5-Door Hatchback, Full/Premium/Luxury (Large)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Generic5DoorHatchbackFullPremiumLuxuryLarge createInstance()
    {
            return new Generic5DoorHatchbackFullPremiumLuxuryLarge();
    }
}
