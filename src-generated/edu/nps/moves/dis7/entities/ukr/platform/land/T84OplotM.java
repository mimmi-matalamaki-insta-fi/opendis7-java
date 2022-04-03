// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>T84OplotM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>T84OplotM.createInstance()</code> or <code>new T84OplotM()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: T84MBT  = <code>1</code>; </li>
 *     <li> Specific: T84OplotM  = <code>4</code>; </li>
 *     <li> Entity type uid: 29843; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@365cdacf. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class T84OplotM extends EntityType
{
    /** Default constructor */
    public T84OplotM()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 29838, Tank
        setSubCategory((byte)1); // uid 29839, T-84 MBT
        setSpecific((byte)4); // uid 29843, T-84 Oplot-M
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static T84OplotM createInstance()
    {
            return new T84OplotM();
    }
}
