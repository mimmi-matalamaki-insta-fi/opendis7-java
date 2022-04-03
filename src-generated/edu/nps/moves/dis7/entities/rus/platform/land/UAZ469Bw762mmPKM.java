// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>UAZ469Bw762mmPKM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>UAZ469Bw762mmPKM.createInstance()</code> or <code>new UAZ469Bw762mmPKM()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: UAZ469BUAZ31512  = <code>2</code>; </li>
 *     <li> Specific: UAZ469Bw762mmPKM  = <code>5</code>; </li>
 *     <li> Entity type uid: 26676; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6ac0b715. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class UAZ469Bw762mmPKM extends EntityType
{
    /** Default constructor */
    public UAZ469Bw762mmPKM()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 12854, Small Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 12857, UAZ-469B (UAZ-31512)
        setSpecific((byte)5); // uid 26676, UAZ-469B w/ 7.62 mm PKM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static UAZ469Bw762mmPKM createInstance()
    {
            return new UAZ469Bw762mmPKM();
    }
}
