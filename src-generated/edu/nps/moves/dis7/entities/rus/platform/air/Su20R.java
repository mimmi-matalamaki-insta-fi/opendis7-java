// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Su20R</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Su20R.createInstance()</code> or <code>new Su20R()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: Su20FitterCExportSu17  = <code>5</code>; </li>
 *     <li> Specific: Su20R  = <code>2</code>; </li>
 *     <li> Entity type uid: 13279; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@22367b8. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class Su20R extends EntityType
{
    /** Default constructor */
    public Su20R()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 13259, Attack/Strike
        setSubCategory((byte)5); // uid 13277, Su-20 Fitter C (Export Su-17)
        setSpecific((byte)2); // uid 13279, Su-20R
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Su20R createInstance()
    {
            return new Su20R();
    }
}
