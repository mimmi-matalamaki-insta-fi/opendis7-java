// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SAGEMSperwerGroundControlStation</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SAGEMSperwerGroundControlStation.createInstance()</code> or <code>new SAGEMSperwerGroundControlStation()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Command, Control, Communications, and Intelligence (C3I) System = <code>29</code>; </li>
 *     <li> SubCategory: SAGEMSperwerUAVSystem  = <code>1</code>; </li>
 *     <li> Specific: SAGEMSperwerGroundControlStation  = <code>1</code>; </li>
 *     <li> Entity type uid: 27998; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2eea88a1. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CommandControlCommunicationsandIntelligenceC3ISystem
 * @see SubCategory

 */
public final class SAGEMSperwerGroundControlStation extends EntityType
{
    /** Default constructor */
    public SAGEMSperwerGroundControlStation()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)29); // uid 27996, Command, Control, Communications, and Intelligence (C3I) System
        setSubCategory((byte)1); // uid 27997, SAGEM Sperwer UAV System
        setSpecific((byte)1); // uid 27998, SAGEM Sperwer Ground Control Station
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SAGEMSperwerGroundControlStation createInstance()
    {
            return new SAGEMSperwerGroundControlStation();
    }
}
