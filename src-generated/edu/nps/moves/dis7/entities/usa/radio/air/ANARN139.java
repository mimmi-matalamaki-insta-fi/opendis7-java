// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANARN139</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANARN139.createInstance()</code> or <code>new ANARN139()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Tactical Air Navigation (TACAN) Transmitter/Receiver (Moving Platform Equipment) = <code>12</code>; </li>
 *     <li> SubCategory: JointElectronicsTypeDesignationSystemJETDSNonspecificSeries  = <code>1</code>; </li>
 *     <li> Specific: ANARN139  = <code>2</code>; </li>
 *     <li> Entity type uid: 30441; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c8fe8ad. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TacticalAirNavigationTACANTransmitterReceiverMovingPlatformEquipment
 * @see SubCategory

 */
public final class ANARN139 extends EntityType
{
    /** Default constructor */
    public ANARN139()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)12); // uid 27005, Tactical Air Navigation (TACAN) Transmitter/Receiver (Moving Platform Equipment)
        setSubCategory((byte)1); // uid 27006, Joint Electronics Type Designation System (JETDS) Non-specific Series
        setSpecific((byte)2); // uid 30441, AN/ARN-139
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANARN139 createInstance()
    {
            return new ANARN139();
    }
}
