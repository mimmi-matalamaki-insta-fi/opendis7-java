// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_232MPK229Kalmykia</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_232MPK229Kalmykia.createInstance()</code> or <code>new _232MPK229Kalmykia()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: ParchimIIClass  = <code>10</code>; </li>
 *     <li> Specific: _232MPK229Kalmykia  = <code>2</code>; </li>
 *     <li> Entity type uid: 27063; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@22a736d7. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class _232MPK229Kalmykia extends EntityType
{
    /** Default constructor */
    public _232MPK229Kalmykia()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 14715, Frigate
        setSubCategory((byte)10); // uid 14746, Parchim II Class
        setSpecific((byte)2); // uid 27063, 232 MPK-229 Kalmykia
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _232MPK229Kalmykia createInstance()
    {
            return new _232MPK229Kalmykia();
    }
}
