// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MiG23UBFloggerC</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MiG23UBFloggerC.createInstance()</code> or <code>new MiG23UBFloggerC()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: MiG2324Flogger  = <code>5</code>; </li>
 *     <li> Specific: MiG23UBFloggerC  = <code>3</code>; </li>
 *     <li> Entity type uid: 13211; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12aa4996. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class MiG23UBFloggerC extends EntityType
{
    /** Default constructor */
    public MiG23UBFloggerC()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 13174, Fighter/Air Defense
        setSubCategory((byte)5); // uid 13208, MiG-23/24 Flogger
        setSpecific((byte)3); // uid 13211, MiG-23UB Flogger C
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MiG23UBFloggerC createInstance()
    {
            return new MiG23UBFloggerC();
    }
}
