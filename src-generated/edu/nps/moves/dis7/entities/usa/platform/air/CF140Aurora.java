// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CF140Aurora</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CF140Aurora.createInstance()</code> or <code>new CF140Aurora()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine/patrol/observation = <code>5</code>; </li>
 *     <li> SubCategory: LockheedModel185285Orion  = <code>1</code>; </li>
 *     <li> Specific: CF140Aurora  = <code>9</code>; </li>
 *     <li> Entity type uid: 10973; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b379bc6. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarinepatrolobservation
 * @see SubCategory

 */
public final class CF140Aurora extends EntityType
{
    /** Default constructor */
    public CF140Aurora()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 10963, Anti-Submarine/patrol/observation
        setSubCategory((byte)1); // uid 10964, Lockheed Model 185/285 Orion
        setSpecific((byte)9); // uid 10973, CF-140 Aurora
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CF140Aurora createInstance()
    {
            return new CF140Aurora();
    }
}
