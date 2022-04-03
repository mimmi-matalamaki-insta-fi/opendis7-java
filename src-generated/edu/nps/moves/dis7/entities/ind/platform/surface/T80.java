// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>T80</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>T80.createInstance()</code> or <code>new T80()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft(PC) = <code>7</code>; </li>
 *     <li> SubCategory: SuperDvoraMkIIClassPFC  = <code>6</code>; </li>
 *     <li> Specific: T80  = <code>1</code>; </li>
 *     <li> Entity type uid: 18843; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6111ba37. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraftPC
 * @see SubCategory

 */
public final class T80 extends EntityType
{
    /** Default constructor */
    public T80()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18833, Light/Patrol Craft(PC)
        setSubCategory((byte)6); // uid 18842, Super Dvora MkII Class (PFC)
        setSpecific((byte)1); // uid 18843, T80
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static T80 createInstance()
    {
            return new T80();
    }
}
