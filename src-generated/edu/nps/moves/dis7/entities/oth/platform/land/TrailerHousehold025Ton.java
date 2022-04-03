// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TrailerHousehold025Ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TrailerHousehold025Ton.createInstance()</code> or <code>new TrailerHousehold025Ton()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trailer = <code>89</code>; </li>
 *     <li> SubCategory: TrailerHousehold  = <code>24</code>; </li>
 *     <li> Specific: TrailerHousehold025Ton  = <code>1</code>; </li>
 *     <li> Entity type uid: 31626; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1a5f7e7c. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trailer
 * @see SubCategory

 */
public final class TrailerHousehold025Ton extends EntityType
{
    /** Default constructor */
    public TrailerHousehold025Ton()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)89); // uid 25929, Trailer
        setSubCategory((byte)24); // uid 31625, Trailer, Household
        setSpecific((byte)1); // uid 31626, Trailer, Household, 0.25 Ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TrailerHousehold025Ton createInstance()
    {
            return new TrailerHousehold025Ton();
    }
}
