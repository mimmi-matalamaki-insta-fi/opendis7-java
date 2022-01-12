// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MH60RSeahawk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MH60RSeahawk.createInstance()</code> or <code>new MH60RSeahawk()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/Patrol Helicopter = <code>22</code>; </li>
 *     <li> SubCategory: SikorskyS70B  = <code>1</code>; </li>
 *     <li> Specific: MH60RSeahawk  = <code>2</code>; </li>
 *     <li> Entity type uid: 29326; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35851384. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarePatrolHelicopter
 * @see SubCategory

 */
public final class MH60RSeahawk extends EntityType
{
    /** Default constructor */
    public MH60RSeahawk()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 29323, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 29324, Sikorsky S-70B
        setSpecific((byte)2); // uid 29326, MH-60R Seahawk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MH60RSeahawk createInstance()
    {
            return new MH60RSeahawk();
    }
}
