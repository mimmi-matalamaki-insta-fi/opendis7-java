// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MK58Mod1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MK58Mod1.createInstance()</code> or <code>new MK58Mod1()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Smoke = <code>8</code>; </li>
 *     <li> SubCategory: SmokeMarker  = <code>2</code>; </li>
 *     <li> Specific: MK58LongBurningMarineMarker  = <code>2</code>; </li>
 *     <li> Entity type uid: 25000; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@32069394. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Smoke
 * @see SubCategory

 */
public final class MK58Mod1 extends EntityType
{
    /** Default constructor */
    public MK58Mod1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 24992, Smoke
        setSubCategory((byte)2); // uid 24993, Smoke Marker
        setSpecific((byte)2); // uid 24998, MK 58 Long Burning Marine Marker
        setExtra((byte)2); // uid 25000, MK 58 Mod 1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MK58Mod1 createInstance()
    {
            return new MK58Mod1();
    }
}
