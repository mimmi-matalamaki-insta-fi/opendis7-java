// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.grc.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S116Poseidon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S116Poseidon.createInstance()</code> or <code>new S116Poseidon()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: Glavkosclass  = <code>1</code>; </li>
 *     <li> Specific: S116Poseidon  = <code>5</code>; </li>
 *     <li> Entity type uid: 23396; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@40c80397. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S116Poseidon extends EntityType
{
    /** Default constructor */
    public S116Poseidon()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23390, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 23391, Glavkos class
        setSpecific((byte)5); // uid 23396, S116 Poseidon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S116Poseidon createInstance()
    {
            return new S116Poseidon();
    }
}
