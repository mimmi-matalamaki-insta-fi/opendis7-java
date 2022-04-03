// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FFG63Congress</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FFG63Congress.createInstance()</code> or <code>new FFG63Congress()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: ConstellationFFG62class  = <code>4</code>; </li>
 *     <li> Specific: FFG63Congress  = <code>2</code>; </li>
 *     <li> Entity type uid: 34622; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3344d163. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigate
 * @see SubCategory

 */
public final class FFG63Congress extends EntityType
{
    /** Default constructor */
    public FFG63Congress()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 11498, Guided Missile Frigate
        setSubCategory((byte)4); // uid 34620, Constellation (FFG-62) class
        setSpecific((byte)2); // uid 34622, FFG 63 Congress
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FFG63Congress createInstance()
    {
            return new FFG63Congress();
    }
}
