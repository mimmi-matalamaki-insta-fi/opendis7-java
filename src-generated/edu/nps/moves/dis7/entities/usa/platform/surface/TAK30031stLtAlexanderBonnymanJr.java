// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TAK30031stLtAlexanderBonnymanJr</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TAK30031stLtAlexanderBonnymanJr.createInstance()</code> or <code>new TAK30031stLtAlexanderBonnymanJr()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary, Merchant Marine = <code>17</code>; </li>
 *     <li> SubCategory: MaritimePrepositioningShipsMPS  = <code>9</code>; </li>
 *     <li> Specific: TAK30031stLtAlexanderBonnymanJr  = <code>4</code>; </li>
 *     <li> Entity type uid: 11818; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3887c7d7. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AuxiliaryMerchantMarine
 * @see SubCategory

 */
public final class TAK30031stLtAlexanderBonnymanJr extends EntityType
{
    /** Default constructor */
    public TAK30031stLtAlexanderBonnymanJr()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 11770, Auxiliary, Merchant Marine
        setSubCategory((byte)9); // uid 11814, Maritime Prepositioning Ships (MPS)
        setSpecific((byte)4); // uid 11818, TAK 3003 1st Lt Alexander Bonnyman Jr.
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TAK30031stLtAlexanderBonnymanJr createInstance()
    {
            return new TAK30031stLtAlexanderBonnymanJr();
    }
}
