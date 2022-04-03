// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_503Hanit</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_503Hanit.createInstance()</code> or <code>new _503Hanit()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: EilatSaar5ClassCorvette  = <code>1</code>; </li>
 *     <li> Specific: _503Hanit  = <code>2</code>; </li>
 *     <li> Entity type uid: 18212; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@192f2f27. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _503Hanit extends EntityType
{
    /** Default constructor */
    public _503Hanit()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18209, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 18210, Eilat (Saar 5) Class (Corvette)
        setSpecific((byte)2); // uid 18212, 503 Hanit
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _503Hanit createInstance()
    {
            return new _503Hanit();
    }
}
