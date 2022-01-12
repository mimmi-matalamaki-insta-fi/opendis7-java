// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ChunmaPegasusKoreanSurfacetoAirMissileKSAMLauncher</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ChunmaPegasusKoreanSurfacetoAirMissileKSAMLauncher.createInstance()</code> or <code>new ChunmaPegasusKoreanSurfacetoAirMissileKSAMLauncher()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: ChunmaPegasusKoreanSurfacetoAirMissileKSAMLauncher  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31328; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@51a06cbe. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class ChunmaPegasusKoreanSurfacetoAirMissileKSAMLauncher extends EntityType
{
    /** Default constructor */
    public ChunmaPegasusKoreanSurfacetoAirMissileKSAMLauncher()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 31327, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 31328, Chunma (Pegasus) Korean Surface-to-Air Missile (K-SAM) Launcher
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ChunmaPegasusKoreanSurfacetoAirMissileKSAMLauncher createInstance()
    {
            return new ChunmaPegasusKoreanSurfacetoAirMissileKSAMLauncher();
    }
}
