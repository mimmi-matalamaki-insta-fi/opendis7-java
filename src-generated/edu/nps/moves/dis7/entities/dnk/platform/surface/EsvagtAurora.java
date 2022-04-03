// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EsvagtAurora</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EsvagtAurora.createInstance()</code> or <code>new EsvagtAurora()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Support Vessel = <code>83</code>; </li>
 *     <li> SubCategory: EmergencyResponseandRescueVesselERRV  = <code>9</code>; </li>
 *     <li> Specific: EsvagtAurora  = <code>3</code>; </li>
 *     <li> Entity type uid: 32586; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2767e23c. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SupportVessel
 * @see SubCategory

 */
public final class EsvagtAurora extends EntityType
{
    /** Default constructor */
    public EsvagtAurora()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)83); // uid 32582, Support Vessel
        setSubCategory((byte)9); // uid 32583, Emergency Response and Rescue Vessel (ERRV)
        setSpecific((byte)3); // uid 32586, Esvagt Aurora
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EsvagtAurora createInstance()
    {
            return new EsvagtAurora();
    }
}
