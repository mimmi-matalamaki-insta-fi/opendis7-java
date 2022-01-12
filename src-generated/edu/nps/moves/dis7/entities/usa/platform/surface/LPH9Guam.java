// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LPH9Guam</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LPH9Guam.createInstance()</code> or <code>new LPH9Guam()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Assault Ship = <code>54</code>; </li>
 *     <li> SubCategory: IwoJimaClass  = <code>2</code>; </li>
 *     <li> Specific: LPH9Guam  = <code>4</code>; </li>
 *     <li> Entity type uid: 11979; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4602f874. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousAssaultShip
 * @see SubCategory

 */
public final class LPH9Guam extends EntityType
{
    /** Default constructor */
    public LPH9Guam()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 11968, Amphibious Assault Ship
        setSubCategory((byte)2); // uid 11975, Iwo Jima Class
        setSpecific((byte)4); // uid 11979, LPH 9 Guam
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LPH9Guam createInstance()
    {
            return new LPH9Guam();
    }
}
