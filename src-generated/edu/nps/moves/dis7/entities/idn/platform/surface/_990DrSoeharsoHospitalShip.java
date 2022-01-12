// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_990DrSoeharsoHospitalShip</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_990DrSoeharsoHospitalShip.createInstance()</code> or <code>new _990DrSoeharsoHospitalShip()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: TanjungDalpeleClass  = <code>1</code>; </li>
 *     <li> Specific: _990DrSoeharsoHospitalShip  = <code>1</code>; </li>
 *     <li> Entity type uid: 31676; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7ce97ee5. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class _990DrSoeharsoHospitalShip extends EntityType
{
    /** Default constructor */
    public _990DrSoeharsoHospitalShip()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 31674, Auxiliary
        setSubCategory((byte)1); // uid 31675, Tanjung Dalpele Class
        setSpecific((byte)1); // uid 31676, 990 Dr Soeharso (Hospital Ship)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _990DrSoeharsoHospitalShip createInstance()
    {
            return new _990DrSoeharsoHospitalShip();
    }
}
