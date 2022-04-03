// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M871A3LADSLaundrySystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M871A3LADSLaundrySystem.createInstance()</code> or <code>new M871A3LADSLaundrySystem()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: GreaterThan10tons  = <code>5</code>; </li>
 *     <li> Specific: M8712212ton  = <code>1</code>; </li>
 *     <li> Entity type uid: 33464; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@49edcb30. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class M871A3LADSLaundrySystem extends EntityType
{
    /** Default constructor */
    public M871A3LADSLaundrySystem()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 10616, Cargo Trailer
        setSubCategory((byte)5); // uid 10624, Greater Than 10 tons
        setSpecific((byte)1); // uid 22876, M871, 22 1/2 ton
        setExtra((byte)2); // uid 33464, M871A3 LADS Laundry System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M871A3LADSLaundrySystem createInstance()
    {
            return new M871A3LADSLaundrySystem();
    }
}
