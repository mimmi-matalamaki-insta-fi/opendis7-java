// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P6154Elster</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P6154Elster.createInstance()</code> or <code>new P6154Elster()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: TigerClassType148  = <code>3</code>; </li>
 *     <li> Specific: P6154Elster  = <code>14</code>; </li>
 *     <li> Entity type uid: 16453; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@141e5bef. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Lightpatrolcraft
 * @see SubCategory

 */
public final class P6154Elster extends EntityType
{
    /** Default constructor */
    public P6154Elster()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 16416, Light/patrol craft
        setSubCategory((byte)3); // uid 16439, Tiger Class (Type 148)
        setSpecific((byte)14); // uid 16453, P6154 Elster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P6154Elster createInstance()
    {
            return new P6154Elster();
    }
}
