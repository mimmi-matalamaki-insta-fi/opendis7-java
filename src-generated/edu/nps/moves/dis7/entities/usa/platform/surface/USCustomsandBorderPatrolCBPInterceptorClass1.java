// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>USCustomsandBorderPatrolCBPInterceptorClass1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>USCustomsandBorderPatrolCBPInterceptorClass1.createInstance()</code> or <code>new USCustomsandBorderPatrolCBPInterceptorClass1()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Private Motorboat = <code>84</code>; </li>
 *     <li> SubCategory: LargeMotorboatupto65ft198m  = <code>3</code>; </li>
 *     <li> Specific: USCustomsandBorderPatrolCBPInterceptorClass  = <code>1</code>; </li>
 *     <li> Entity type uid: 28480; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b409a79. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PrivateMotorboat
 * @see SubCategory

 */
public final class USCustomsandBorderPatrolCBPInterceptorClass1 extends EntityType
{
    /** Default constructor */
    public USCustomsandBorderPatrolCBPInterceptorClass1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 26437, Private Motorboat
        setSubCategory((byte)3); // uid 28479, Large Motorboat (up to 65ft/19.8m)
        setSpecific((byte)1); // uid 28480, U.S. Customs and Border Patrol (CBP) Interceptor Class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static USCustomsandBorderPatrolCBPInterceptorClass1 createInstance()
    {
            return new USCustomsandBorderPatrolCBPInterceptorClass1();
    }
}
