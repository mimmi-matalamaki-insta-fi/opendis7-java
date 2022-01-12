// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Finikclassnavalsurvey401</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Finikclassnavalsurvey401.createInstance()</code> or <code>new Finikclassnavalsurvey401()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Finikclassnavalsurvey  = <code>33</code>; </li>
 *     <li> Specific: _401  = <code>20</code>; </li>
 *     <li> Entity type uid: 14072; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2903c6ff. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class Finikclassnavalsurvey401 extends EntityType
{
    /** Default constructor */
    public Finikclassnavalsurvey401()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)33); // uid 14052, Finik class (naval survey)
        setSpecific((byte)20); // uid 14072, 401
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Finikclassnavalsurvey401 createInstance()
    {
            return new Finikclassnavalsurvey401();
    }
}
