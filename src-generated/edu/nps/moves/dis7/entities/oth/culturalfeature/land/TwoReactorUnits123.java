// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TwoReactorUnits123</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TwoReactorUnits123.createInstance()</code> or <code>new TwoReactorUnits123()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Nuclear Power Plant = <code>12</code>; </li>
 *     <li> SubCategory: BoilingWaterReactor  = <code>4</code>; </li>
 *     <li> Specific: TwoReactorUnits  = <code>2</code>; </li>
 *     <li> Entity type uid: 22038; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@36638b59. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see NuclearPowerPlant
 * @see SubCategory

 */
public final class TwoReactorUnits123 extends EntityType
{
    /** Default constructor */
    public TwoReactorUnits123()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 22023, Nuclear Power Plant
        setSubCategory((byte)4); // uid 22035, Boiling Water Reactor
        setSpecific((byte)2); // uid 22038, Two Reactor Units
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TwoReactorUnits123 createInstance()
    {
            return new TwoReactorUnits123();
    }
}
