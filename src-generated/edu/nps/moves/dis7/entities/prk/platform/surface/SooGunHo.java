// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SooGunHo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SooGunHo.createInstance()</code> or <code>new SooGunHo()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: DepotShipforMidgetSubmarine  = <code>1</code>; </li>
 *     <li> Specific: SooGunHo  = <code>1</code>; </li>
 *     <li> Entity type uid: 17803; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1734f68. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class SooGunHo extends EntityType
{
    /** Default constructor */
    public SooGunHo()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17801, Auxiliary
        setSubCategory((byte)1); // uid 17802, Depot Ship for Midget Submarine
        setSpecific((byte)1); // uid 17803, Soo Gun-Ho
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SooGunHo createInstance()
    {
            return new SooGunHo();
    }
}
