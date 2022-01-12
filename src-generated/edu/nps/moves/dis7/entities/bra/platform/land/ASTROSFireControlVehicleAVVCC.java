// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ASTROSFireControlVehicleAVVCC</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ASTROSFireControlVehicleAVVCC.createInstance()</code> or <code>new ASTROSFireControlVehicleAVVCC()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fire Control Facility = <code>37</code>; </li>
 *     <li> SubCategory: ASTROSFireControlVehicleAVVCC  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24392; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@27c20538. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FireControlFacility
 * @see SubCategory

 */
public final class ASTROSFireControlVehicleAVVCC extends EntityType
{
    /** Default constructor */
    public ASTROSFireControlVehicleAVVCC()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)37); // uid 24391, Fire Control Facility
        setSubCategory((byte)1); // uid 24392, ASTROS Fire Control Vehicle AV-VCC
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ASTROSFireControlVehicleAVVCC createInstance()
    {
            return new ASTROSFireControlVehicleAVVCC();
    }
}
