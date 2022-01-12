// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SST3Torpedo</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SST3Torpedo.createInstance()</code> or <code>new SST3Torpedo()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SHIP</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: SST3Torpedo  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 21237; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@25e8e59. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class SST3Torpedo extends EntityType
{
    /** Default constructor */
    public SST3Torpedo()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21234, Guided
        setSubCategory((byte)3); // uid 21237, SST-3 Torpedo
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SST3Torpedo createInstance()
    {
            return new SST3Torpedo();
    }
}
