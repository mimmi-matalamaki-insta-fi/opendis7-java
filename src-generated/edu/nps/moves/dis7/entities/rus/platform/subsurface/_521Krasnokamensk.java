// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_521Krasnokamensk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_521Krasnokamensk.createInstance()</code> or <code>new _521Krasnokamensk()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: KiloClass  = <code>1</code>; </li>
 *     <li> Specific: _521Krasnokamensk  = <code>12</code>; </li>
 *     <li> Entity type uid: 27146; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5460b754. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class _521Krasnokamensk extends EntityType
{
    /** Default constructor */
    public _521Krasnokamensk()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 14799, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 14800, Kilo Class
        setSpecific((byte)12); // uid 27146, 521 Krasnokamensk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _521Krasnokamensk createInstance()
    {
            return new _521Krasnokamensk();
    }
}
