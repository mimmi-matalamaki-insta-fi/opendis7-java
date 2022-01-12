// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DhofarProvinceClassfastattackcraftmissile</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DhofarProvinceClassfastattackcraftmissile.createInstance()</code> or <code>new DhofarProvinceClassfastattackcraftmissile()</code>. </p>
 * <ul>
 *     <li> Country: Oman (OMN) = <code>164</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: DhofarProvinceClassfastattackcraftmissile  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17955; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@288a4658. </p>
 * @see Country#OMAN_OMN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class DhofarProvinceClassfastattackcraftmissile extends EntityType
{
    /** Default constructor */
    public DhofarProvinceClassfastattackcraftmissile()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17942, Light/Patrol Craft
        setSubCategory((byte)4); // uid 17955, Dhofar (Province) Class (fast attack craft-missile)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DhofarProvinceClassfastattackcraftmissile createInstance()
    {
            return new DhofarProvinceClassfastattackcraftmissile();
    }
}
