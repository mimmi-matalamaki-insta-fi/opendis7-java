// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_902RaisKellich</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_902RaisKellich.createInstance()</code> or <code>new _902RaisKellich()</code>. </p>
 * <ul>
 *     <li> Country: Algeria (DZA) = <code>3</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: MouradRaisClass  = <code>1</code>; </li>
 *     <li> Specific: _902RaisKellich  = <code>2</code>; </li>
 *     <li> Entity type uid: 27733; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45fe3ee3. </p>
 * @see Country#ALGERIA_DZA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _902RaisKellich extends EntityType
{
    /** Default constructor */
    public _902RaisKellich()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27048, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27731, Mourad Rais Class
        setSpecific((byte)2); // uid 27733, 902 Rais Kellich
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _902RaisKellich createInstance()
    {
            return new _902RaisKellich();
    }
}
