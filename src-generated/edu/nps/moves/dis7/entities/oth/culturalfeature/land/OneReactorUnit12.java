// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OneReactorUnit12</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OneReactorUnit12.createInstance()</code> or <code>new OneReactorUnit12()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Nuclear Power Plant = <code>12</code>; </li>
 *     <li> SubCategory: HighTemperatureGascooledReactorHTGR  = <code>3</code>; </li>
 *     <li> Specific: OneReactorUnit  = <code>1</code>; </li>
 *     <li> Entity type uid: 22033; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@dde6f87. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see NuclearPowerPlant
 * @see SubCategory

 */
public final class OneReactorUnit12 extends EntityType
{
    /** Default constructor */
    public OneReactorUnit12()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 22023, Nuclear Power Plant
        setSubCategory((byte)3); // uid 22031, High Temperature Gas-cooled Reactor (HTGR)
        setSpecific((byte)1); // uid 22033, One Reactor Unit
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OneReactorUnit12 createInstance()
    {
            return new OneReactorUnit12();
    }
}
