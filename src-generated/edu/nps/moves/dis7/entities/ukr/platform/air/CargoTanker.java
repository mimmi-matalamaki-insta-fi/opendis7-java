// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CargoTanker</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CargoTanker.createInstance()</code> or <code>new CargoTanker()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29230; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3eb3232b. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker

 */
public final class CargoTanker extends EntityType
{
    /** Default constructor */
    public CargoTanker()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 29230, Cargo/Tanker
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CargoTanker createInstance()
    {
            return new CargoTanker();
    }
}
