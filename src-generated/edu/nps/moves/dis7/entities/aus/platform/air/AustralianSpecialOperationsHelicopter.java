// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AustralianSpecialOperationsHelicopter</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AustralianSpecialOperationsHelicopter.createInstance()</code> or <code>new AustralianSpecialOperationsHelicopter()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Special Operations Helicopter = <code>25</code>; </li>
 *     <li> SubCategory: AustralianSpecialOperationsHelicopter  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 34584; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3c5a99da. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SpecialOperationsHelicopter
 * @see SubCategory

 */
public final class AustralianSpecialOperationsHelicopter extends EntityType
{
    /** Default constructor */
    public AustralianSpecialOperationsHelicopter()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)25); // uid 34583, Special Operations Helicopter
        setSubCategory((byte)1); // uid 34584, Australian Special Operations Helicopter
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AustralianSpecialOperationsHelicopter createInstance()
    {
            return new AustralianSpecialOperationsHelicopter();
    }
}
