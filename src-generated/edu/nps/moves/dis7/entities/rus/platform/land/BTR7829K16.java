// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BTR7829K16</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BTR7829K16.createInstance()</code> or <code>new BTR7829K16()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: VPK7829Bumerang  = <code>23</code>; </li>
 *     <li> Specific: BTR7829K16  = <code>1</code>; </li>
 *     <li> Entity type uid: 33175; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31133b6e. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class BTR7829K16 extends EntityType
{
    /** Default constructor */
    public BTR7829K16()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)23); // uid 33174, VPK-7829 Bumerang
        setSpecific((byte)1); // uid 33175, BTR-7829 K-16
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BTR7829K16 createInstance()
    {
            return new BTR7829K16();
    }
}