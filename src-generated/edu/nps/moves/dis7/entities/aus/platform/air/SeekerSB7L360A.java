// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SeekerSB7L360A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SeekerSB7L360A.createInstance()</code> or <code>new SeekerSB7L360A()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg) = <code>85</code>; </li>
 *     <li> SubCategory: SinglePistonEngine  = <code>11</code>; </li>
 *     <li> Specific: SeekerSB7L360A  = <code>1</code>; </li>
 *     <li> Entity type uid: 29577; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3cb5cdba. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftSmallupto12500lbs5670kg
 * @see SubCategory

 */
public final class SeekerSB7L360A extends EntityType
{
    /** Default constructor */
    public SeekerSB7L360A()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 29575, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 29576, Single Piston Engine
        setSpecific((byte)1); // uid 29577, Seeker SB7L-360A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SeekerSB7L360A createInstance()
    {
            return new SeekerSB7L360A();
    }
}
