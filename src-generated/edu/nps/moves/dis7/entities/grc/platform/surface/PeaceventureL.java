// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PeaceventureL</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PeaceventureL.createInstance()</code> or <code>new PeaceventureL()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: CrudeOilTankerupto159999DWT  = <code>5</code>; </li>
 *     <li> Specific: PeaceventureL  = <code>3</code>; </li>
 *     <li> Entity type uid: 24516; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18230356. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class PeaceventureL extends EntityType
{
    /** Default constructor */
    public PeaceventureL()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24512, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24513, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)3); // uid 24516, Peaceventure L
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PeaceventureL createInstance()
    {
            return new PeaceventureL();
    }
}
