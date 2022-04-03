// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_90mmPansarvarnspjas1110Pvpj1110Pv1110</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_90mmPansarvarnspjas1110Pvpj1110Pv1110.createInstance()</code> or <code>new _90mmPansarvarnspjas1110Pvpj1110Pv1110()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Towed Artillery = <code>5</code>; </li>
 *     <li> SubCategory: _90mmPansarvarnspjas1110Pvpj1110Pv1110  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 33027; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@52d6d273. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TowedArtillery
 * @see SubCategory

 */
public final class _90mmPansarvarnspjas1110Pvpj1110Pv1110 extends EntityType
{
    /** Default constructor */
    public _90mmPansarvarnspjas1110Pvpj1110Pv1110()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 17476, Towed Artillery
        setSubCategory((byte)4); // uid 33027, 90mm Pansarvarnspjas 1110 (Pvpj 1110 / Pv-1110)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _90mmPansarvarnspjas1110Pvpj1110Pv1110 createInstance()
    {
            return new _90mmPansarvarnspjas1110Pvpj1110Pv1110();
    }
}
