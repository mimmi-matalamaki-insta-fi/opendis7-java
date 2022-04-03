// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GAZ233034R145BMA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GAZ233034R145BMA.createInstance()</code> or <code>new GAZ233034R145BMA()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: GAZ233034SPM1  = <code>27</code>; </li>
 *     <li> Specific: GAZ233034R145BMA  = <code>3</code>; </li>
 *     <li> Entity type uid: 34205; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b15f922. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class GAZ233034R145BMA extends EntityType
{
    /** Default constructor */
    public GAZ233034R145BMA()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 12854, Small Wheeled Utility Vehicle
        setSubCategory((byte)27); // uid 34202, GAZ-233034 SPM-1
        setSpecific((byte)3); // uid 34205, GAZ-233034 R-145BMA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GAZ233034R145BMA createInstance()
    {
            return new GAZ233034R145BMA();
    }
}
