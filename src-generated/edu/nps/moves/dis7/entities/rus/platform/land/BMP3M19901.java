// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BMP3M19901</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BMP3M19901.createInstance()</code> or <code>new BMP3M19901()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: BMP3  = <code>3</code>; </li>
 *     <li> Specific: BMP3M19901  = <code>1</code>; </li>
 *     <li> Entity type uid: 12598; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6093d508. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class BMP3M19901 extends EntityType
{
    /** Default constructor */
    public BMP3M19901()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 12597, BMP-3
        setSpecific((byte)1); // uid 12598, BMP-3 M1990/1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BMP3M19901 createInstance()
    {
            return new BMP3M19901();
    }
}
