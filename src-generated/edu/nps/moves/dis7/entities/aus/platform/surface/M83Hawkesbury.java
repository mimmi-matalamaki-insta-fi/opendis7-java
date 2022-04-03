// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M83Hawkesbury</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M83Hawkesbury.createInstance()</code> or <code>new M83Hawkesbury()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: HuonClassMinehuntersCoastal  = <code>1</code>; </li>
 *     <li> Specific: M83Hawkesbury  = <code>2</code>; </li>
 *     <li> Entity type uid: 17569; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3f2a3a5. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M83Hawkesbury extends EntityType
{
    /** Default constructor */
    public M83Hawkesbury()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17565, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 17567, Huon Class (Minehunters-Coastal)
        setSpecific((byte)2); // uid 17569, M 83 Hawkesbury
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M83Hawkesbury createInstance()
    {
            return new M83Hawkesbury();
    }
}
