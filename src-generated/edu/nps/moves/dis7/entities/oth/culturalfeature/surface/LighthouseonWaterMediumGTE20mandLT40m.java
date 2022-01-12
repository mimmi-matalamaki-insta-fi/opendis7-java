// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LighthouseonWaterMediumGTE20mandLT40m</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LighthouseonWaterMediumGTE20mandLT40m.createInstance()</code> or <code>new LighthouseonWaterMediumGTE20mandLT40m()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Marker = <code>4</code>; </li>
 *     <li> SubCategory: LighthouseonWater  = <code>4</code>; </li>
 *     <li> Specific: LighthouseonWaterMediumGTE20mandLT40m  = <code>2</code>; </li>
 *     <li> Entity type uid: 29796; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b01897f. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Marker
 * @see SubCategory

 */
public final class LighthouseonWaterMediumGTE20mandLT40m extends EntityType
{
    /** Default constructor */
    public LighthouseonWaterMediumGTE20mandLT40m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 22139, Marker
        setSubCategory((byte)4); // uid 29794, Lighthouse on Water
        setSpecific((byte)2); // uid 29796, Lighthouse on Water, Medium (>=20m and <40m)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LighthouseonWaterMediumGTE20mandLT40m createInstance()
    {
            return new LighthouseonWaterMediumGTE20mandLT40m();
    }
}
