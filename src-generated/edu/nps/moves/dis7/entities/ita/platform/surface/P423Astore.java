// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P423Astore</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P423Astore.createInstance()</code> or <code>new P423Astore()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Hydrofoil = <code>14</code>; </li>
 *     <li> SubCategory: SparvieroClassHydrofoilMissile  = <code>1</code>; </li>
 *     <li> Specific: P423Astore  = <code>3</code>; </li>
 *     <li> Entity type uid: 18370; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1992eaf4. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Hydrofoil
 * @see SubCategory

 */
public final class P423Astore extends EntityType
{
    /** Default constructor */
    public P423Astore()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 18366, Hydrofoil
        setSubCategory((byte)1); // uid 18367, Sparviero Class (Hydrofoil-Missile)
        setSpecific((byte)3); // uid 18370, P423 Astore
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P423Astore createInstance()
    {
            return new P423Astore();
    }
}
