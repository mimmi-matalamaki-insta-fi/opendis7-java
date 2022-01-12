// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P3404AlSanbouk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P3404AlSanbouk.createInstance()</code> or <code>new P3404AlSanbouk()</code>. </p>
 * <ul>
 *     <li> Country: Kuwait (KWT) = <code>121</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: TNC45Typefastattackcraftmissile  = <code>2</code>; </li>
 *     <li> Specific: P3404AlSanbouk  = <code>1</code>; </li>
 *     <li> Entity type uid: 17919; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@53bc1328. </p>
 * @see Country#KUWAIT_KWT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P3404AlSanbouk extends EntityType
{
    /** Default constructor */
    public P3404AlSanbouk()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17912, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17918, TNC 45 Type (fast attack craft-missile)
        setSpecific((byte)1); // uid 17919, P3404 Al Sanbouk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P3404AlSanbouk createInstance()
    {
            return new P3404AlSanbouk();
    }
}
