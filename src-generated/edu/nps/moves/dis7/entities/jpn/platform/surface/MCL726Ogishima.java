// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MCL726Ogishima</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MCL726Ogishima.createInstance()</code> or <code>new MCL726Ogishima()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: NiijimaClassMineCountermeasuresCoastal  = <code>3</code>; </li>
 *     <li> Specific: MCL726Ogishima  = <code>2</code>; </li>
 *     <li> Entity type uid: 33644; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4201a617. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class MCL726Ogishima extends EntityType
{
    /** Default constructor */
    public MCL726Ogishima()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 18899, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 33642, Niijima Class (Mine Countermeasures, Coastal)
        setSpecific((byte)2); // uid 33644, MCL-726 Ogishima
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MCL726Ogishima createInstance()
    {
            return new MCL726Ogishima();
    }
}
