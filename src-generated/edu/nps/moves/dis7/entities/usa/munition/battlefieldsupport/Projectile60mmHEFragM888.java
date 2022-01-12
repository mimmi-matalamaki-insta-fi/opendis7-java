// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Projectile60mmHEFragM888</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Projectile60mmHEFragM888.createInstance()</code> or <code>new Projectile60mmHEFragM888()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _60mm  = <code>5</code>; </li>
 *     <li> Specific: Projectile60mmHEFragM888  = <code>6</code>; </li>
 *     <li> Entity type uid: 20020; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4f3fec43. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class Projectile60mmHEFragM888 extends EntityType
{
    /** Default constructor */
    public Projectile60mmHEFragM888()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)5); // uid 20014, 60 mm
        setSpecific((byte)6); // uid 20020, Projectile, 60-mm, HE-Frag, M888
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Projectile60mmHEFragM888 createInstance()
    {
            return new Projectile60mmHEFragM888();
    }
}
