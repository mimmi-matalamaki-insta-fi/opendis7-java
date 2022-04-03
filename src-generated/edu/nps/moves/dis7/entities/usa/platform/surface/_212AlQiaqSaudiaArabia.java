// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_212AlQiaqSaudiaArabia</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_212AlQiaqSaudiaArabia.createInstance()</code> or <code>new _212AlQiaqSaudiaArabia()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: LCU1610ClassTransportYFUSaudiaArabia  = <code>6</code>; </li>
 *     <li> Specific: _212AlQiaqSaudiaArabia  = <code>1</code>; </li>
 *     <li> Entity type uid: 11692; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@19cdc217. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class _212AlQiaqSaudiaArabia extends EntityType
{
    /** Default constructor */
    public _212AlQiaqSaudiaArabia()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 11685, Landing Craft
        setSubCategory((byte)6); // uid 11691, LCU 1610 Class (Transport) (YFU) (Saudia Arabia)
        setSpecific((byte)1); // uid 11692, 212 Al Qiaq (Saudia Arabia)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _212AlQiaqSaudiaArabia createInstance()
    {
            return new _212AlQiaqSaudiaArabia();
    }
}
