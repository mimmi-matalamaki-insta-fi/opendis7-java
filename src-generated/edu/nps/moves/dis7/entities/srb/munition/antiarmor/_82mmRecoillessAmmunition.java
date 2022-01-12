// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.srb.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_82mmRecoillessAmmunition</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_82mmRecoillessAmmunition.createInstance()</code> or <code>new _82mmRecoillessAmmunition()</code>. </p>
 * <ul>
 *     <li> Country: Serbia (SRB) = <code>276</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _82mmRecoillessAmmunition  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30179; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5a48d186. </p>
 * @see Country#SERBIA_SRB
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _82mmRecoillessAmmunition extends EntityType
{
    /** Default constructor */
    public _82mmRecoillessAmmunition()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 30178, Ballistic
        setSubCategory((byte)1); // uid 30179, 82mm Recoilless Ammunition
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _82mmRecoillessAmmunition createInstance()
    {
            return new _82mmRecoillessAmmunition();
    }
}
