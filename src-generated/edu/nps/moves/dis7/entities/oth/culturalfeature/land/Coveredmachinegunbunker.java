// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Coveredmachinegunbunker</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Coveredmachinegunbunker.createInstance()</code> or <code>new Coveredmachinegunbunker()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Prepared positions = <code>7</code>; </li>
 *     <li> SubCategory: Coveredmachinegunbunker  = <code>7</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22002; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7b52b18a. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Preparedpositions
 * @see SubCategory

 */
public final class Coveredmachinegunbunker extends EntityType
{
    /** Default constructor */
    public Coveredmachinegunbunker()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 21994, Prepared positions
        setSubCategory((byte)7); // uid 22002, Covered machine gun bunker
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Coveredmachinegunbunker createInstance()
    {
            return new Coveredmachinegunbunker();
    }
}
