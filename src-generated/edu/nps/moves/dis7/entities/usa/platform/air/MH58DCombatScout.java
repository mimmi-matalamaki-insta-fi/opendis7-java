// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MH58DCombatScout</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MH58DCombatScout.createInstance()</code> or <code>new MH58DCombatScout()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Observation helicopter = <code>24</code>; </li>
 *     <li> SubCategory: BellModel406CSCombatScout  = <code>3</code>; </li>
 *     <li> Specific: MH58DCombatScout  = <code>2</code>; </li>
 *     <li> Entity type uid: 11183; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35025a0a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Observationhelicopter
 * @see SubCategory

 */
public final class MH58DCombatScout extends EntityType
{
    /** Default constructor */
    public MH58DCombatScout()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)24); // uid 11174, Observation helicopter
        setSubCategory((byte)3); // uid 11181, Bell Model 406 CS Combat Scout
        setSpecific((byte)2); // uid 11183, MH-58D Combat Scout
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MH58DCombatScout createInstance()
    {
            return new MH58DCombatScout();
    }
}
