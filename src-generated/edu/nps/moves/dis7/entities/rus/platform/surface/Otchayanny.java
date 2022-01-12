// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Otchayanny</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Otchayanny.createInstance()</code> or <code>new Otchayanny()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: Sovremennyyclass  = <code>2</code>; </li>
 *     <li> Specific: Otchayanny  = <code>2</code>; </li>
 *     <li> Entity type uid: 13546; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d6ee47. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileDestroyer
 * @see SubCategory

 */
public final class Otchayanny extends EntityType
{
    /** Default constructor */
    public Otchayanny()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 13530, Guided-missile Destroyer
        setSubCategory((byte)2); // uid 13544, Sovremennyy class
        setSpecific((byte)2); // uid 13546, Otchayanny
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Otchayanny createInstance()
    {
            return new Otchayanny();
    }
}
