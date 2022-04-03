// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A375Zeus</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A375Zeus.createInstance()</code> or <code>new A375Zeus()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Ouranosclass  = <code>2</code>; </li>
 *     <li> Specific: A375Zeus  = <code>3</code>; </li>
 *     <li> Entity type uid: 23343; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30bcf3c1. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A375Zeus extends EntityType
{
    /** Default constructor */
    public A375Zeus()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 23337, Auxiliary
        setSubCategory((byte)2); // uid 23340, Ouranos class
        setSpecific((byte)3); // uid 23343, A375 Zeus
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A375Zeus createInstance()
    {
            return new A375Zeus();
    }
}
