// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_953NaberezhnyeChelny</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_953NaberezhnyeChelny.createInstance()</code> or <code>new _953NaberezhnyeChelny()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Frigate (includes Corvette) = <code>6</code>; </li>
 *     <li> SubCategory: TarantulIIIClassProject1241112411M12411MR  = <code>10</code>; </li>
 *     <li> Specific: _953NaberezhnyeChelny  = <code>18</code>; </li>
 *     <li> Entity type uid: 27126; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7fd8c559. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileFrigateincludesCorvette
 * @see SubCategory

 */
public final class _953NaberezhnyeChelny extends EntityType
{
    /** Default constructor */
    public _953NaberezhnyeChelny()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 13593, Guided-missile Frigate (includes Corvette)
        setSubCategory((byte)10); // uid 13666, Tarantul III Class (Project 12411/1241.1M/1241.1MR)
        setSpecific((byte)18); // uid 27126, 953 Naberezhnye Chelny
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _953NaberezhnyeChelny createInstance()
    {
            return new _953NaberezhnyeChelny();
    }
}
