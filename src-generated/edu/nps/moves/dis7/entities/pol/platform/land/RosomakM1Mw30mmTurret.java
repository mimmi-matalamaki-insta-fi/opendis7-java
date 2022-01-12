// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RosomakM1Mw30mmTurret</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RosomakM1Mw30mmTurret.createInstance()</code> or <code>new RosomakM1Mw30mmTurret()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: KTORosomakIFV  = <code>1</code>; </li>
 *     <li> Specific: RosomakM1Mw30mmTurret  = <code>2</code>; </li>
 *     <li> Entity type uid: 31686; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3bcd426c. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class RosomakM1Mw30mmTurret extends EntityType
{
    /** Default constructor */
    public RosomakM1Mw30mmTurret()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 31683, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 31684, KTO Rosomak IFV
        setSpecific((byte)2); // uid 31686, Rosomak M1M w/30mm Turret
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RosomakM1Mw30mmTurret createInstance()
    {
            return new RosomakM1Mw30mmTurret();
    }
}
