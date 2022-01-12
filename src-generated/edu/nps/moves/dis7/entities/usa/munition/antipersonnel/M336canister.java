// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M336canister</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M336canister.createInstance()</code> or <code>new M336canister()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_PERSONNEL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _105mm  = <code>8</code>; </li>
 *     <li> Specific: M336canister  = <code>1</code>; </li>
 *     <li> Entity type uid: 19843; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c830ebd. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class M336canister extends EntityType
{
    /** Default constructor */
    public M336canister()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 19810, Ballistic
        setSubCategory((byte)8); // uid 19842, 105 mm
        setSpecific((byte)1); // uid 19843, M336 canister
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M336canister createInstance()
    {
            return new M336canister();
    }
}
