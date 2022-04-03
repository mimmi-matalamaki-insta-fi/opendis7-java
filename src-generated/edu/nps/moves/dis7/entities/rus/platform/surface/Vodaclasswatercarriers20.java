// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Vodaclasswatercarriers20</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Vodaclasswatercarriers20.createInstance()</code> or <code>new Vodaclasswatercarriers20()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Vodaclasswatercarriers  = <code>2</code>; </li>
 *     <li> Specific: _20  = <code>9</code>; </li>
 *     <li> Entity type uid: 14583; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@753aca85. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class Vodaclasswatercarriers20 extends EntityType
{
    /** Default constructor */
    public Vodaclasswatercarriers20()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 14570, Utility
        setSubCategory((byte)2); // uid 14574, Voda class (water carriers)
        setSpecific((byte)9); // uid 14583, 20
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Vodaclasswatercarriers20 createInstance()
    {
            return new Vodaclasswatercarriers20();
    }
}
