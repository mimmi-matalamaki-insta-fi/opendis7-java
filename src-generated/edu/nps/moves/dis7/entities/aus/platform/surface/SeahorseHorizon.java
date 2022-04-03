// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SeahorseHorizon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SeahorseHorizon.createInstance()</code> or <code>new SeahorseHorizon()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: NavigationalTrainingShips  = <code>9</code>; </li>
 *     <li> Specific: SeahorseHorizon  = <code>1</code>; </li>
 *     <li> Entity type uid: 30379; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c09711b. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class SeahorseHorizon extends EntityType
{
    /** Default constructor */
    public SeahorseHorizon()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17594, Auxiliary
        setSubCategory((byte)9); // uid 30378, Navigational Training Ships
        setSpecific((byte)1); // uid 30379, Seahorse Horizon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SeahorseHorizon createInstance()
    {
            return new SeahorseHorizon();
    }
}
