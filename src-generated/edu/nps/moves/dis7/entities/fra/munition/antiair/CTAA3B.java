// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CTAA3B</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CTAA3B.createInstance()</code> or <code>new CTAA3B()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _40mm  = <code>5</code>; </li>
 *     <li> Specific: CasedTelescopicAmmunitionCTA  = <code>1</code>; </li>
 *     <li> Entity type uid: 29546; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@721bf7ad. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class CTAA3B extends EntityType
{
    /** Default constructor */
    public CTAA3B()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21048, Ballistic
        setSubCategory((byte)5); // uid 29544, 40mm
        setSpecific((byte)1); // uid 29545, Cased Telescopic Ammunition (CTA)
        setExtra((byte)1); // uid 29546, CTA A3B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CTAA3B createInstance()
    {
            return new CTAA3B();
    }
}
