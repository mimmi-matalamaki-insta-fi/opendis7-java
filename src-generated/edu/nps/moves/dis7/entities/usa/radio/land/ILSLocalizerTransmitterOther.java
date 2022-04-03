// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ILSLocalizerTransmitterOther</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ILSLocalizerTransmitterOther.createInstance()</code> or <code>new ILSLocalizerTransmitterOther()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Instrumented Landing System (ILS) Localizer Transmitter = <code>5</code>; </li>
 *     <li> SubCategory: ILSLocalizerTransmitterOther  = <code>0</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22208; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@54f69311. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see InstrumentedLandingSystemILSLocalizerTransmitter
 * @see SubCategory

 */
public final class ILSLocalizerTransmitterOther extends EntityType
{
    /** Default constructor */
    public ILSLocalizerTransmitterOther()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 22207, Instrumented Landing System (ILS) Localizer Transmitter
        setSubCategory((byte)0); // uid 22208, ILS Localizer Transmitter, Other
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ILSLocalizerTransmitterOther createInstance()
    {
            return new ILSLocalizerTransmitterOther();
    }
}
