// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1onegallonchemicalmine</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1onegallonchemicalmine.createInstance()</code> or <code>new M1onegallonchemicalmine()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_PERSONNEL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Fixed = <code>3</code>; </li>
 *     <li> SubCategory: M1onegallonchemicalmine  = <code>13</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19881; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@21ea1d9d. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Fixed
 * @see SubCategory

 */
public final class M1onegallonchemicalmine extends EntityType
{
    /** Default constructor */
    public M1onegallonchemicalmine()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 19863, Fixed
        setSubCategory((byte)13); // uid 19881, M1 one-gallon chemical mine
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1onegallonchemicalmine createInstance()
    {
            return new M1onegallonchemicalmine();
    }
}
