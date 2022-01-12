// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ModernizedKobbenclasstype207</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ModernizedKobbenclasstype207.createInstance()</code> or <code>new ModernizedKobbenclasstype207()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional attack-torpedo patrol) = <code>5</code>; </li>
 *     <li> SubCategory: ModernizedKobbenclasstype207  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 16787; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@75f95314. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalattacktorpedopatrol
 * @see SubCategory

 */
public final class ModernizedKobbenclasstype207 extends EntityType
{
    /** Default constructor */
    public ModernizedKobbenclasstype207()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16757, SS (Conventional attack-torpedo patrol)
        setSubCategory((byte)5); // uid 16787, Modernized Kobben class (type 207)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ModernizedKobbenclasstype207 createInstance()
    {
            return new ModernizedKobbenclasstype207();
    }
}
