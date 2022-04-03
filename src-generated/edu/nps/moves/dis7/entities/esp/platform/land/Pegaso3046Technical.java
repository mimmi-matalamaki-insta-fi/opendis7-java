// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.esp.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Pegaso3046Technical</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Pegaso3046Technical.createInstance()</code> or <code>new Pegaso3046Technical()</code>. </p>
 * <ul>
 *     <li> Country: Spain (ESP) = <code>198</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle - (0-1.25 tons) = <code>6</code>; </li>
 *     <li> SubCategory: Pegaso3046  = <code>1</code>; </li>
 *     <li> Specific: Pegaso3046Technical  = <code>1</code>; </li>
 *     <li> Entity type uid: 24130; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1921994e. </p>
 * @see Country#SPAIN_ESP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle0125tons
 * @see SubCategory

 */
public final class Pegaso3046Technical extends EntityType
{
    /** Default constructor */
    public Pegaso3046Technical()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 24128, Small Wheeled Utility Vehicle - (0-1.25 tons)
        setSubCategory((byte)1); // uid 24129, Pegaso 3046
        setSpecific((byte)1); // uid 24130, Pegaso 3046 Technical
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Pegaso3046Technical createInstance()
    {
            return new Pegaso3046Technical();
    }
}
