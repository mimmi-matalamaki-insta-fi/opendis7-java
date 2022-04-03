// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CG20RKTurner</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CG20RKTurner.createInstance()</code> or <code>new CG20RKTurner()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Cruiser = <code>3</code>; </li>
 *     <li> SubCategory: LeahyClass  = <code>7</code>; </li>
 *     <li> Specific: CG20RKTurner  = <code>5</code>; </li>
 *     <li> Entity type uid: 11371; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b6141f0. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileCruiser
 * @see SubCategory

 */
public final class CG20RKTurner extends EntityType
{
    /** Default constructor */
    public CG20RKTurner()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)3); // uid 11323, Guided Missile Cruiser
        setSubCategory((byte)7); // uid 11366, Leahy Class
        setSpecific((byte)5); // uid 11371, CG 20 R. K. Turner
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CG20RKTurner createInstance()
    {
            return new CG20RKTurner();
    }
}
