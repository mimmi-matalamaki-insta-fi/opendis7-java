// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.arg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P31Drummond</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P31Drummond.createInstance()</code> or <code>new P31Drummond()</code>. </p>
 * <ul>
 *     <li> Country: Argentina (ARG) = <code>10</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: DrummondClassA69  = <code>1</code>; </li>
 *     <li> Specific: P31Drummond  = <code>1</code>; </li>
 *     <li> Entity type uid: 31259; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9e89d68. </p>
 * @see Country#ARGENTINA_ARG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class P31Drummond extends EntityType
{
    /** Default constructor */
    public P31Drummond()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 31257, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 31258, Drummond Class (A-69)
        setSpecific((byte)1); // uid 31259, P 31 Drummond
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P31Drummond createInstance()
    {
            return new P31Drummond();
    }
}
