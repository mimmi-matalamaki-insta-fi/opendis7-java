// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DrugBaleMarijuana</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DrugBaleMarijuana.createInstance()</code> or <code>new DrugBaleMarijuana()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Contraband = <code>28</code>; </li>
 *     <li> SubCategory: DrugBale  = <code>1</code>; </li>
 *     <li> Specific: DrugBaleMarijuana  = <code>1</code>; </li>
 *     <li> Entity type uid: 28513; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59c08cf1. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Contraband
 * @see SubCategory

 */
public final class DrugBaleMarijuana extends EntityType
{
    /** Default constructor */
    public DrugBaleMarijuana()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 28511, Contraband
        setSubCategory((byte)1); // uid 28512, Drug Bale
        setSpecific((byte)1); // uid 28513, Drug Bale, Marijuana
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DrugBaleMarijuana createInstance()
    {
            return new DrugBaleMarijuana();
    }
}
