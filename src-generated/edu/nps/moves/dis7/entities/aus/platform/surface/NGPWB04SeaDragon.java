// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NGPWB04SeaDragon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NGPWB04SeaDragon.createInstance()</code> or <code>new NGPWB04SeaDragon()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Steber43NavalGeneralPurposeWorkboats  = <code>1</code>; </li>
 *     <li> Specific: NGPWB04SeaDragon  = <code>4</code>; </li>
 *     <li> Entity type uid: 29932; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f560810. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class NGPWB04SeaDragon extends EntityType
{
    /** Default constructor */
    public NGPWB04SeaDragon()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 29927, Utility
        setSubCategory((byte)1); // uid 29928, Steber 43 Naval General Purpose Workboats
        setSpecific((byte)4); // uid 29932, NGPWB 04 Sea Dragon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NGPWB04SeaDragon createInstance()
    {
            return new NGPWB04SeaDragon();
    }
}
