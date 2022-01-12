// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_801RaisHamidou</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_801RaisHamidou.createInstance()</code> or <code>new _801RaisHamidou()</code>. </p>
 * <ul>
 *     <li> Country: Algeria (DZA) = <code>3</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: NanuchkaIIBuryaclass  = <code>2</code>; </li>
 *     <li> Specific: _801RaisHamidou  = <code>1</code>; </li>
 *     <li> Entity type uid: 27050; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@73a8dfcc. </p>
 * @see Country#ALGERIA_DZA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _801RaisHamidou extends EntityType
{
    /** Default constructor */
    public _801RaisHamidou()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27048, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 27049, Nanuchka II (Burya) class
        setSpecific((byte)1); // uid 27050, 801 Rais Hamidou
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _801RaisHamidou createInstance()
    {
            return new _801RaisHamidou();
    }
}
