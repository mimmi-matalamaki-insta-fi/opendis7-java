// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KawasakiJetSki</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KawasakiJetSki.createInstance()</code> or <code>new KawasakiJetSki()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other Vessels = <code>87</code>; </li>
 *     <li> SubCategory: PersonalWaterCraft  = <code>9</code>; </li>
 *     <li> Specific: KawasakiJetSki  = <code>1</code>; </li>
 *     <li> Entity type uid: 31815; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d61eccf. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see OtherVessels
 * @see SubCategory

 */
public final class KawasakiJetSki extends EntityType
{
    /** Default constructor */
    public KawasakiJetSki()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)87); // uid 31813, Other Vessels
        setSubCategory((byte)9); // uid 31814, Personal Water Craft
        setSpecific((byte)1); // uid 31815, Kawasaki Jet Ski
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KawasakiJetSki createInstance()
    {
            return new KawasakiJetSki();
    }
}
