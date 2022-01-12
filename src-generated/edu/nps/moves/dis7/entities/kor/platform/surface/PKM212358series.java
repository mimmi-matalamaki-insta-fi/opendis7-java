// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PKM212358series</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PKM212358series.createInstance()</code> or <code>new PKM212358series()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: SeaDolphinClassfastattackcraftpatrol  = <code>2</code>; </li>
 *     <li> Specific: PKM212358series  = <code>1</code>; </li>
 *     <li> Entity type uid: 17684; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58783f6c. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class PKM212358series extends EntityType
{
    /** Default constructor */
    public PKM212358series()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17673, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17683, Sea Dolphin Class (fast attack craft-patrol)
        setSpecific((byte)1); // uid 17684, PKM 212-358 series
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PKM212358series createInstance()
    {
            return new PKM212358series();
    }
}
