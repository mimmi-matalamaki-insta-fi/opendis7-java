// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S194U15</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S194U15.createInstance()</code> or <code>new S194U15()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional attack-torpedo patrol) = <code>5</code>; </li>
 *     <li> SubCategory: Type206A  = <code>2</code>; </li>
 *     <li> Specific: S194U15  = <code>1</code>; </li>
 *     <li> Entity type uid: 16766; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d3c5255. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalattacktorpedopatrol
 * @see SubCategory

 */
public final class S194U15 extends EntityType
{
    /** Default constructor */
    public S194U15()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16757, SS (Conventional attack-torpedo patrol)
        setSubCategory((byte)2); // uid 16765, Type 206A
        setSpecific((byte)1); // uid 16766, S 194 U 15
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S194U15 createInstance()
    {
            return new S194U15();
    }
}
