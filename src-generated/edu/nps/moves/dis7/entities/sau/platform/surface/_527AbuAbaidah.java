// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_527AbuAbaidah</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_527AbuAbaidah.createInstance()</code> or <code>new _527AbuAbaidah()</code>. </p>
 * <ul>
 *     <li> Country: Saudi Arabia (SAU) = <code>189</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: AlSiddiqfastattackcraftmissile  = <code>4</code>; </li>
 *     <li> Specific: _527AbuAbaidah  = <code>9</code>; </li>
 *     <li> Entity type uid: 17878; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1dbd580. </p>
 * @see Country#SAUDI_ARABIA_SAU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _527AbuAbaidah extends EntityType
{
    /** Default constructor */
    public _527AbuAbaidah()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17862, Light/Patrol Craft
        setSubCategory((byte)4); // uid 17869, Al Siddiq (fast attack craft-missile)
        setSpecific((byte)9); // uid 17878, 527 Abu Abaidah
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _527AbuAbaidah createInstance()
    {
            return new _527AbuAbaidah();
    }
}
