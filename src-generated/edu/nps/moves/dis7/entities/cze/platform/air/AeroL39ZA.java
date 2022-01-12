// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.cze.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AeroL39ZA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AeroL39ZA.createInstance()</code> or <code>new AeroL39ZA()</code>. </p>
 * <ul>
 *     <li> Country: Czech Republic (CZE) = <code>267</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: AeroL39ZAlbatros  = <code>1</code>; </li>
 *     <li> Specific: AeroL39ZA  = <code>2</code>; </li>
 *     <li> Entity type uid: 30090; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37883b97. </p>
 * @see Country#CZECH_REPUBLIC_CZE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class AeroL39ZA extends EntityType
{
    /** Default constructor */
    public AeroL39ZA()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 30087, Attack/Strike
        setSubCategory((byte)1); // uid 30088, Aero L-39Z Albatros
        setSpecific((byte)2); // uid 30090, Aero L-39ZA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AeroL39ZA createInstance()
    {
            return new AeroL39ZA();
    }
}
