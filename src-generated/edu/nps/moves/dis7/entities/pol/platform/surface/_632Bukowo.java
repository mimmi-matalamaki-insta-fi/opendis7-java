// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_632Bukowo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_632Bukowo.createInstance()</code> or <code>new _632Bukowo()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: GoploNotecClass  = <code>1</code>; </li>
 *     <li> Specific: _632Bukowo  = <code>3</code>; </li>
 *     <li> Entity type uid: 23066; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64bfd6fd. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _632Bukowo extends EntityType
{
    /** Default constructor */
    public _632Bukowo()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23062, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 23063, Goplo (Notec) Class
        setSpecific((byte)3); // uid 23066, 632 Bukowo
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _632Bukowo createInstance()
    {
            return new _632Bukowo();
    }
}
