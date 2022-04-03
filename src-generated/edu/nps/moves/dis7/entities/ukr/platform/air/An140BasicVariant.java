// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>An140BasicVariant</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>An140BasicVariant.createInstance()</code> or <code>new An140BasicVariant()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg) = <code>87</code>; </li>
 *     <li> SubCategory: TwinEngineTurboprop  = <code>22</code>; </li>
 *     <li> Specific: AntonovAn140  = <code>1</code>; </li>
 *     <li> Entity type uid: 29247; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4f2d995e. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftLargeupto255000lbs115666kg
 * @see SubCategory

 */
public final class An140BasicVariant extends EntityType
{
    /** Default constructor */
    public An140BasicVariant()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 29244, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)22); // uid 29245, Twin Engine Turboprop
        setSpecific((byte)1); // uid 29246, Antonov An-140
        setExtra((byte)1); // uid 29247, An-140 (Basic Variant)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static An140BasicVariant createInstance()
    {
            return new An140BasicVariant();
    }
}
