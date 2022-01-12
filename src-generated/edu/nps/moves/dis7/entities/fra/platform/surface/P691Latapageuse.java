// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P691Latapageuse</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P691Latapageuse.createInstance()</code> or <code>new P691Latapageuse()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: P400classfastattackcraftpatrol  = <code>1</code>; </li>
 *     <li> Specific: P691Latapageuse  = <code>10</code>; </li>
 *     <li> Entity type uid: 15973; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d5620ce. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Lightpatrolcraft
 * @see SubCategory

 */
public final class P691Latapageuse extends EntityType
{
    /** Default constructor */
    public P691Latapageuse()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 15962, Light/patrol craft
        setSubCategory((byte)1); // uid 15963, P 400 class (fast attack craft--patrol)
        setSpecific((byte)10); // uid 15973, P 691 La tapageuse
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P691Latapageuse createInstance()
    {
            return new P691Latapageuse();
    }
}
