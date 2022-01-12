// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Projectile152mmConcretePiercing</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Projectile152mmConcretePiercing.createInstance()</code> or <code>new Projectile152mmConcretePiercing()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _152mm  = <code>19</code>; </li>
 *     <li> Specific: Projectile152mmConcretePiercing  = <code>5</code>; </li>
 *     <li> Entity type uid: 20851; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16b64a03. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class Projectile152mmConcretePiercing extends EntityType
{
    /** Default constructor */
    public Projectile152mmConcretePiercing()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)19); // uid 20846, 152 mm
        setSpecific((byte)5); // uid 20851, Projectile, 152-mm, Concrete Piercing
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Projectile152mmConcretePiercing createInstance()
    {
            return new Projectile152mmConcretePiercing();
    }
}
