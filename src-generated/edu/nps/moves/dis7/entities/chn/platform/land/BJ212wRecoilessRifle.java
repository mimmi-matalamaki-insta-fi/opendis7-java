// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BJ212wRecoilessRifle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BJ212wRecoilessRifle.createInstance()</code> or <code>new BJ212wRecoilessRifle()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle (0 - 1.25 tons) = <code>6</code>; </li>
 *     <li> SubCategory: BJ2124x4  = <code>1</code>; </li>
 *     <li> Specific: BJ212wRecoilessRifle  = <code>4</code>; </li>
 *     <li> Entity type uid: 35040; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17c386de. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle0125tons
 * @see SubCategory

 */
public final class BJ212wRecoilessRifle extends EntityType
{
    /** Default constructor */
    public BJ212wRecoilessRifle()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 16926, Small Wheeled Utility Vehicle (0 - 1.25 tons)
        setSubCategory((byte)1); // uid 16927, BJ212 4x4
        setSpecific((byte)4); // uid 35040, BJ212 (w/Recoiless Rifle)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BJ212wRecoilessRifle createInstance()
    {
            return new BJ212wRecoilessRifle();
    }
}
