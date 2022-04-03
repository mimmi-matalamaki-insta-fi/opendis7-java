// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D643Jeandevienne</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D643Jeandevienne.createInstance()</code> or <code>new D643Jeandevienne()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer (Fregates or Escorteurs D'escadres) = <code>4</code>; </li>
 *     <li> SubCategory: GeorgesLeyguesClassTypef70ASW  = <code>1</code>; </li>
 *     <li> Specific: D643Jeandevienne  = <code>4</code>; </li>
 *     <li> Entity type uid: 15934; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@10f7f7de. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyerFregatesorEscorteursDescadres
 * @see SubCategory

 */
public final class D643Jeandevienne extends EntityType
{
    /** Default constructor */
    public D643Jeandevienne()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 15929, Guided Missile Destroyer (Fregates or Escorteurs D'escadres)
        setSubCategory((byte)1); // uid 15930, Georges Leygues Class (Type f 70 (ASW))
        setSpecific((byte)4); // uid 15934, D 643 Jean de vienne
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D643Jeandevienne createInstance()
    {
            return new D643Jeandevienne();
    }
}
