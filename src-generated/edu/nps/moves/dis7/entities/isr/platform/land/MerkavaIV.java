// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MerkavaIV</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MerkavaIV.createInstance()</code> or <code>new MerkavaIV()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: Merkava  = <code>1</code>; </li>
 *     <li> Specific: MerkavaIV  = <code>4</code>; </li>
 *     <li> Entity type uid: 23505; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@556d0826. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class MerkavaIV extends EntityType
{
    /** Default constructor */
    public MerkavaIV()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 23500, Tank
        setSubCategory((byte)1); // uid 23501, Merkava
        setSpecific((byte)4); // uid 23505, Merkava IV
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MerkavaIV createInstance()
    {
            return new MerkavaIV();
    }
}
