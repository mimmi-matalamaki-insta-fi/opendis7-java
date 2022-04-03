// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Gremyashchiy</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Gremyashchiy.createInstance()</code> or <code>new Gremyashchiy()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: Sovremennyyclass  = <code>2</code>; </li>
 *     <li> Specific: Gremyashchiy  = <code>10</code>; </li>
 *     <li> Entity type uid: 13554; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43b40233. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileDestroyer
 * @see SubCategory

 */
public final class Gremyashchiy extends EntityType
{
    /** Default constructor */
    public Gremyashchiy()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 13530, Guided-missile Destroyer
        setSubCategory((byte)2); // uid 13544, Sovremennyy class
        setSpecific((byte)10); // uid 13554, Gremyashchiy
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Gremyashchiy createInstance()
    {
            return new Gremyashchiy();
    }
}
