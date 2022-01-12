// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_612Badr</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_612Badr.createInstance()</code> or <code>new _612Badr()</code>. </p>
 * <ul>
 *     <li> Country: Saudi Arabia (SAU) = <code>189</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: BadrClassCorvette  = <code>2</code>; </li>
 *     <li> Specific: _612Badr  = <code>1</code>; </li>
 *     <li> Entity type uid: 17856; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@74174a23. </p>
 * @see Country#SAUDI_ARABIA_SAU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigate
 * @see SubCategory

 */
public final class _612Badr extends EntityType
{
    /** Default constructor */
    public _612Badr()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17849, Guided Missile Frigate
        setSubCategory((byte)2); // uid 17855, Badr Class (Corvette)
        setSpecific((byte)1); // uid 17856, 612 Badr
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _612Badr createInstance()
    {
            return new _612Badr();
    }
}
