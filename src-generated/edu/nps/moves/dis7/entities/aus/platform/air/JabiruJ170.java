// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>JabiruJ170</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>JabiruJ170.createInstance()</code> or <code>new JabiruJ170()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Light Sport (up to 1320 lbs / 600 kg) = <code>84</code>; </li>
 *     <li> SubCategory: SinglePistonEngine  = <code>11</code>; </li>
 *     <li> Specific: JabiruJ170  = <code>3</code>; </li>
 *     <li> Entity type uid: 29573; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7dc36524. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftLightSportupto1320lbs600kg
 * @see SubCategory

 */
public final class JabiruJ170 extends EntityType
{
    /** Default constructor */
    public JabiruJ170()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)84); // uid 29569, Civilian Fixed Wing Aircraft, Light Sport (up to 1320 lbs / 600 kg)
        setSubCategory((byte)11); // uid 29570, Single Piston Engine
        setSpecific((byte)3); // uid 29573, Jabiru J170
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static JabiruJ170 createInstance()
    {
            return new JabiruJ170();
    }
}
