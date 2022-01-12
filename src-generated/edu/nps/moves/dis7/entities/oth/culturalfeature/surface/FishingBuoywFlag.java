// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FishingBuoywFlag</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FishingBuoywFlag.createInstance()</code> or <code>new FishingBuoywFlag()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Buoy = <code>2</code>; </li>
 *     <li> SubCategory: FishingBuoys  = <code>7</code>; </li>
 *     <li> Specific: FishingBuoywFlag  = <code>5</code>; </li>
 *     <li> Entity type uid: 27179; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2c7375da. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Buoy
 * @see SubCategory

 */
public final class FishingBuoywFlag extends EntityType
{
    /** Default constructor */
    public FishingBuoywFlag()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 22125, Buoy
        setSubCategory((byte)7); // uid 27174, Fishing Buoys
        setSpecific((byte)5); // uid 27179, Fishing Buoy w/ Flag
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FishingBuoywFlag createInstance()
    {
            return new FishingBuoywFlag();
    }
}
