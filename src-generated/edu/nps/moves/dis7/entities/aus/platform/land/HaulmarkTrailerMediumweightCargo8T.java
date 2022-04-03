// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HaulmarkTrailerMediumweightCargo8T</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HaulmarkTrailerMediumweightCargo8T.createInstance()</code> or <code>new HaulmarkTrailerMediumweightCargo8T()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: _50210Ton  = <code>4</code>; </li>
 *     <li> Specific: HaulmarkTrailerMediumweightCargo8T  = <code>1</code>; </li>
 *     <li> Entity type uid: 29391; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31b7dea0. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class HaulmarkTrailerMediumweightCargo8T extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerMediumweightCargo8T()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 29384, Cargo Trailer
        setSubCategory((byte)4); // uid 29390, 5.02 - 10 Ton
        setSpecific((byte)1); // uid 29391, Haulmark - Trailer, Mediumweight Cargo, 8T
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HaulmarkTrailerMediumweightCargo8T createInstance()
    {
            return new HaulmarkTrailerMediumweightCargo8T();
    }
}
