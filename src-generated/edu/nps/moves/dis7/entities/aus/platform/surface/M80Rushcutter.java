// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M80Rushcutter</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M80Rushcutter.createInstance()</code> or <code>new M80Rushcutter()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: BayClassMinehuntersInshore  = <code>2</code>; </li>
 *     <li> Specific: M80Rushcutter  = <code>1</code>; </li>
 *     <li> Entity type uid: 17575; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68837a77. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M80Rushcutter extends EntityType
{
    /** Default constructor */
    public M80Rushcutter()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17565, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 17574, Bay Class (Minehunters - Inshore)
        setSpecific((byte)1); // uid 17575, M 80 Rushcutter
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M80Rushcutter createInstance()
    {
            return new M80Rushcutter();
    }
}
