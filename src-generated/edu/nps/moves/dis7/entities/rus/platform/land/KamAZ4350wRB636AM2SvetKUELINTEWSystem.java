// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KamAZ4350wRB636AM2SvetKUELINTEWSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KamAZ4350wRB636AM2SvetKUELINTEWSystem.createInstance()</code> or <code>new KamAZ4350wRB636AM2SvetKUELINTEWSystem()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: KamAZ4350  = <code>42</code>; </li>
 *     <li> Specific: KamAZ4350wRB636AM2SvetKUELINTEWSystem  = <code>1</code>; </li>
 *     <li> Entity type uid: 30586; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78830d9a. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class KamAZ4350wRB636AM2SvetKUELINTEWSystem extends EntityType
{
    /** Default constructor */
    public KamAZ4350wRB636AM2SvetKUELINTEWSystem()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)42); // uid 30585, KamAZ-4350
        setSpecific((byte)1); // uid 30586, KamAZ-4350 w/ RB-636AM2 Svet-KU ELINT EW System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KamAZ4350wRB636AM2SvetKUELINTEWSystem createInstance()
    {
            return new KamAZ4350wRB636AM2SvetKUELINTEWSystem();
    }
}
