// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ATR42300</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ATR42300.createInstance()</code> or <code>new ATR42300()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg) = <code>86</code>; </li>
 *     <li> SubCategory: TwinEngineTurboprop  = <code>22</code>; </li>
 *     <li> Specific: ATR42  = <code>1</code>; </li>
 *     <li> Entity type uid: 24282; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4b34fff9. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftMediumupto41000lbs18597kg
 * @see SubCategory

 */
public final class ATR42300 extends EntityType
{
    /** Default constructor */
    public ATR42300()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)86); // uid 24279, Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg)
        setSubCategory((byte)22); // uid 24280, Twin Engine Turboprop
        setSpecific((byte)1); // uid 24281, ATR 42
        setExtra((byte)1); // uid 24282, ATR 42-300
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ATR42300 createInstance()
    {
            return new ATR42300();
    }
}
