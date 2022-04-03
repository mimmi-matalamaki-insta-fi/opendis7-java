// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TPT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TPT.createInstance()</code> or <code>new TPT()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _35mm  = <code>1</code>; </li>
 *     <li> Specific: TPT  = <code>7</code>; </li>
 *     <li> Entity type uid: 21733; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35e689a0. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class TPT extends EntityType
{
    /** Default constructor */
    public TPT()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21725, Ballistic
        setSubCategory((byte)1); // uid 21726, 35 mm
        setSpecific((byte)7); // uid 21733, TP-T
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TPT createInstance()
    {
            return new TPT();
    }
}
