// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P301Inttisar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P301Inttisar.createInstance()</code> or <code>new P301Inttisar()</code>. </p>
 * <ul>
 *     <li> Country: Kuwait (KWT) = <code>121</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: OPV310Classlargepatrolcraft  = <code>1</code>; </li>
 *     <li> Specific: P301Inttisar  = <code>1</code>; </li>
 *     <li> Entity type uid: 17914; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f9e1534. </p>
 * @see Country#KUWAIT_KWT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P301Inttisar extends EntityType
{
    /** Default constructor */
    public P301Inttisar()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17912, Light/Patrol Craft
        setSubCategory((byte)1); // uid 17913, OPV 310 Class (large patrol craft)
        setSpecific((byte)1); // uid 17914, P301 Inttisar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P301Inttisar createInstance()
    {
            return new P301Inttisar();
    }
}
