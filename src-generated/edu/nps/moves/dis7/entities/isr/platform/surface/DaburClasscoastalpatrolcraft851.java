// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DaburClasscoastalpatrolcraft851</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DaburClasscoastalpatrolcraft851.createInstance()</code> or <code>new DaburClasscoastalpatrolcraft851()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: DaburClasscoastalpatrolcraft  = <code>6</code>; </li>
 *     <li> Specific: _851  = <code>2</code>; </li>
 *     <li> Entity type uid: 23765; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@485a3466. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class DaburClasscoastalpatrolcraft851 extends EntityType
{
    /** Default constructor */
    public DaburClasscoastalpatrolcraft851()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18214, Light/Patrol Craft
        setSubCategory((byte)6); // uid 18240, Dabur Class (coastal patrol craft)
        setSpecific((byte)2); // uid 23765, 851
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DaburClasscoastalpatrolcraft851 createInstance()
    {
            return new DaburClasscoastalpatrolcraft851();
    }
}
