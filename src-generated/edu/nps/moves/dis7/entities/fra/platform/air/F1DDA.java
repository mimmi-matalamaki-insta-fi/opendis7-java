// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F1DDA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F1DDA.createInstance()</code> or <code>new F1DDA()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: MirageF1  = <code>1</code>; </li>
 *     <li> Specific: F1DDA  = <code>19</code>; </li>
 *     <li> Entity type uid: 15740; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c7a164b. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class F1DDA extends EntityType
{
    /** Default constructor */
    public F1DDA()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 15720, Fighter/Air Defense
        setSubCategory((byte)1); // uid 15721, Mirage F-1
        setSpecific((byte)19); // uid 15740, F1-DDA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F1DDA createInstance()
    {
            return new F1DDA();
    }
}
