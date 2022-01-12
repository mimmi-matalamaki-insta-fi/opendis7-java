// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irq.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SawariClassinshorepatrolboat</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SawariClassinshorepatrolboat.createInstance()</code> or <code>new SawariClassinshorepatrolboat()</code>. </p>
 * <ul>
 *     <li> Country: Iraq (IRQ) = <code>102</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: SawariClassinshorepatrolboat  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18010; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6d304f9d. </p>
 * @see Country#IRAQ_IRQ
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class SawariClassinshorepatrolboat extends EntityType
{
    /** Default constructor */
    public SawariClassinshorepatrolboat()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18007, Light/Patrol Craft
        setSubCategory((byte)3); // uid 18010, Sawari Class (inshore patrol boat)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SawariClassinshorepatrolboat createInstance()
    {
            return new SawariClassinshorepatrolboat();
    }
}
