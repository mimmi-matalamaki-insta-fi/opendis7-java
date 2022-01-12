// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.hrv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RTOP21Sibenik</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RTOP21Sibenik.createInstance()</code> or <code>new RTOP21Sibenik()</code>. </p>
 * <ul>
 *     <li> Country: Croatia (HRV) = <code>249</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: KoncarTypeR02ClassFastAttackCraftMissilePCFG  = <code>1</code>; </li>
 *     <li> Specific: RTOP21Sibenik  = <code>1</code>; </li>
 *     <li> Entity type uid: 19334; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65d09a04. </p>
 * @see Country#CROATIA_HRV
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class RTOP21Sibenik extends EntityType
{
    /** Default constructor */
    public RTOP21Sibenik()
    {
        setCountry(Country.CROATIA_HRV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19332, Light/Patrol Craft
        setSubCategory((byte)1); // uid 19333, Koncar (Type R-02) Class (Fast Attack Craft-Missile) (PCFG)
        setSpecific((byte)1); // uid 19334, RTOP 21 Sibenik
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RTOP21Sibenik createInstance()
    {
            return new RTOP21Sibenik();
    }
}
