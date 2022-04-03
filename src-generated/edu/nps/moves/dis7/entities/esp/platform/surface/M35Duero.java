// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M35Duero</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M35Duero.createInstance()</code> or <code>new M35Duero()</code>. </p>
 * <ul>
 *     <li> Country: Spain (ESP) = <code>198</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship = <code>8</code>; </li>
 *     <li> SubCategory: SeguraClassMinehuntersMHC  = <code>1</code>; </li>
 *     <li> Specific: M35Duero  = <code>5</code>; </li>
 *     <li> Entity type uid: 33787; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7cdbaa50. </p>
 * @see Country#SPAIN_ESP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShip
 * @see SubCategory

 */
public final class M35Duero extends EntityType
{
    /** Default constructor */
    public M35Duero()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 19021, Mine Countermeasure Ship
        setSubCategory((byte)1); // uid 19022, Segura Class (Minehunters) (MHC)
        setSpecific((byte)5); // uid 33787, M35 Duero
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M35Duero createInstance()
    {
            return new M35Duero();
    }
}
