// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>VoyagerKC2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VoyagerKC2.createInstance()</code> or <code>new VoyagerKC2()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: AirbusA330MRTT  = <code>8</code>; </li>
 *     <li> Specific: VoyagerKC2  = <code>1</code>; </li>
 *     <li> Entity type uid: 26617; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3336e6b6. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class VoyagerKC2 extends EntityType
{
    /** Default constructor */
    public VoyagerKC2()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 15791, Cargo/Tanker
        setSubCategory((byte)8); // uid 24757, Airbus A330 MRTT
        setSpecific((byte)1); // uid 26617, Voyager KC2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VoyagerKC2 createInstance()
    {
            return new VoyagerKC2();
    }
}
