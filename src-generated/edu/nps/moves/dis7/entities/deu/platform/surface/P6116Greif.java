// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P6116Greif</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P6116Greif.createInstance()</code> or <code>new P6116Greif()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: AlbatrosClassType143143B  = <code>2</code>; </li>
 *     <li> Specific: P6116Greif  = <code>6</code>; </li>
 *     <li> Entity type uid: 16434; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2bb3058. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Lightpatrolcraft
 * @see SubCategory

 */
public final class P6116Greif extends EntityType
{
    /** Default constructor */
    public P6116Greif()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 16416, Light/patrol craft
        setSubCategory((byte)2); // uid 16428, Albatros Class (Type 143/143B)
        setSpecific((byte)6); // uid 16434, P6116 Greif
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P6116Greif createInstance()
    {
            return new P6116Greif();
    }
}
