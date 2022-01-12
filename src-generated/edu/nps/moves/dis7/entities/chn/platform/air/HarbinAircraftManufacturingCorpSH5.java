// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HarbinAircraftManufacturingCorpSH5</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HarbinAircraftManufacturingCorpSH5.createInstance()</code> or <code>new HarbinAircraftManufacturingCorpSH5()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: ASW/Patrol/Observation = <code>5</code>; </li>
 *     <li> SubCategory: HarbinAircraftManufacturingCorpSH5  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24376; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@79ad8b2f. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ASWPatrolObservation
 * @see SubCategory

 */
public final class HarbinAircraftManufacturingCorpSH5 extends EntityType
{
    /** Default constructor */
    public HarbinAircraftManufacturingCorpSH5()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 24375, ASW/Patrol/Observation
        setSubCategory((byte)1); // uid 24376, Harbin Aircraft Manufacturing Corp. SH-5
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HarbinAircraftManufacturingCorpSH5 createInstance()
    {
            return new HarbinAircraftManufacturingCorpSH5();
    }
}
