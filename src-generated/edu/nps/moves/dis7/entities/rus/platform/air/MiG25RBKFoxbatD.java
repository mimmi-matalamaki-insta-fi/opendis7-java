// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MiG25RBKFoxbatD</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MiG25RBKFoxbatD.createInstance()</code> or <code>new MiG25RBKFoxbatD()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: MiG25Foxbat  = <code>4</code>; </li>
 *     <li> Specific: MiG25RBKFoxbatD  = <code>9</code>; </li>
 *     <li> Entity type uid: 13201; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65b66b08. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class MiG25RBKFoxbatD extends EntityType
{
    /** Default constructor */
    public MiG25RBKFoxbatD()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 13174, Fighter/Air Defense
        setSubCategory((byte)4); // uid 13192, MiG-25 Foxbat
        setSpecific((byte)9); // uid 13201, MiG-25RBK Foxbat D
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MiG25RBKFoxbatD createInstance()
    {
            return new MiG25RBKFoxbatD();
    }
}
