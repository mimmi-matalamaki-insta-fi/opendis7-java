// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PointPerpendicularLighthouseInactive</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PointPerpendicularLighthouseInactive.createInstance()</code> or <code>new PointPerpendicularLighthouseInactive()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Tower = <code>17</code>; </li>
 *     <li> SubCategory: Lighthouse  = <code>5</code>; </li>
 *     <li> Specific: LighthouseMediumGTE20mandLT40m  = <code>2</code>; </li>
 *     <li> Entity type uid: 30285; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7ee2423. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tower
 * @see SubCategory

 */
public final class PointPerpendicularLighthouseInactive extends EntityType
{
    /** Default constructor */
    public PointPerpendicularLighthouseInactive()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 22063, Tower
        setSubCategory((byte)5); // uid 29789, Lighthouse
        setSpecific((byte)2); // uid 29791, Lighthouse, Medium (>=20m and <40m)
        setExtra((byte)2); // uid 30285, Point Perpendicular Lighthouse (Inactive)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PointPerpendicularLighthouseInactive createInstance()
    {
            return new PointPerpendicularLighthouseInactive();
    }
}
