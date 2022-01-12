// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lva.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M06Talivaldis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M06Talivaldis.createInstance()</code> or <code>new M06Talivaldis()</code>. </p>
 * <ul>
 *     <li> Country: Latvia (LVA) = <code>254</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: AlkmaarTripartiteClass  = <code>3</code>; </li>
 *     <li> Specific: M06Talivaldis  = <code>3</code>; </li>
 *     <li> Entity type uid: 28304; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63a5e46c. </p>
 * @see Country#LATVIA_LVA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M06Talivaldis extends EntityType
{
    /** Default constructor */
    public M06Talivaldis()
    {
        setCountry(Country.LATVIA_LVA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27786, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 28301, Alkmaar (Tripartite) Class
        setSpecific((byte)3); // uid 28304, M-06 Talivaldis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M06Talivaldis createInstance()
    {
            return new M06Talivaldis();
    }
}
