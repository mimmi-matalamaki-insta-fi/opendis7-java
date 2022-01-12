// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tuv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_802TeMatailiII</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_802TeMatailiII.createInstance()</code> or <code>new _802TeMatailiII()</code>. </p>
 * <ul>
 *     <li> Country: Tuvalu (TUV) = <code>220</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: GuardianClassPacificPatrolBoatsPPBR  = <code>2</code>; </li>
 *     <li> Specific: _802TeMatailiII  = <code>1</code>; </li>
 *     <li> Entity type uid: 32550; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7593ea79. </p>
 * @see Country#TUVALU_TUV
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _802TeMatailiII extends EntityType
{
    /** Default constructor */
    public _802TeMatailiII()
    {
        setCountry(Country.TUVALU_TUV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26723, Light/Patrol Craft
        setSubCategory((byte)2); // uid 32549, Guardian Class, Pacific Patrol Boats (PPB-R)
        setSpecific((byte)1); // uid 32550, 802 Te Mataili II
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _802TeMatailiII createInstance()
    {
            return new _802TeMatailiII();
    }
}
