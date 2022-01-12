// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OilPlatformNormallyUnmannedInstallationNUI</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OilPlatformNormallyUnmannedInstallationNUI.createInstance()</code> or <code>new OilPlatformNormallyUnmannedInstallationNUI()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Oil Platform = <code>1</code>; </li>
 *     <li> SubCategory: OilPlatformNormallyUnmannedInstallationNUI  = <code>11</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25254; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4b50c21. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see OilPlatform
 * @see SubCategory

 */
public final class OilPlatformNormallyUnmannedInstallationNUI extends EntityType
{
    /** Default constructor */
    public OilPlatformNormallyUnmannedInstallationNUI()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 22124, Oil Platform
        setSubCategory((byte)11); // uid 25254, Oil Platform, Normally Unmanned Installation (NUI)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OilPlatformNormallyUnmannedInstallationNUI createInstance()
    {
            return new OilPlatformNormallyUnmannedInstallationNUI();
    }
}
