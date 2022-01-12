// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA21Growler9M96E</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA21Growler9M96E.createInstance()</code> or <code>new SA21Growler9M96E()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: SA21Growler  = <code>44</code>; </li>
 *     <li> Specific: SA21Growler9M96E  = <code>1</code>; </li>
 *     <li> Entity type uid: 25367; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7493d937. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class SA21Growler9M96E extends EntityType
{
    /** Default constructor */
    public SA21Growler9M96E()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 20301, Guided
        setSubCategory((byte)44); // uid 25366, SA-21 Growler
        setSpecific((byte)1); // uid 25367, SA-21 Growler (9M96E)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA21Growler9M96E createInstance()
    {
            return new SA21Growler9M96E();
    }
}
