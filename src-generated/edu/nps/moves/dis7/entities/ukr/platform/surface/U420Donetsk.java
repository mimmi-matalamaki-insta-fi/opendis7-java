// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>U420Donetsk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>U420Donetsk.createInstance()</code> or <code>new U420Donetsk()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Cushion/Surface Effect = <code>15</code>; </li>
 *     <li> SubCategory: ZubrClass  = <code>1</code>; </li>
 *     <li> Specific: U420Donetsk  = <code>1</code>; </li>
 *     <li> Entity type uid: 28802; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f5cf29b. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirCushionSurfaceEffect
 * @see SubCategory

 */
public final class U420Donetsk extends EntityType
{
    /** Default constructor */
    public U420Donetsk()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 28800, Air Cushion/Surface Effect
        setSubCategory((byte)1); // uid 28801, Zubr Class
        setSpecific((byte)1); // uid 28802, U-420 Donetsk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static U420Donetsk createInstance()
    {
            return new U420Donetsk();
    }
}
