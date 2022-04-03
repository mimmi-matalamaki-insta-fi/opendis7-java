// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_53KapitanLeytenantKirilMinkov</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_53KapitanLeytenantKirilMinkov.createInstance()</code> or <code>new _53KapitanLeytenantKirilMinkov()</code>. </p>
 * <ul>
 *     <li> Country: Bulgaria (BGR) = <code>33</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: OlyaClassProject1259  = <code>3</code>; </li>
 *     <li> Specific: _53KapitanLeytenantKirilMinkov  = <code>3</code>; </li>
 *     <li> Entity type uid: 32899; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@131276c2. </p>
 * @see Country#BULGARIA_BGR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _53KapitanLeytenantKirilMinkov extends EntityType
{
    /** Default constructor */
    public _53KapitanLeytenantKirilMinkov()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27886, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 32896, Olya Class (Project 1259)
        setSpecific((byte)3); // uid 32899, 53 Kapitan Leytenant Kiril Minkov
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _53KapitanLeytenantKirilMinkov createInstance()
    {
            return new _53KapitanLeytenantKirilMinkov();
    }
}
