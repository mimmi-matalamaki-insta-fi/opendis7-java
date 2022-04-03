// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gha.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NaaGbewaa</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NaaGbewaa.createInstance()</code> or <code>new NaaGbewaa()</code>. </p>
 * <ul>
 *     <li> Country: Ghana (GHA) = <code>79</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: AlbatrosClassType143143B  = <code>1</code>; </li>
 *     <li> Specific: NaaGbewaa  = <code>1</code>; </li>
 *     <li> Entity type uid: 27503; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b8233cd. </p>
 * @see Country#GHANA_GHA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class NaaGbewaa extends EntityType
{
    /** Default constructor */
    public NaaGbewaa()
    {
        setCountry(Country.GHANA_GHA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27501, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27502, Albatros Class (Type 143/143B)
        setSpecific((byte)1); // uid 27503, Naa Gbewaa
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NaaGbewaa createInstance()
    {
            return new NaaGbewaa();
    }
}
