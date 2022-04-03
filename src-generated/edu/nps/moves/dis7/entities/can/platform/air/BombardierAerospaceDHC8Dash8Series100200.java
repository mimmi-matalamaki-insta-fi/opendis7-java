// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BombardierAerospaceDHC8Dash8Series100200</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BombardierAerospaceDHC8Dash8Series100200.createInstance()</code> or <code>new BombardierAerospaceDHC8Dash8Series100200()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg) = <code>86</code>; </li>
 *     <li> SubCategory: TwinEngineTurboprop  = <code>22</code>; </li>
 *     <li> Specific: BombardierAerospaceDHC8Dash8Series100200  = <code>1</code>; </li>
 *     <li> Entity type uid: 23880; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@371a67ec. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftMediumupto41000lbs18597kg
 * @see SubCategory

 */
public final class BombardierAerospaceDHC8Dash8Series100200 extends EntityType
{
    /** Default constructor */
    public BombardierAerospaceDHC8Dash8Series100200()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)86); // uid 23878, Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg)
        setSubCategory((byte)22); // uid 23879, Twin Engine Turboprop
        setSpecific((byte)1); // uid 23880, Bombardier Aerospace DHC-8 Dash 8 Series 100, 200
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BombardierAerospaceDHC8Dash8Series100200 createInstance()
    {
            return new BombardierAerospaceDHC8Dash8Series100200();
    }
}
