// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.cyp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Fulmar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Fulmar.createInstance()</code> or <code>new Fulmar()</code>. </p>
 * <ul>
 *     <li> Country: Cyprus (CYP) = <code>55</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: CrudeOilTankerupto159999DWT  = <code>5</code>; </li>
 *     <li> Specific: Fulmar  = <code>1</code>; </li>
 *     <li> Entity type uid: 24506; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4efac082. </p>
 * @see Country#ACKNOWLEDGE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class Fulmar extends EntityType
{
    /** Default constructor */
    public Fulmar()
    {
        setCountry(Country.ACKNOWLEDGE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24504, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24505, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)1); // uid 24506, Fulmar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Fulmar createInstance()
    {
            return new Fulmar();
    }
}
