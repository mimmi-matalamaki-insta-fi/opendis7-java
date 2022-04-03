// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MikhailRudnitskyClassProject0536005361RescueShips</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MikhailRudnitskyClassProject0536005361RescueShips.createInstance()</code> or <code>new MikhailRudnitskyClassProject0536005361RescueShips()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: MikhailRudnitskyClassProject0536005361RescueShips  = <code>68</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 14245; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@77774571. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class MikhailRudnitskyClassProject0536005361RescueShips extends EntityType
{
    /** Default constructor */
    public MikhailRudnitskyClassProject0536005361RescueShips()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)68); // uid 14245, Mikhail Rudnitsky Class (Project 05360/05361) Rescue Ships
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MikhailRudnitskyClassProject0536005361RescueShips createInstance()
    {
            return new MikhailRudnitskyClassProject0536005361RescueShips();
    }
}
