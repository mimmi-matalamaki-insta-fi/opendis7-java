// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>T64Bvwmineplowroller</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>T64Bvwmineplowroller.createInstance()</code> or <code>new T64Bvwmineplowroller()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: T64MBT  = <code>3</code>; </li>
 *     <li> Specific: T64Bvwmineplowroller  = <code>9</code>; </li>
 *     <li> Entity type uid: 12545; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@388b401d. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class T64Bvwmineplowroller extends EntityType
{
    /** Default constructor */
    public T64Bvwmineplowroller()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 12510, Tank
        setSubCategory((byte)3); // uid 12536, T-64 MBT
        setSpecific((byte)9); // uid 12545, T-64 Bv w/mine plow roller
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static T64Bvwmineplowroller createInstance()
    {
            return new T64Bvwmineplowroller();
    }
}
