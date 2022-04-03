// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MotorcoachScaniaIrizar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MotorcoachScaniaIrizar.createInstance()</code> or <code>new MotorcoachScaniaIrizar()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Bus = <code>82</code>; </li>
 *     <li> SubCategory: Motorcoach  = <code>10</code>; </li>
 *     <li> Specific: MotorcoachScaniaIrizar  = <code>1</code>; </li>
 *     <li> Entity type uid: 24907; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b4ee511. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Bus
 * @see SubCategory

 */
public final class MotorcoachScaniaIrizar extends EntityType
{
    /** Default constructor */
    public MotorcoachScaniaIrizar()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)82); // uid 24905, Bus
        setSubCategory((byte)10); // uid 24906, Motorcoach
        setSpecific((byte)1); // uid 24907, Motorcoach, Scania-Irizar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MotorcoachScaniaIrizar createInstance()
    {
            return new MotorcoachScaniaIrizar();
    }
}
