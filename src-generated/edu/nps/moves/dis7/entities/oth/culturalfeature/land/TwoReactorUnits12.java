// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TwoReactorUnits12</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TwoReactorUnits12.createInstance()</code> or <code>new TwoReactorUnits12()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Nuclear Power Plant = <code>12</code>; </li>
 *     <li> SubCategory: HighTemperatureGascooledReactorHTGR  = <code>3</code>; </li>
 *     <li> Specific: TwoReactorUnits  = <code>2</code>; </li>
 *     <li> Entity type uid: 22034; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7884f722. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see NuclearPowerPlant
 * @see SubCategory

 */
public final class TwoReactorUnits12 extends EntityType
{
    /** Default constructor */
    public TwoReactorUnits12()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 22023, Nuclear Power Plant
        setSubCategory((byte)3); // uid 22031, High Temperature Gas-cooled Reactor (HTGR)
        setSpecific((byte)2); // uid 22034, Two Reactor Units
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TwoReactorUnits12 createInstance()
    {
            return new TwoReactorUnits12();
    }
}
