// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CP251</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CP251.createInstance()</code> or <code>new CP251()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: GuardiaCostieraCapitaneriaDiportoCoastGuard  = <code>27</code>; </li>
 *     <li> Specific: CP251  = <code>2</code>; </li>
 *     <li> Entity type uid: 18567; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@fac80. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class CP251 extends EntityType
{
    /** Default constructor */
    public CP251()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18374, Auxiliary
        setSubCategory((byte)27); // uid 18565, Guardia Costiera-Capitaneria Di porto (Coast Guard)
        setSpecific((byte)2); // uid 18567, CP 251
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CP251 createInstance()
    {
            return new CP251();
    }
}
