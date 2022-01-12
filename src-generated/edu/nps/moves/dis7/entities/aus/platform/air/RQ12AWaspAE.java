// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RQ12AWaspAE</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RQ12AWaspAE.createInstance()</code> or <code>new RQ12AWaspAE()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: AeroVironmentWasp  = <code>3</code>; </li>
 *     <li> Specific: RQ12AWaspAE  = <code>1</code>; </li>
 *     <li> Entity type uid: 30038; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71c7db30. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class RQ12AWaspAE extends EntityType
{
    /** Default constructor */
    public RQ12AWaspAE()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 24066, Unmanned
        setSubCategory((byte)3); // uid 30037, AeroVironment Wasp
        setSpecific((byte)1); // uid 30038, RQ-12A Wasp AE
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RQ12AWaspAE createInstance()
    {
            return new RQ12AWaspAE();
    }
}
