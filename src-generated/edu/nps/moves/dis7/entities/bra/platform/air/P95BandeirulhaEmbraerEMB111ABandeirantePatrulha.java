// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P95BandeirulhaEmbraerEMB111ABandeirantePatrulha</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P95BandeirulhaEmbraerEMB111ABandeirantePatrulha.createInstance()</code> or <code>new P95BandeirulhaEmbraerEMB111ABandeirantePatrulha()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: ASW/Patrol/Observation = <code>5</code>; </li>
 *     <li> SubCategory: P95BandeirulhaEmbraerEMB111ABandeirantePatrulha  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29152; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4fe3c938. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ASWPatrolObservation
 * @see SubCategory

 */
public final class P95BandeirulhaEmbraerEMB111ABandeirantePatrulha extends EntityType
{
    /** Default constructor */
    public P95BandeirulhaEmbraerEMB111ABandeirantePatrulha()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 25696, ASW/Patrol/Observation
        setSubCategory((byte)2); // uid 29152, P-95 Bandeirulha / Embraer EMB 111A Bandeirante Patrulha
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P95BandeirulhaEmbraerEMB111ABandeirantePatrulha createInstance()
    {
            return new P95BandeirulhaEmbraerEMB111ABandeirantePatrulha();
    }
}
