// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_826KelabangexKRIPulauRondo725</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_826KelabangexKRIPulauRondo725.createInstance()</code> or <code>new _826KelabangexKRIPulauRondo725()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: KondorIIClassPatrolDutyConfiguration  = <code>3</code>; </li>
 *     <li> Specific: _826KelabangexKRIPulauRondo725  = <code>2</code>; </li>
 *     <li> Entity type uid: 31068; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58fb7731. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _826KelabangexKRIPulauRondo725 extends EntityType
{
    /** Default constructor */
    public _826KelabangexKRIPulauRondo725()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 31038, Light/Patrol Craft
        setSubCategory((byte)3); // uid 31066, Kondor II Class (Patrol Duty Configuration)
        setSpecific((byte)2); // uid 31068, 826 Kelabang - (ex-KRI Pulau Rondo 725)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _826KelabangexKRIPulauRondo725 createInstance()
    {
            return new _826KelabangexKRIPulauRondo725();
    }
}
