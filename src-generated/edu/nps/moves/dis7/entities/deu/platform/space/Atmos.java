// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Atmos</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Atmos.createInstance()</code> or <code>new Atmos()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>2</code>; </li>
 *     <li> SubCategory: Meteorologysatellite  = <code>5</code>; </li>
 *     <li> Specific: Atmos  = <code>1</code>; </li>
 *     <li> Entity type uid: 16817; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@39fcbef6. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class Atmos extends EntityType
{
    /** Default constructor */
    public Atmos()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16811, Unmanned
        setSubCategory((byte)5); // uid 16816, Meteorology satellite
        setSpecific((byte)1); // uid 16817, Atmos
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Atmos createInstance()
    {
            return new Atmos();
    }
}
