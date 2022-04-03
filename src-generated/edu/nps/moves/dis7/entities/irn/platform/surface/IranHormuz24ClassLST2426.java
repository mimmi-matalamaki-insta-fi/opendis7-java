// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>IranHormuz24ClassLST2426</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>IranHormuz24ClassLST2426.createInstance()</code> or <code>new IranHormuz24ClassLST2426()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank Landing Ship = <code>10</code>; </li>
 *     <li> SubCategory: IranHormuz24ClassLST  = <code>2</code>; </li>
 *     <li> Specific: _2426  = <code>1</code>; </li>
 *     <li> Entity type uid: 18103; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6273c5a4. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankLandingShip
 * @see SubCategory

 */
public final class IranHormuz24ClassLST2426 extends EntityType
{
    /** Default constructor */
    public IranHormuz24ClassLST2426()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 18098, Tank Landing Ship
        setSubCategory((byte)2); // uid 18102, Iran Hormuz 24 Class (LST)
        setSpecific((byte)1); // uid 18103, 24-26
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static IranHormuz24ClassLST2426 createInstance()
    {
            return new IranHormuz24ClassLST2426();
    }
}
