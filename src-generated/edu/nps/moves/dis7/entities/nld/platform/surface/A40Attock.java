// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A40Attock</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A40Attock.createInstance()</code> or <code>new A40Attock()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: TankerAOT  = <code>3</code>; </li>
 *     <li> Specific: A40Attock  = <code>1</code>; </li>
 *     <li> Entity type uid: 18946; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45f24169. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A40Attock extends EntityType
{
    /** Default constructor */
    public A40Attock()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18942, Auxiliary
        setSubCategory((byte)3); // uid 18945, Tanker (AOT)
        setSpecific((byte)1); // uid 18946, A40 Attock
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A40Attock createInstance()
    {
            return new A40Attock();
    }
}
