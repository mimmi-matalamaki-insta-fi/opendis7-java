// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TAOT5913EmpireState</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TAOT5913EmpireState.createInstance()</code> or <code>new TAOT5913EmpireState()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary, Merchant Marine = <code>17</code>; </li>
 *     <li> SubCategory: TankersOceanTransportation  = <code>13</code>; </li>
 *     <li> Specific: TAOT5913EmpireState  = <code>14</code>; </li>
 *     <li> Entity type uid: 34094; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e0d1dc4. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AuxiliaryMerchantMarine
 * @see SubCategory

 */
public final class TAOT5913EmpireState extends EntityType
{
    /** Default constructor */
    public TAOT5913EmpireState()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 11770, Auxiliary, Merchant Marine
        setSubCategory((byte)13); // uid 11840, Tankers (Ocean Transportation)
        setSpecific((byte)14); // uid 34094, TAOT 5913 Empire State
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TAOT5913EmpireState createInstance()
    {
            return new TAOT5913EmpireState();
    }
}
