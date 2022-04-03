// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1102TrailerwM326MortarStowageSystemMSS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1102TrailerwM326MortarStowageSystemMSS.createInstance()</code> or <code>new M1102TrailerwM326MortarStowageSystemMSS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: _0512ton  = <code>2</code>; </li>
 *     <li> Specific: TrailerCargoHighMobility114tonM1102  = <code>1</code>; </li>
 *     <li> Entity type uid: 34910; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1b4872bc. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class M1102TrailerwM326MortarStowageSystemMSS extends EntityType
{
    /** Default constructor */
    public M1102TrailerwM326MortarStowageSystemMSS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 10616, Cargo Trailer
        setSubCategory((byte)2); // uid 10618, 0.51 - 2 ton
        setSpecific((byte)1); // uid 10619, Trailer, Cargo, High Mobility, 1 1/4 ton, M1102
        setExtra((byte)2); // uid 34910, M1102 Trailer w/ M326 Mortar Stowage System (MSS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1102TrailerwM326MortarStowageSystemMSS createInstance()
    {
            return new M1102TrailerwM326MortarStowageSystemMSS();
    }
}
