// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericLiferaftEnclosed</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericLiferaftEnclosed.createInstance()</code> or <code>new GenericLiferaftEnclosed()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Life-Saving Equipment = <code>101</code>; </li>
 *     <li> SubCategory: GenericLiferaft  = <code>2</code>; </li>
 *     <li> Specific: GenericLiferaftEnclosed  = <code>2</code>; </li>
 *     <li> Entity type uid: 30874; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4c03a37. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LifeSavingEquipment
 * @see SubCategory

 */
public final class GenericLiferaftEnclosed extends EntityType
{
    /** Default constructor */
    public GenericLiferaftEnclosed()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)101); // uid 30867, Life-Saving Equipment
        setSubCategory((byte)2); // uid 30872, Generic Liferaft
        setSpecific((byte)2); // uid 30874, Generic Liferaft Enclosed
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericLiferaftEnclosed createInstance()
    {
            return new GenericLiferaftEnclosed();
    }
}
