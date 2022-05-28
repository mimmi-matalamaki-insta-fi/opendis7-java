// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Meteoriod</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Meteoriod.createInstance()</code> or <code>new Meteoriod()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Debris = <code>10</code>; </li>
 *     <li> SubCategory: Meteoriod  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 33115; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@55f8669d. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Debris
 * @see SubCategory

 */
public final class Meteoriod extends EntityType
{
    /** Default constructor */
    public Meteoriod()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)10); // uid 33114, Debris
        setSubCategory((byte)1); // uid 33115, Meteoriod
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Meteoriod createInstance()
    {
            return new Meteoriod();
    }
}