// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_592Banjarmasin</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_592Banjarmasin.createInstance()</code> or <code>new _592Banjarmasin()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Transport Dock = <code>56</code>; </li>
 *     <li> SubCategory: MakassarClassLandingPlatformDock  = <code>1</code>; </li>
 *     <li> Specific: _592Banjarmasin  = <code>3</code>; </li>
 *     <li> Entity type uid: 31448; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@765f05af. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousTransportDock
 * @see SubCategory

 */
public final class _592Banjarmasin extends EntityType
{
    /** Default constructor */
    public _592Banjarmasin()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 31444, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 31445, Makassar Class Landing Platform Dock
        setSpecific((byte)3); // uid 31448, 592 Banjarmasin
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _592Banjarmasin createInstance()
    {
            return new _592Banjarmasin();
    }
}
