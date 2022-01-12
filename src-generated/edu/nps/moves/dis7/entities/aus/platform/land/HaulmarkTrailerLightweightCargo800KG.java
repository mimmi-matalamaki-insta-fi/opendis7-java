// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HaulmarkTrailerLightweightCargo800KG</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HaulmarkTrailerLightweightCargo800KG.createInstance()</code> or <code>new HaulmarkTrailerLightweightCargo800KG()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: _0512Ton  = <code>2</code>; </li>
 *     <li> Specific: HaulmarkTrailerLightweightCargo800KG  = <code>1</code>; </li>
 *     <li> Entity type uid: 29387; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2471cca7. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class HaulmarkTrailerLightweightCargo800KG extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerLightweightCargo800KG()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 29384, Cargo Trailer
        setSubCategory((byte)2); // uid 29386, 0.51 - 2 Ton
        setSpecific((byte)1); // uid 29387, Haulmark - Trailer, Lightweight Cargo, 800KG
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HaulmarkTrailerLightweightCargo800KG createInstance()
    {
            return new HaulmarkTrailerLightweightCargo800KG();
    }
}
