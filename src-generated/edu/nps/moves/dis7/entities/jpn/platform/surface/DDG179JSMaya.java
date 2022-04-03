// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DDG179JSMaya</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DDG179JSMaya.createInstance()</code> or <code>new DDG179JSMaya()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer (DDG) = <code>4</code>; </li>
 *     <li> SubCategory: MayaClassDDG  = <code>5</code>; </li>
 *     <li> Specific: DDG179JSMaya  = <code>1</code>; </li>
 *     <li> Entity type uid: 31841; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a23a01d. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyerDDG
 * @see SubCategory

 */
public final class DDG179JSMaya extends EntityType
{
    /** Default constructor */
    public DDG179JSMaya()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18886, Guided Missile Destroyer (DDG)
        setSubCategory((byte)5); // uid 31840, Maya Class (DDG)
        setSpecific((byte)1); // uid 31841, DDG-179 JS Maya
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DDG179JSMaya createInstance()
    {
            return new DDG179JSMaya();
    }
}
