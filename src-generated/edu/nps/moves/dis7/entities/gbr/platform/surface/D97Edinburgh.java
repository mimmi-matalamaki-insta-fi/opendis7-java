// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D97Edinburgh</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D97Edinburgh.createInstance()</code> or <code>new D97Edinburgh()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: Type42  = <code>1</code>; </li>
 *     <li> Specific: D97Edinburgh  = <code>11</code>; </li>
 *     <li> Entity type uid: 15213; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@41fa769c. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileDestroyer
 * @see SubCategory

 */
public final class D97Edinburgh extends EntityType
{
    /** Default constructor */
    public D97Edinburgh()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 15201, Guided-missile Destroyer
        setSubCategory((byte)1); // uid 15202, Type 42
        setSpecific((byte)11); // uid 15213, D 97 Edinburgh
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D97Edinburgh createInstance()
    {
            return new D97Edinburgh();
    }
}
