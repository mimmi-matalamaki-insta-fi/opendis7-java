// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KamAZ53949TyphoonKw6P58Kord127mmMG</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KamAZ53949TyphoonKw6P58Kord127mmMG.createInstance()</code> or <code>new KamAZ53949TyphoonKw6P58Kord127mmMG()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: KamAZ53949TyphoonK  = <code>44</code>; </li>
 *     <li> Specific: KamAZ53949TyphoonKw6P58Kord127mmMG  = <code>2</code>; </li>
 *     <li> Entity type uid: 34311; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@226eba67. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class KamAZ53949TyphoonKw6P58Kord127mmMG extends EntityType
{
    /** Default constructor */
    public KamAZ53949TyphoonKw6P58Kord127mmMG()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)44); // uid 34309, KamAZ-53949 Typhoon-K
        setSpecific((byte)2); // uid 34311, KamAZ-53949 Typhoon-K w/ 6P58 Kord 12.7mm MG
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KamAZ53949TyphoonKw6P58Kord127mmMG createInstance()
    {
            return new KamAZ53949TyphoonKw6P58Kord127mmMG();
    }
}