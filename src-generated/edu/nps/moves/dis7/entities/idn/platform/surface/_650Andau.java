// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_650Andau</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_650Andau.createInstance()</code> or <code>new _650Andau()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: AndauClassFPB57VariantII  = <code>6</code>; </li>
 *     <li> Specific: _650Andau  = <code>1</code>; </li>
 *     <li> Entity type uid: 31045; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7fc44dec. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _650Andau extends EntityType
{
    /** Default constructor */
    public _650Andau()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 31038, Light/Patrol Craft
        setSubCategory((byte)6); // uid 31044, Andau Class (FPB 57 Variant II)
        setSpecific((byte)1); // uid 31045, 650 Andau
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _650Andau createInstance()
    {
            return new _650Andau();
    }
}
