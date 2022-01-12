// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>T84</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>T84.createInstance()</code> or <code>new T84()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: T84MBT  = <code>1</code>; </li>
 *     <li> Specific: T84  = <code>1</code>; </li>
 *     <li> Entity type uid: 29840; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@788ba63e. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class T84 extends EntityType
{
    /** Default constructor */
    public T84()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 29838, Tank
        setSubCategory((byte)1); // uid 29839, T-84 MBT
        setSpecific((byte)1); // uid 29840, T-84
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static T84 createInstance()
    {
            return new T84();
    }
}
