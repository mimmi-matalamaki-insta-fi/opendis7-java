// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ATV4X4PolarisSportsmanMV</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ATV4X4PolarisSportsmanMV.createInstance()</code> or <code>new ATV4X4PolarisSportsmanMV()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Recreational = <code>90</code>; </li>
 *     <li> SubCategory: ATV4X4  = <code>2</code>; </li>
 *     <li> Specific: ATV4X4PolarisSportsmanMV  = <code>1</code>; </li>
 *     <li> Entity type uid: 24957; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@423ed3b5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Recreational
 * @see SubCategory

 */
public final class ATV4X4PolarisSportsmanMV extends EntityType
{
    /** Default constructor */
    public ATV4X4PolarisSportsmanMV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)90); // uid 24955, Recreational
        setSubCategory((byte)2); // uid 24956, ATV, 4X4
        setSpecific((byte)1); // uid 24957, ATV 4X4, Polaris Sportsman MV
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ATV4X4PolarisSportsmanMV createInstance()
    {
            return new ATV4X4PolarisSportsmanMV();
    }
}
