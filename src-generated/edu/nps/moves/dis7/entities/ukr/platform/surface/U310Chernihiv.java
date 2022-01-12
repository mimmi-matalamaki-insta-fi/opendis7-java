// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>U310Chernihiv</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>U310Chernihiv.createInstance()</code> or <code>new U310Chernihiv()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: NatyaIClass  = <code>1</code>; </li>
 *     <li> Specific: U310Chernihiv  = <code>1</code>; </li>
 *     <li> Entity type uid: 29870; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f0ed952. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class U310Chernihiv extends EntityType
{
    /** Default constructor */
    public U310Chernihiv()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 29868, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 29869, Natya I Class
        setSpecific((byte)1); // uid 29870, U310 Chernihiv
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static U310Chernihiv createInstance()
    {
            return new U310Chernihiv();
    }
}
