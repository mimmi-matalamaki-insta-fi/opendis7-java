// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_40000lbsExplosive</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_40000lbsExplosive.createInstance()</code> or <code>new _40000lbsExplosive()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_PERSONNEL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Fixed = <code>3</code>; </li>
 *     <li> SubCategory: ANFO94pctammoniumnitrate6pctfueloil  = <code>1</code>; </li>
 *     <li> Specific: _40000lbsExplosive  = <code>10</code>; </li>
 *     <li> Entity type uid: 21708; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@20a1b3ae. </p>
 * @see Country#OTHER
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Fixed
 * @see SubCategory

 */
public final class _40000lbsExplosive extends EntityType
{
    /** Default constructor */
    public _40000lbsExplosive()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 21697, Fixed
        setSubCategory((byte)1); // uid 21698, AN/FO (94% ammonium nitrate, 6% fuel oil)
        setSpecific((byte)10); // uid 21708, 40 000 lbs. Explosive
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _40000lbsExplosive createInstance()
    {
            return new _40000lbsExplosive();
    }
}
