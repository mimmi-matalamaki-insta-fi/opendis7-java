// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DF26SeparatedWarhead</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DF26SeparatedWarhead.createInstance()</code> or <code>new DF26SeparatedWarhead()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>STRATEGIC</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: DF26  = <code>43</code>; </li>
 *     <li> Specific: DF26SeparatedWarhead  = <code>2</code>; </li>
 *     <li> Entity type uid: 32785; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34d9df9f. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class DF26SeparatedWarhead extends EntityType
{
    /** Default constructor */
    public DF26SeparatedWarhead()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21556, Guided
        setSubCategory((byte)43); // uid 32783, DF-26
        setSpecific((byte)2); // uid 32785, DF-26 Separated Warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DF26SeparatedWarhead createInstance()
    {
            return new DF26SeparatedWarhead();
    }
}
