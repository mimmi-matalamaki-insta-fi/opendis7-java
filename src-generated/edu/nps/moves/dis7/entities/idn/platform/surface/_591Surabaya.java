// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_591Surabaya</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_591Surabaya.createInstance()</code> or <code>new _591Surabaya()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Transport Dock = <code>56</code>; </li>
 *     <li> SubCategory: MakassarClassLandingPlatformDock  = <code>1</code>; </li>
 *     <li> Specific: _591Surabaya  = <code>2</code>; </li>
 *     <li> Entity type uid: 31447; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f6c03cb. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousTransportDock
 * @see SubCategory

 */
public final class _591Surabaya extends EntityType
{
    /** Default constructor */
    public _591Surabaya()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 31444, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 31445, Makassar Class Landing Platform Dock
        setSpecific((byte)2); // uid 31447, 591 Surabaya
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _591Surabaya createInstance()
    {
            return new _591Surabaya();
    }
}
