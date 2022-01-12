// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EurocopterAS532Cougar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EurocopterAS532Cougar.createInstance()</code> or <code>new EurocopterAS532Cougar()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack Helicopter = <code>20</code>; </li>
 *     <li> SubCategory: EurocopterAS532Cougar  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 15819; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@353352b6. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackHelicopter
 * @see SubCategory

 */
public final class EurocopterAS532Cougar extends EntityType
{
    /** Default constructor */
    public EurocopterAS532Cougar()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 15818, Attack Helicopter
        setSubCategory((byte)1); // uid 15819, Eurocopter AS 532 Cougar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EurocopterAS532Cougar createInstance()
    {
            return new EurocopterAS532Cougar();
    }
}
