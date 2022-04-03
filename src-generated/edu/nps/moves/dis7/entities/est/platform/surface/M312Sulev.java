// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.est.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M312Sulev</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M312Sulev.createInstance()</code> or <code>new M312Sulev()</code>. </p>
 * <ul>
 *     <li> Country: Estonia (EST) = <code>250</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: LindauClassType320  = <code>2</code>; </li>
 *     <li> Specific: M312Sulev  = <code>2</code>; </li>
 *     <li> Entity type uid: 27558; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43f02ef2. </p>
 * @see Country#ESTONIA_EST
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M312Sulev extends EntityType
{
    /** Default constructor */
    public M312Sulev()
    {
        setCountry(Country.ESTONIA_EST);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27555, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 27556, Lindau Class (Type 320)
        setSpecific((byte)2); // uid 27558, M312 Sulev
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M312Sulev createInstance()
    {
            return new M312Sulev();
    }
}
