// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CH46D</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CH46D.createInstance()</code> or <code>new CH46D()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility helicopter = <code>21</code>; </li>
 *     <li> SubCategory: Boeingmodel107  = <code>3</code>; </li>
 *     <li> Specific: CH46SeaKnight  = <code>2</code>; </li>
 *     <li> Entity type uid: 11127; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@b6bccb4. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utilityhelicopter
 * @see SubCategory

 */
public final class CH46D extends EntityType
{
    /** Default constructor */
    public CH46D()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 11088, Utility helicopter
        setSubCategory((byte)3); // uid 11124, Boeing model 107
        setSpecific((byte)2); // uid 11126, CH-46 Sea Knight
        setExtra((byte)1); // uid 11127, CH-46D
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CH46D createInstance()
    {
            return new CH46D();
    }
}
