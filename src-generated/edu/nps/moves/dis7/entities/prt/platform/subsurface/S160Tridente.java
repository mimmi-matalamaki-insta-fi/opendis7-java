// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prt.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S160Tridente</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S160Tridente.createInstance()</code> or <code>new S160Tridente()</code>. </p>
 * <ul>
 *     <li> Country: Portugal (PRT) = <code>176</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: Type209PNclass  = <code>1</code>; </li>
 *     <li> Specific: S160Tridente  = <code>1</code>; </li>
 *     <li> Entity type uid: 23101; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1237e0be. </p>
 * @see Country#PORTUGAL_PRT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S160Tridente extends EntityType
{
    /** Default constructor */
    public S160Tridente()
    {
        setCountry(Country.PORTUGAL_PRT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23099, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 23100, Type 209PN class
        setSpecific((byte)1); // uid 23101, S160 Tridente
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S160Tridente createInstance()
    {
            return new S160Tridente();
    }
}
