// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ZenitexGorizontmod</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ZenitexGorizontmod.createInstance()</code> or <code>new ZenitexGorizontmod()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Samaraclassnavalsurvey  = <code>32</code>; </li>
 *     <li> Specific: ZenitexGorizontmod  = <code>12</code>; </li>
 *     <li> Entity type uid: 14050; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25cd49a4. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class ZenitexGorizontmod extends EntityType
{
    /** Default constructor */
    public ZenitexGorizontmod()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)32); // uid 14038, Samara class (naval survey)
        setSpecific((byte)12); // uid 14050, Zenit (ex-Gorizont) (mod)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ZenitexGorizontmod createInstance()
    {
            return new ZenitexGorizontmod();
    }
}
