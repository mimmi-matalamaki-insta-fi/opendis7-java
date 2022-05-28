// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tto.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CapeClassPatrolBoat</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CapeClassPatrolBoat.createInstance()</code> or <code>new CapeClassPatrolBoat()</code>. </p>
 * <ul>
 *     <li> Country: Trinidad and Tobago (TTO) = <code>214</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: CapeClassPatrolBoat  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 34471; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2cee5365. </p>
 * @see Country#TRINIDAD_AND_TOBAGO_TTO
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class CapeClassPatrolBoat extends EntityType
{
    /** Default constructor */
    public CapeClassPatrolBoat()
    {
        setCountry(Country.TRINIDAD_AND_TOBAGO_TTO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 34469, Light/Patrol Craft
        setSubCategory((byte)2); // uid 34471, Cape Class Patrol Boat
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CapeClassPatrolBoat createInstance()
    {
            return new CapeClassPatrolBoat();
    }
}