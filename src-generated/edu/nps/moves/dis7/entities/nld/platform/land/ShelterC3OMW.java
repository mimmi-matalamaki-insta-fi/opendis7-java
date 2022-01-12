// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ShelterC3OMW</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ShelterC3OMW.createInstance()</code> or <code>new ShelterC3OMW()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: ShelterC3OMW  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27944; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@15b986cd. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class ShelterC3OMW extends EntityType
{
    /** Default constructor */
    public ShelterC3OMW()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 27942, Cargo Trailer
        setSubCategory((byte)2); // uid 27944, Shelter C3 OMW
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ShelterC3OMW createInstance()
    {
            return new ShelterC3OMW();
    }
}
