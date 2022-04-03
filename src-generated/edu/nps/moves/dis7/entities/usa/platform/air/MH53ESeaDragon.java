// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MH53ESeaDragon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MH53ESeaDragon.createInstance()</code> or <code>new MH53ESeaDragon()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo helicopter = <code>23</code>; </li>
 *     <li> SubCategory: SikorskyS80H53  = <code>2</code>; </li>
 *     <li> Specific: MH53ESeaDragon  = <code>2</code>; </li>
 *     <li> Entity type uid: 11165; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@601d6622. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Cargohelicopter
 * @see SubCategory

 */
public final class MH53ESeaDragon extends EntityType
{
    /** Default constructor */
    public MH53ESeaDragon()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)23); // uid 11153, Cargo helicopter
        setSubCategory((byte)2); // uid 11163, Sikorsky S-80/H-53
        setSpecific((byte)2); // uid 11165, MH-53E Sea Dragon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MH53ESeaDragon createInstance()
    {
            return new MH53ESeaDragon();
    }
}
