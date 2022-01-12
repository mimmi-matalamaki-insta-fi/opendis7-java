// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Hwasong5ScudB</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Hwasong5ScudB.createInstance()</code> or <code>new Hwasong5ScudB()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Hwasong5ScudB  = <code>24</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32507; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4b4927e5. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Hwasong5ScudB extends EntityType
{
    /** Default constructor */
    public Hwasong5ScudB()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32499, Guided
        setSubCategory((byte)24); // uid 32507, Hwasong-5 (Scud-B)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Hwasong5ScudB createInstance()
    {
            return new Hwasong5ScudB();
    }
}
