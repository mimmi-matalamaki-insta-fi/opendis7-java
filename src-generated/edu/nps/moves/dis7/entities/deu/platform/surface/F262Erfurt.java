// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F262Erfurt</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F262Erfurt.createInstance()</code> or <code>new F262Erfurt()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: BraunschweigClassTypeK130  = <code>2</code>; </li>
 *     <li> Specific: F262Erfurt  = <code>3</code>; </li>
 *     <li> Entity type uid: 24117; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@73dce0e6. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class F262Erfurt extends EntityType
{
    /** Default constructor */
    public F262Erfurt()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16751, Frigate
        setSubCategory((byte)2); // uid 24114, Braunschweig Class (Type K130)
        setSpecific((byte)3); // uid 24117, F 262 Erfurt
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F262Erfurt createInstance()
    {
            return new F262Erfurt();
    }
}
