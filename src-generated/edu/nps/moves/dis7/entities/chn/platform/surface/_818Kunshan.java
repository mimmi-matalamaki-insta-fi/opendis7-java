// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_818Kunshan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_818Kunshan.createInstance()</code> or <code>new _818Kunshan()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: WozangClassType082IICoastalMinehunter  = <code>7</code>; </li>
 *     <li> Specific: _818Kunshan  = <code>2</code>; </li>
 *     <li> Entity type uid: 29627; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43195e57. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _818Kunshan extends EntityType
{
    /** Default constructor */
    public _818Kunshan()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17178, Mine Countermeasure Ship/Craft
        setSubCategory((byte)7); // uid 29625, Wozang Class (Type 082-II) (Coastal Minehunter)
        setSpecific((byte)2); // uid 29627, 818 Kunshan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _818Kunshan createInstance()
    {
            return new _818Kunshan();
    }
}
