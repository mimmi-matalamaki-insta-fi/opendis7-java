// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F237Westminster</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F237Westminster.createInstance()</code> or <code>new F237Westminster()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: DukeclassType23  = <code>1</code>; </li>
 *     <li> Specific: F237Westminster  = <code>8</code>; </li>
 *     <li> Entity type uid: 15231; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4087c7fc. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileFrigate
 * @see SubCategory

 */
public final class F237Westminster extends EntityType
{
    /** Default constructor */
    public F237Westminster()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 15222, Guided-missile Frigate
        setSubCategory((byte)1); // uid 15223, Duke class (Type 23)
        setSpecific((byte)8); // uid 15231, F 237 Westminster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F237Westminster createInstance()
    {
            return new F237Westminster();
    }
}
