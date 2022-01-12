// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_803RaisAli</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_803RaisAli.createInstance()</code> or <code>new _803RaisAli()</code>. </p>
 * <ul>
 *     <li> Country: Algeria (DZA) = <code>3</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: NanuchkaIIBuryaclass  = <code>2</code>; </li>
 *     <li> Specific: _803RaisAli  = <code>3</code>; </li>
 *     <li> Entity type uid: 27052; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7e774085. </p>
 * @see Country#ALGERIA_DZA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _803RaisAli extends EntityType
{
    /** Default constructor */
    public _803RaisAli()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27048, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 27049, Nanuchka II (Burya) class
        setSpecific((byte)3); // uid 27052, 803 Rais Ali
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _803RaisAli createInstance()
    {
            return new _803RaisAli();
    }
}
