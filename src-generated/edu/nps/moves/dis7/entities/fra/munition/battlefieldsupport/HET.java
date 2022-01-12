// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HET</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HET.createInstance()</code> or <code>new HET()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _105mm  = <code>8</code>; </li>
 *     <li> Specific: HET  = <code>1</code>; </li>
 *     <li> Entity type uid: 24030; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a55fb81. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class HET extends EntityType
{
    /** Default constructor */
    public HET()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21159, Ballistic
        setSubCategory((byte)8); // uid 21167, 105 mm
        setSpecific((byte)1); // uid 24030, HE-T
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HET createInstance()
    {
            return new HET();
    }
}
