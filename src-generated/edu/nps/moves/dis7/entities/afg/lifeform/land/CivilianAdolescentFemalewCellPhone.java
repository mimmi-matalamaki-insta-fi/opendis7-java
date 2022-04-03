// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CivilianAdolescentFemalewCellPhone</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CivilianAdolescentFemalewCellPhone.createInstance()</code> or <code>new CivilianAdolescentFemalewCellPhone()</code>. </p>
 * <ul>
 *     <li> Country: Afghanistan (AFG) = <code>1</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Civilian = <code>130</code>; </li>
 *     <li> SubCategory: PersonalElectronics  = <code>171</code>; </li>
 *     <li> Specific: CellPhone  = <code>1</code>; </li>
 *     <li> Entity type uid: 32217; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@47e60b71. </p>
 * @see Country#AFGHANISTAN_AFG
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Civilian
 * @see SubCategory

 */
public final class CivilianAdolescentFemalewCellPhone extends EntityType
{
    /** Default constructor */
    public CivilianAdolescentFemalewCellPhone()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32211, Civilian
        setSubCategory((byte)171); // uid 32212, Personal Electronics
        setSpecific((byte)1); // uid 32213, Cell Phone
        setExtra((byte)140); // uid 32217, Civilian Adolescent, Female w/ Cell Phone
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CivilianAdolescentFemalewCellPhone createInstance()
    {
            return new CivilianAdolescentFemalewCellPhone();
    }
}
