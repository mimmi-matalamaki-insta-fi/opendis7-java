// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Argos</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Argos.createInstance()</code> or <code>new Argos()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>2</code>; </li>
 *     <li> SubCategory: Communicationsatellite  = <code>1</code>; </li>
 *     <li> Specific: Argos  = <code>6</code>; </li>
 *     <li> Entity type uid: 16217; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5bf0fe62. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class Argos extends EntityType
{
    /** Default constructor */
    public Argos()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16211, Unmanned
        setSubCategory((byte)1); // uid 16212, Communication satellite
        setSpecific((byte)6); // uid 16217, Argos
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Argos createInstance()
    {
            return new Argos();
    }
}
