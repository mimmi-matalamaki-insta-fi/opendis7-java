// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TaepoDongIILauncher3stageversion</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TaepoDongIILauncher3stageversion.createInstance()</code> or <code>new TaepoDongIILauncher3stageversion()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic People's Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: TaepoDongIILauncher3stageversion  = <code>7</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17761; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@50b1f030. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class TaepoDongIILauncher3stageversion extends EntityType
{
    /** Default constructor */
    public TaepoDongIILauncher3stageversion()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 17750, Self-Propelled Artillery
        setSubCategory((byte)7); // uid 17761, Taepo Dong II Launcher (3-stage version)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TaepoDongIILauncher3stageversion createInstance()
    {
            return new TaepoDongIILauncher3stageversion();
    }
}
