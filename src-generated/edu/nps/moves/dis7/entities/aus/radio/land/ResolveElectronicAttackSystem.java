// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ResolveElectronicAttackSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ResolveElectronicAttackSystem.createInstance()</code> or <code>new ResolveElectronicAttackSystem()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Electronic Attack Systems = <code>50</code>; </li>
 *     <li> SubCategory: ManufacturerDesignation  = <code>2</code>; </li>
 *     <li> Specific: ResolveElectronicAttackSystem  = <code>1</code>; </li>
 *     <li> Entity type uid: 31618; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1ba7db2a. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectronicAttackSystems
 * @see SubCategory

 */
public final class ResolveElectronicAttackSystem extends EntityType
{
    /** Default constructor */
    public ResolveElectronicAttackSystem()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 31616, Electronic Attack Systems
        setSubCategory((byte)2); // uid 31617, Manufacturer Designation
        setSpecific((byte)1); // uid 31618, Resolve Electronic Attack System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ResolveElectronicAttackSystem createInstance()
    {
            return new ResolveElectronicAttackSystem();
    }
}
