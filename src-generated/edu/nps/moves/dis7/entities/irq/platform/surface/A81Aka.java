// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irq.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A81Aka</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A81Aka.createInstance()</code> or <code>new A81Aka()</code>. </p>
 * <ul>
 *     <li> Country: Iraq (IRQ) = <code>102</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SpasilacClasssalvageship  = <code>2</code>; </li>
 *     <li> Specific: A81Aka  = <code>1</code>; </li>
 *     <li> Entity type uid: 18019; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3f23a3a0. </p>
 * @see Country#IRAQ_IRQ
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A81Aka extends EntityType
{
    /** Default constructor */
    public A81Aka()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18013, Auxiliary
        setSubCategory((byte)2); // uid 18018, Spasilac Class (salvage ship)
        setSpecific((byte)1); // uid 18019, A81 Aka
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A81Aka createInstance()
    {
            return new A81Aka();
    }
}
