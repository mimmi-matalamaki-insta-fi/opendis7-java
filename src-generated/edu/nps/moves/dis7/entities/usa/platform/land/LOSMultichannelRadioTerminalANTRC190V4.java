// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LOSMultichannelRadioTerminalANTRC190V4</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LOSMultichannelRadioTerminalANTRC190V4.createInstance()</code> or <code>new LOSMultichannelRadioTerminalANTRC190V4()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Communications Facility = <code>33</code>; </li>
 *     <li> SubCategory: MobileSubscriberEquipmentMSEPlatform  = <code>1</code>; </li>
 *     <li> Specific: LOSMultichannelRadioTerminalANTRC190V4  = <code>5</code>; </li>
 *     <li> Entity type uid: 23477; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b14b60a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CommunicationsFacility
 * @see SubCategory

 */
public final class LOSMultichannelRadioTerminalANTRC190V4 extends EntityType
{
    /** Default constructor */
    public LOSMultichannelRadioTerminalANTRC190V4()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)33); // uid 10746, Communications Facility
        setSubCategory((byte)1); // uid 23472, Mobile Subscriber Equipment (MSE) Platform
        setSpecific((byte)5); // uid 23477, LOS Multichannel Radio Terminal, AN/TRC-190 (V)4
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LOSMultichannelRadioTerminalANTRC190V4 createInstance()
    {
            return new LOSMultichannelRadioTerminalANTRC190V4();
    }
}
