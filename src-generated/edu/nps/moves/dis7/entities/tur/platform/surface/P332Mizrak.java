// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P332Mizrak</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P332Mizrak.createInstance()</code> or <code>new P332Mizrak()</code>. </p>
 * <ul>
 *     <li> Country: Turkey (TUR) = <code>218</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: Kilicclass  = <code>4</code>; </li>
 *     <li> Specific: P332Mizrak  = <code>3</code>; </li>
 *     <li> Entity type uid: 23238; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d979d34. </p>
 * @see Country#TURKEY_TUR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P332Mizrak extends EntityType
{
    /** Default constructor */
    public P332Mizrak()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19062, Light/Patrol Craft
        setSubCategory((byte)4); // uid 23235, Kilic class
        setSpecific((byte)3); // uid 23238, P332 Mizrak
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P332Mizrak createInstance()
    {
            return new P332Mizrak();
    }
}
