// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>O195WestraliaexA79HudsonCavalier</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>O195WestraliaexA79HudsonCavalier.createInstance()</code> or <code>new O195WestraliaexA79HudsonCavalier()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: AppleleafclasssupporttankersAOT  = <code>8</code>; </li>
 *     <li> Specific: O195WestraliaexA79HudsonCavalier  = <code>4</code>; </li>
 *     <li> Entity type uid: 15392; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4816ee24. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class O195WestraliaexA79HudsonCavalier extends EntityType
{
    /** Default constructor */
    public O195WestraliaexA79HudsonCavalier()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 15370, Auxiliary
        setSubCategory((byte)8); // uid 15388, Appleleaf class (support tankers (AOT))
        setSpecific((byte)4); // uid 15392, O 195 Westralia (ex. A79 Hudson Cavalier)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static O195WestraliaexA79HudsonCavalier createInstance()
    {
            return new O195WestraliaexA79HudsonCavalier();
    }
}
