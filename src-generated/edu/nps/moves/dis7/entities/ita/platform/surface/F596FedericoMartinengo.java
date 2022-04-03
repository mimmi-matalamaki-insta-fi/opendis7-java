// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F596FedericoMartinengo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F596FedericoMartinengo.createInstance()</code> or <code>new F596FedericoMartinengo()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: BergaminiClass  = <code>1</code>; </li>
 *     <li> Specific: F596FedericoMartinengo  = <code>7</code>; </li>
 *     <li> Entity type uid: 33135; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@61a002b1. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F596FedericoMartinengo extends EntityType
{
    /** Default constructor */
    public F596FedericoMartinengo()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28660, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 28661, Bergamini Class
        setSpecific((byte)7); // uid 33135, F596 Federico Martinengo
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F596FedericoMartinengo createInstance()
    {
            return new F596FedericoMartinengo();
    }
}
