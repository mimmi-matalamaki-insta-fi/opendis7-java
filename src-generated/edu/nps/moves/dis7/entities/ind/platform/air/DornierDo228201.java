// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DornierDo228201</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DornierDo228201.createInstance()</code> or <code>new DornierDo228201()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: DornierDo228  = <code>1</code>; </li>
 *     <li> Specific: DornierDo228201  = <code>1</code>; </li>
 *     <li> Entity type uid: 31715; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3700ec9c. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class DornierDo228201 extends EntityType
{
    /** Default constructor */
    public DornierDo228201()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 31713, Cargo/Tanker
        setSubCategory((byte)1); // uid 31714, Dornier Do 228
        setSpecific((byte)1); // uid 31715, Dornier Do 228-201
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DornierDo228201 createInstance()
    {
            return new DornierDo228201();
    }
}
