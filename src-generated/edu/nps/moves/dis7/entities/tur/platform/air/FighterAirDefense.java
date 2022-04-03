// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tur.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FighterAirDefense</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FighterAirDefense.createInstance()</code> or <code>new FighterAirDefense()</code>. </p>
 * <ul>
 *     <li> Country: Turkey (TUR) = <code>218</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30593; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6bc24e72. </p>
 * @see Country#TURKEY_TUR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense

 */
public final class FighterAirDefense extends EntityType
{
    /** Default constructor */
    public FighterAirDefense()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 30593, Fighter/Air Defense
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FighterAirDefense createInstance()
    {
            return new FighterAirDefense();
    }
}
