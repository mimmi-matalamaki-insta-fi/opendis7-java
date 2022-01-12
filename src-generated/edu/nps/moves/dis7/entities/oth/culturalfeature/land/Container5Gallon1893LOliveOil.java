// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Container5Gallon1893LOliveOil</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Container5Gallon1893LOliveOil.createInstance()</code> or <code>new Container5Gallon1893LOliveOil()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Obstacle = <code>5</code>; </li>
 *     <li> SubCategory: Container5Gallon1893L  = <code>31</code>; </li>
 *     <li> Specific: Container5Gallon1893LOliveOil  = <code>2</code>; </li>
 *     <li> Entity type uid: 26349; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2faf6e4a. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Obstacle
 * @see SubCategory

 */
public final class Container5Gallon1893LOliveOil extends EntityType
{
    /** Default constructor */
    public Container5Gallon1893LOliveOil()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)31); // uid 26169, Container, 5 Gallon (18.93L)
        setSpecific((byte)2); // uid 26349, Container, 5 Gallon (18.93L), Olive Oil
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Container5Gallon1893LOliveOil createInstance()
    {
            return new Container5Gallon1893LOliveOil();
    }
}
