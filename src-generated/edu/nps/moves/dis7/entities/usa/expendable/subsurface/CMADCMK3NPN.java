// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CMADCMK3NPN</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CMADCMK3NPN.createInstance()</code> or <code>new CMADCMK3NPN()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Active Emitter = <code>4</code>; </li>
 *     <li> SubCategory: CMADCMK3  = <code>6</code>; </li>
 *     <li> Specific: CMADCMK3NPN  = <code>3</code>; </li>
 *     <li> Entity type uid: 22285; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3856d0cb. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ActiveEmitter
 * @see SubCategory

 */
public final class CMADCMK3NPN extends EntityType
{
    /** Default constructor */
    public CMADCMK3NPN()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 22272, Active Emitter
        setSubCategory((byte)6); // uid 22282, CM ADC MK 3
        setSpecific((byte)3); // uid 22285, CM ADC MK 3 NPN
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CMADCMK3NPN createInstance()
    {
            return new CMADCMK3NPN();
    }
}
