// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>K173Krasnoyarsk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>K173Krasnoyarsk.createInstance()</code> or <code>new K173Krasnoyarsk()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSGN (Nuclear Guided Missile) = <code>2</code>; </li>
 *     <li> SubCategory: OscarIIClass  = <code>1</code>; </li>
 *     <li> Specific: K173Krasnoyarsk  = <code>1</code>; </li>
 *     <li> Entity type uid: 27191; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b7a52dd. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSGNNuclearGuidedMissile
 * @see SubCategory

 */
public final class K173Krasnoyarsk extends EntityType
{
    /** Default constructor */
    public K173Krasnoyarsk()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)2); // uid 14771, SSGN (Nuclear Guided Missile)
        setSubCategory((byte)1); // uid 14772, Oscar II Class
        setSpecific((byte)1); // uid 27191, K-173 Krasnoyarsk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static K173Krasnoyarsk createInstance()
    {
            return new K173Krasnoyarsk();
    }
}
