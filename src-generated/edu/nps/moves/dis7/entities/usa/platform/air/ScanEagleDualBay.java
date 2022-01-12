// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ScanEagleDualBay</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ScanEagleDualBay.createInstance()</code> or <code>new ScanEagleDualBay()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: BoeingScanEagle  = <code>25</code>; </li>
 *     <li> Specific: ScanEagleDualBay  = <code>2</code>; </li>
 *     <li> Entity type uid: 11268; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7197b07f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class ScanEagleDualBay extends EntityType
{
    /** Default constructor */
    public ScanEagleDualBay()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 11232, Unmanned
        setSubCategory((byte)25); // uid 11266, Boeing ScanEagle
        setSpecific((byte)2); // uid 11268, ScanEagle Dual-Bay
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ScanEagleDualBay createInstance()
    {
            return new ScanEagleDualBay();
    }
}
