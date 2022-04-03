// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LCM13Sardine</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LCM13Sardine.createInstance()</code> or <code>new LCM13Sardine()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: Type521LCMs  = <code>1</code>; </li>
 *     <li> Specific: LCM13Sardine  = <code>2</code>; </li>
 *     <li> Entity type uid: 16565; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18bc345. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class LCM13Sardine extends EntityType
{
    /** Default constructor */
    public LCM13Sardine()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 16562, Landing Craft
        setSubCategory((byte)1); // uid 16563, Type 521 (LCMs)
        setSpecific((byte)2); // uid 16565, LCM 13 Sardine
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LCM13Sardine createInstance()
    {
            return new LCM13Sardine();
    }
}
