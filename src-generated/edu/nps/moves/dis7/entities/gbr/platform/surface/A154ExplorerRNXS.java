// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A154ExplorerRNXS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A154ExplorerRNXS.createInstance()</code> or <code>new A154ExplorerRNXS()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: Archerclasstrainingandpatrolcraft  = <code>6</code>; </li>
 *     <li> Specific: A154ExplorerRNXS  = <code>12</code>; </li>
 *     <li> Entity type uid: 15308; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4c1d59cd. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Lightpatrolcraft
 * @see SubCategory

 */
public final class A154ExplorerRNXS extends EntityType
{
    /** Default constructor */
    public A154ExplorerRNXS()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 15274, Light/patrol craft
        setSubCategory((byte)6); // uid 15296, Archer class (training and patrol craft)
        setSpecific((byte)12); // uid 15308, A 154 Explorer (RNXS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A154ExplorerRNXS createInstance()
    {
            return new A154ExplorerRNXS();
    }
}
