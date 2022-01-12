// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EmbraerEMB145AEWCR99AE99</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EmbraerEMB145AEWCR99AE99.createInstance()</code> or <code>new EmbraerEMB145AEWCR99AE99()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance/C2 (Airborne Early Warning) = <code>8</code>; </li>
 *     <li> SubCategory: EmbraerEMB145AEWCR99AE99  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25699; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6adede5. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceC2AirborneEarlyWarning
 * @see SubCategory

 */
public final class EmbraerEMB145AEWCR99AE99 extends EntityType
{
    /** Default constructor */
    public EmbraerEMB145AEWCR99AE99()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 25698, Surveillance/C2 (Airborne Early Warning)
        setSubCategory((byte)1); // uid 25699, Embraer EMB 145 AEW&C (R-99A/E-99)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EmbraerEMB145AEWCR99AE99 createInstance()
    {
            return new EmbraerEMB145AEWCR99AE99();
    }
}
