// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SEPWheeled6x6</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SEPWheeled6x6.createInstance()</code> or <code>new SEPWheeled6x6()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: SEPSplitterskyddadEnhetsplattformModularArmouredVehicleThor  = <code>5</code>; </li>
 *     <li> Specific: SEPWheeled6x6  = <code>2</code>; </li>
 *     <li> Entity type uid: 27682; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d497a91. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class SEPWheeled6x6 extends EntityType
{
    /** Default constructor */
    public SEPWheeled6x6()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 17470, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 27681, SEP (Splitterskyddad Enhetsplattform) Modular Armoured Vehicle / Thor
        setSpecific((byte)2); // uid 27682, SEP Wheeled 6x6
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SEPWheeled6x6 createInstance()
    {
            return new SEPWheeled6x6();
    }
}
