// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RedFishingBuoy</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RedFishingBuoy.createInstance()</code> or <code>new RedFishingBuoy()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Buoy = <code>2</code>; </li>
 *     <li> SubCategory: FishingBuoys  = <code>7</code>; </li>
 *     <li> Specific: RedFishingBuoy  = <code>1</code>; </li>
 *     <li> Entity type uid: 27175; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e4d4d22. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Buoy
 * @see SubCategory

 */
public final class RedFishingBuoy extends EntityType
{
    /** Default constructor */
    public RedFishingBuoy()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 22125, Buoy
        setSubCategory((byte)7); // uid 27174, Fishing Buoys
        setSpecific((byte)1); // uid 27175, Red Fishing Buoy
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RedFishingBuoy createInstance()
    {
            return new RedFishingBuoy();
    }
}
