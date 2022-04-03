// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M642Cassiopee</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M642Cassiopee.createInstance()</code> or <code>new M642Cassiopee()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship / Craft = <code>8</code>; </li>
 *     <li> SubCategory: EridanTripartiteclassminehunters  = <code>2</code>; </li>
 *     <li> Specific: M642Cassiopee  = <code>2</code>; </li>
 *     <li> Entity type uid: 15988; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6e005dc9. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M642Cassiopee extends EntityType
{
    /** Default constructor */
    public M642Cassiopee()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 15978, Mine Countermeasure Ship / Craft
        setSubCategory((byte)2); // uid 15986, Eridan (Tripartite) class (minehunters)
        setSpecific((byte)2); // uid 15988, M 642 Cassiopee
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M642Cassiopee createInstance()
    {
            return new M642Cassiopee();
    }
}
