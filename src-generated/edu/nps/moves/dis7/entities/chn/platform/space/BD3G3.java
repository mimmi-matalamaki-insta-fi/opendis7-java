// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BD3G3</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BD3G3.createInstance()</code> or <code>new BD3G3()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>2</code>; </li>
 *     <li> SubCategory: NavigationSatellite  = <code>2</code>; </li>
 *     <li> Specific: BD3GBeidou3G  = <code>5</code>; </li>
 *     <li> Entity type uid: 35275; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@29d89d5d. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class BD3G3 extends EntityType
{
    /** Default constructor */
    public BD3G3()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 34631, Unmanned
        setSubCategory((byte)2); // uid 34661, Navigation Satellite
        setSpecific((byte)5); // uid 34690, BD 3G (Beidou 3G)
        setExtra((byte)5); // uid 35275, BD-3 G3
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BD3G3 createInstance()
    {
            return new BD3G3();
    }
}
