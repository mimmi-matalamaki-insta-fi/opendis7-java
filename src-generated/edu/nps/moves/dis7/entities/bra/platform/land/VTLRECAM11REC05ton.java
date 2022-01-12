// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>VTLRECAM11REC05ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VTLRECAM11REC05ton.createInstance()</code> or <code>new VTLRECAM11REC05ton()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: AgraleMarrua  = <code>1</code>; </li>
 *     <li> Specific: VTLRECAM11REC05ton  = <code>3</code>; </li>
 *     <li> Entity type uid: 32043; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59ec2012. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class VTLRECAM11REC05ton extends EntityType
{
    /** Default constructor */
    public VTLRECAM11REC05ton()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 32039, Small Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 32040, Agrale Marrua
        setSpecific((byte)3); // uid 32043, VTL REC - AM-11 REC, 0.5 ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VTLRECAM11REC05ton createInstance()
    {
            return new VTLRECAM11REC05ton();
    }
}
