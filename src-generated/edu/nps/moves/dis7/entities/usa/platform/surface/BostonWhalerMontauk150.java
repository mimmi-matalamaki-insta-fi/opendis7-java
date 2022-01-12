// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BostonWhalerMontauk150</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BostonWhalerMontauk150.createInstance()</code> or <code>new BostonWhalerMontauk150()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Private Motorboat = <code>84</code>; </li>
 *     <li> SubCategory: SmallMotorboatupto26ft79m  = <code>1</code>; </li>
 *     <li> Specific: BostonWhalerMontauk  = <code>2</code>; </li>
 *     <li> Entity type uid: 26440; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4c4c7d6c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PrivateMotorboat
 * @see SubCategory

 */
public final class BostonWhalerMontauk150 extends EntityType
{
    /** Default constructor */
    public BostonWhalerMontauk150()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 26437, Private Motorboat
        setSubCategory((byte)1); // uid 26438, Small Motorboat (up to 26ft/7.9m)
        setSpecific((byte)2); // uid 26439, Boston Whaler Montauk
        setExtra((byte)1); // uid 26440, Boston Whaler Montauk 150
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BostonWhalerMontauk150 createInstance()
    {
            return new BostonWhalerMontauk150();
    }
}
