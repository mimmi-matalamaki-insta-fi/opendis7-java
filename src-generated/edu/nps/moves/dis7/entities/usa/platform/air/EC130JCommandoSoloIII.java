// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EC130JCommandoSoloIII</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EC130JCommandoSoloIII.createInstance()</code> or <code>new EC130JCommandoSoloIII()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: LockheedC130Model382Hercules  = <code>1</code>; </li>
 *     <li> Specific: EC130JCommandoSoloIII  = <code>30</code>; </li>
 *     <li> Entity type uid: 10905; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18e4674d. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class EC130JCommandoSoloIII extends EntityType
{
    /** Default constructor */
    public EC130JCommandoSoloIII()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 10867, Cargo/Tanker
        setSubCategory((byte)1); // uid 10868, Lockheed C-130 (Model 382) Hercules
        setSpecific((byte)30); // uid 10905, EC-130J Commando Solo III
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EC130JCommandoSoloIII createInstance()
    {
            return new EC130JCommandoSoloIII();
    }
}
