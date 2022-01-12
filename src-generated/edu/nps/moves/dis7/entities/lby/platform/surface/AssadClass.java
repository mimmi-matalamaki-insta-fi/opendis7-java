// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lby.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AssadClass</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AssadClass.createInstance()</code> or <code>new AssadClass()</code>. </p>
 * <ul>
 *     <li> Country: Libya (LBY) = <code>126</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate(including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: AssadClass  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18923; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6e5bfdfc. </p>
 * @see Country#LIBYA_LBY
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class AssadClass extends EntityType
{
    /** Default constructor */
    public AssadClass()
    {
        setCountry(Country.LIBYA_LBY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18922, Frigate(including Corvette)
        setSubCategory((byte)1); // uid 18923, Assad Class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AssadClass createInstance()
    {
            return new AssadClass();
    }
}
