// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_711PulauRengat</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_711PulauRengat.createInstance()</code> or <code>new _711PulauRengat()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: PulauRengatClassTripartiteClass  = <code>1</code>; </li>
 *     <li> Specific: _711PulauRengat  = <code>1</code>; </li>
 *     <li> Entity type uid: 31076; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18c5069b. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _711PulauRengat extends EntityType
{
    /** Default constructor */
    public _711PulauRengat()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 31057, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 31075, Pulau Rengat Class (Tripartite Class)
        setSpecific((byte)1); // uid 31076, 711 Pulau Rengat
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _711PulauRengat createInstance()
    {
            return new _711PulauRengat();
    }
}
