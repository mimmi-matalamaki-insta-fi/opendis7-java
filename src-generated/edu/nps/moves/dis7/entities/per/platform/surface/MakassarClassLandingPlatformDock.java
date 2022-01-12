// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.per.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MakassarClassLandingPlatformDock</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MakassarClassLandingPlatformDock.createInstance()</code> or <code>new MakassarClassLandingPlatformDock()</code>. </p>
 * <ul>
 *     <li> Country: Peru (PER) = <code>172</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Transport Dock = <code>56</code>; </li>
 *     <li> SubCategory: MakassarClassLandingPlatformDock  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31451; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2d6aca33. </p>
 * @see Country#PERU_PER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousTransportDock
 * @see SubCategory

 */
public final class MakassarClassLandingPlatformDock extends EntityType
{
    /** Default constructor */
    public MakassarClassLandingPlatformDock()
    {
        setCountry(Country.PERU_PER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 31450, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 31451, Makassar Class Landing Platform Dock
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MakassarClassLandingPlatformDock createInstance()
    {
            return new MakassarClassLandingPlatformDock();
    }
}
