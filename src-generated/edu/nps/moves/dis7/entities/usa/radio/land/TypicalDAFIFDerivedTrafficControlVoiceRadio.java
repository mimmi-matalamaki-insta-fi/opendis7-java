// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TypicalDAFIFDerivedTrafficControlVoiceRadio</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TypicalDAFIFDerivedTrafficControlVoiceRadio.createInstance()</code> or <code>new TypicalDAFIFDerivedTrafficControlVoiceRadio()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Voice Transmission/Reception = <code>1</code>; </li>
 *     <li> SubCategory: VoiceTransmissionReceptionOther  = <code>0</code>; </li>
 *     <li> Specific: TypicalDAFIFDerivedTrafficControlVoiceRadio  = <code>3</code>; </li>
 *     <li> Entity type uid: 22203; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2904bc56. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see VoiceTransmissionReception
 * @see SubCategory

 */
public final class TypicalDAFIFDerivedTrafficControlVoiceRadio extends EntityType
{
    /** Default constructor */
    public TypicalDAFIFDerivedTrafficControlVoiceRadio()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 22201, Voice Transmission/Reception
        setSubCategory((byte)0); // uid 22202, Voice Transmission/Reception, Other
        setSpecific((byte)3); // uid 22203, Typical DAFIF Derived Traffic Control Voice Radio
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TypicalDAFIFDerivedTrafficControlVoiceRadio createInstance()
    {
            return new TypicalDAFIFDerivedTrafficControlVoiceRadio();
    }
}
